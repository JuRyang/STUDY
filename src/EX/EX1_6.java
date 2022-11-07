package EX; /**
 * ����â�� ������ �ùķ��̼�
 * tpump : ���� ���� ����ð�(���� : ��)
 * queue : �ٿ��� ��ٸ��� �ִ� ���(����) ��, �������� ����
 * prarr : ���� 1�г��� ������ Ȯ��
 * arrive : 0 = ���� �������� ���� ���
 *          1 = ���� ������ ���
 * time : �ùķ��̼��� ����ð�(���� : ��)
 * tstep : �ùķ��̼� ���� �����ð�
 * tlimit : �� �ùķ��̼� ����ð�
 * toarr : ������ �� ����
 * totque : ������ queue�� ��ü ��(=��ü ���� �� ���ð�0
 * aveque : ������ queue�� ��ձ���
 * seed : ������ �ʱⰪ
 */
import java.lang.*;
import java.io.*;

class SingleQueueing {
        final static int SEED=35213;
        public int n, seed, p;
        public float up, mean;
        public String StrTime = new String();

        public SingleQueueing(){
                mean = 4;
                seed = SEED;
                n = SEED;
        }

        public int random(int np, float u){
                np = np * 843314861 + 453816693;
                if(np < 0){
                        np = np + 2147483647;
                        np = np + 1;
                }
                up = (float)(np * 0.4656612e-9);
                return np;
        }

        public int poissn(int np, int pp){
                float b, prod;

                pp = 0;
                b = (float)(Math.exp(-mean));

                prod = 1;
                n = random(np, up);
                prod = prod * up;

                while(prod >= b){
                        n = random(n, up);
                        prod = prod * up;
                        ++pp;
                }
                return pp;
        }

        public void ConvDataToString(int time){
               int i, len;

               StrTime = "";
               StrTime = StrTime.valueOf(time);
               len = StrTime.length();
               if(len < 3)
                    for(i = 0; i < (3-len); i++)
                         StrTime = "0" + StrTime;
        }

        public void ComputeQueueing(){
                int queue = 0, totque = 0, time=0, totarr=0, arrive, tstep = 1;
                double prarr=1.0/4.0, tpump=0.0, tlimit=100, aveque=0, avetime=0;
                PrintWriter out=null;

                try {
                    File f=new File("C:\\WORK\\EX1_6.OUT");
                    FileWriter fw=new FileWriter(f) ;
                    BufferedWriter bw=new BufferedWriter(fw);
                    out=new PrintWriter(bw);

                    out.println("SIMULATION FOR A QUEUEING SYSTEM");
                    out.println("=================================");
                    out.println("THE TIME STEP           = " + tstep);
                    out.println("THE TIME LIMIT          = " + tlimit);
                    out.println("THE ARRIVAL PROBABILITY = " + prarr);
                    out.println("THE POISSON MEAN        = " + (int)mean);
                    out.println("THE SEED                = " + seed);
                    out.println("=================================");
                    out.println("TIME    ARRIVAL    QUEUE    TPUMP");
                    out.println("---------------------------------");

                    while(time < tlimit) {
                        time = time + tstep;
                        arrive = 0;
                        seed = random(seed, up);

                        if(up < prarr*tstep) {
                                arrive = 1;
                                queue = queue + arrive;
                                totarr = totarr + 1;
                        }
                        if(tpump > 0.0) {
                                tpump = tpump-tstep;
                                if(tpump < 0)
                                         tpump = 0;
                        }
                        if(tpump==0 && queue!=0) {
                                queue = queue - 1;
                                p = poissn(n, p);
                                tpump = p;
                        }
                        totque = totque + queue;
                        ConvDataToString(time);
                        out.println(" " + StrTime + "      " + arrive + "          " + queue + "        " + (int)tpump);
                    }
                    aveque = totque / (tlimit*tstep);

                    out.println("---------------------------------");
                    out.println("MEAN QUEUE LENGTH  = " + aveque);
                    out.println("THE TOTAL ARRIVALS = " + totarr);
                } catch(IOException ioe) { }
                  finally {
                     if (out != null) out.close();
                  }
        }
}

public class EX1_6 {
        public static void main(String[] args){
                SingleQueueing g = new SingleQueueing();
                g.ComputeQueueing();
        }
}
