package EX;/*--------------------------------------------------------------
 * �̻��� �ùķ��̼�
 * ����â�� : 1��
 * �������� : ���� �����ð� ������ ��� 1�� ���������̴�.
 * �������� : ����ð��� ��� 0.5���� ���������̴�.
 * �������� : �ùķ��̼��� �����ð��� �տ���ó�� �ð����� ���� �ʰ�
 *           ��߻���� Ƚ���� 1,000������ �Ѵ�.
 * SEED    : ���������� ���� Ȯ������ �ʱⰪ
 * NSEED   : ����ð��� ���� Ȯ������ �ʱⰪ
 * MARRVT  : ��� �������� �ð�(5.0)
 * MSERVT  : ��� ����ð�(2.5)
 * NUMCUS  : ���縦 ���� ���� ��
 * TOTQUE  : ��ü ������ �� ���ð�
 * TOTARR  : �� ����
 * AVGWT   : ���� ��� ���ð�
 *-------------------------------------------------------------*/
import java.lang.*;
import java.io.*;

class DiscreteQueueing {
        public int status, totarr, next, queue, numcus, seed, nseed;
        public float marrvt, mservt, totque, time, tlevnt, e_arr, e_dep, up;
        public float tne[] = new float[3];
        public PrintWriter out=null;

        public DiscreteQueueing(){
                time = 0.0f;
                status = 0;
                queue = 0;
                tlevnt = 0;
                numcus = 0;
                totque = 0;
                seed = 35213;
                nseed = seed;

                try {
                    File f = new File("C:\\WORK\\EX3_4.OUT");
                    FileWriter fw = new FileWriter(f);
                    BufferedWriter bw = new BufferedWriter(fw);
                    out = new PrintWriter(bw);
                } catch(IOException ioe) {}
        }

        public float expon(int type, int np, float rmean, float ep){
                np = np * 843314861 + 453816693;
                if (np < 0) {
                        np = np + 2147483647;
                        np = np + 1;
                }

                if(type == 1) seed = np;
                else nseed = np;

                up = (float) (np * 0.4656612e-9);
                ep = -(rmean) * (float)Math.log(up);
                return ep;
        }

        public void init(){
                e_arr = expon(1, seed, marrvt, e_arr);
                tne[1] = time * e_arr;
                tne[2] = 1.0e+30f;
        }

        //DETERMINE TIME & NEXT EVENT
        // IF NEXT=1, ARRIVE
        // IF NEXT=2, DEPART
        public void timing(){
                float rmin;

                if(tne[1] <= tne[2]) {
                      rmin = tne[1];
                      next = 1;
                }
                else {
                      rmin = tne[2];
                      next = 2;
                }

                if(rmin >= 1.e+29)
                      out.println("EVENT LIST EMPTY");
                time = tne[next];
        }

        //ARRIVE EVENT ROUTINE
        public void arrive(){
                e_arr = expon(1, seed, marrvt, e_arr);
                tne[1] = time + e_arr;
                if(status == 0) {
                       numcus = numcus + 1;
                       status = 1;
                       e_dep = expon(2, nseed, mservt, e_dep);
                       tne[2] = time + e_dep;
                }
                else {
                       totque = totque + queue * (time - tlevnt);
                       tlevnt = time;
                       queue = queue + 1;
                       if(queue > 100)
                               out.println("OVERFLOW OF THE QUEUE");
                }
        }

        //DEPART EVENT ROUTINE
        //STATUS = 0 : SERVER IDLE
        //STATUS = 1 : SERVER BUSY
        public void depart() {
                if(queue <= 0) {
                        status = 0;
                        tne[2] = 1.3e+30f;
                }
                else {
                        totque = totque + queue * (time - tlevnt);
                        tlevnt = time;
                        queue = queue - 1;
                        numcus = numcus + 1;
                        e_dep = expon(2, nseed, mservt, e_dep);
                        tne[2] = time + e_dep;
                }
        }

        //OUTPUT FORMAT
        public void report() {
                float avgwt, avgque;

                out.println("=================================================");
                out.println("         SIMULATION FOR A QUEUEING SYSTEM");
                out.println("          SINGLE-SERVER QUEUEING SYSTEM");
                out.println("=================================================");
                out.println(" TIME LIMIT : NUMBER OF CUSTOMERS   = " + totarr);
                out.println(" EXPONENTIAL MEAN INTERARRIVAL TIME = " + marrvt + " MINUTES");
                out.println(" EXPONENTIAL MEAN SERVICE TIME      = " + mservt + " MINUTES");

                avgwt = totque / totarr;
                avgque = totque / time;

                out.println("-------------------------------------------------");
                out.println(" MEAN WAITING TIME = " + avgwt + " MINUTES");
                out.println(" MEAN QUEUE LENGTH = " + avgque);
                out.println(" TOTQUE = " + totque);
                out.println(" TIME   = " + time);
        }

        public void ComputeDiscreteQueueing(){
                marrvt = 5.0f;
                mservt = 2.5f;
                totarr = 1000;

                init();
                while(numcus < totarr) {
                       timing();
                       if(next == 1) arrive();
                       else depart();
                }
                report();
                if(out != null) out.close();
        }
}

public class EX3_4 {
        public static void main(String[] args){
                DiscreteQueueing g = new DiscreteQueueing();
                g.ComputeDiscreteQueueing();
        }
}