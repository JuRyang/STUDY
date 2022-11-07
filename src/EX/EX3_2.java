package EX;/*--------------------------------------------------------------
 * ����ð� ��ȭ �ùķ��̼�
 * TLIMIT : �� �ùķ��̼� ���� �ð�
 * TIME   : �ùķ��̼��� ����ð�(���� : ��)
 * TSTEP  : �ùķ��̼� ���� ���� �ð�
 * TPUMP  : ���� ���� ����ð�(���� : ��)
 * PRARR  : ���� 1�г��� ������ Ȯ��
 * MEAN   : ������� �Ǽ��� ����
 * STDEV  : ǥ�������� �ǹ��ϴ� �Ǽ��� ����
 * AVEQUE : ������ queue �� ��ձ���
 * TOTQUE : ������ queue �� ��ü �� (����ü ���� �� ���ð�)
 * TOTARR : ������ �� ����
 *-------------------------------------------------------------*/
import java.lang.*;
import java.io.*;

class Queueing {
      final static int SEED = 35213;
      static float up, liters;
      public String StrTime = new String();

      public int random(int np, double u){
              np = np * 843314861 + 453816693;
              if(np < 0){
                      np = np + 2147483647;
                      np = np + 1;
              }
              up = (float)(np * 0.4656612e-9);
              return np;
      }

      public int normal(int np, float mean, float std, float lp){
              int i = 0;
              float sum = 0, u;

              while(i < 12) {
                      np = random(np, up);
                      sum = sum + up;
                      ++i;
              }
              liters = mean + (sum - 6.0f) * std;
              return np;
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
              int seed, nseed, queue = 0, totque = 0, totarr=0, arrive, tstep = 1;
              float nmean = 20, stdev = 3;
              double prarr=1.0/4.0, tpump=0.0, tlimit=100, time=0.0, aveque=0;

              seed = SEED;
              nseed = SEED;

              PrintWriter out=null;

              try {
                  File f=new File("C:\\WORK\\EX3_2.OUT");
                  FileWriter fw=new FileWriter(f) ;
                  BufferedWriter bw=new BufferedWriter(fw);
                  out=new PrintWriter(bw);

                  out.println("   SIMULATION FOR A QUEUEING SYSTEM ");
                  out.println("======================================");
                  out.println(" THE TIME STEP                 = " + tstep);
                  out.println(" THE TIME LIMIT                = " + (int)tlimit);
                  out.println(" THE ARRIVAL PROBABILITY       = " + (double)((int)(prarr*100))/100);
                  out.println(" THE NORMAL MEAN               = " + (int)nmean);
                  out.println(" THE NORMAL STANDARD DEVIATION = " + (int)stdev);
                  out.println(" THE SEED                      = " + seed);
                  out.println("--------------------------------------");
                  out.println(" TIME   ARRIVAL   QUEUE    TPUMP");
                  out.println("--------------------------------------");

                  while(time < tlimit) {
                          time = time + tstep;
                          arrive = 0;
                          seed = random(seed, up);
                          if(up < (prarr*tstep)) {
                                  arrive = 1;
                                  queue = queue + arrive;
                                  totarr = totarr + 1;
                          }
                          if(tpump > 0.0) {
                                  tpump = tpump - tstep;
                                  if(tpump < 0.0)
                                        tpump = 0.0;
                          }
                          if(tpump==0 && queue!=0) {
                                  queue = queue - 1;
                                  nseed = normal(nseed, nmean, stdev, liters);
                                  tpump = 1.0 + 1.0 / 8.0 * liters;
                          }
                          totque = totque + queue;
                          ConvDataToString((int)time);
                          out.println(" " + StrTime + "       " + arrive + "        " + queue + "      " + (double)(((int)(tpump*10000000))/10000000.0));
                  }
                  aveque = totque / (tlimit*tstep);
                  out.println("------------------------------------");
                  out.println(" MEAN QUEUE LENGTH = " + aveque);
                  out.println(" THE TOTAL ARRIVAL = " + totarr);
                } catch(IOException ioe) { }
                  finally {
                       if (out != null) out.close();
                  }
      }
}

public class EX3_2 {
        public static void main(String[] args){
                Queueing g = new Queueing();
                g.ComputeQueueing();
        }
}
