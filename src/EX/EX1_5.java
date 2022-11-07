package EX; /**
 * �ֻ��� �ùķ��̼�
 * seed   : ������ �ʱⰪ���� 9965
 * COUNT  : �� ���ڵ��� ����Ƚ���� ����ϱ� ���� �迭
 * side   : �ֻ����� ����, �� 1..6
 * U      : [0,1)������ �Ͼ������ ����
 * nrolls : ����Ƚ��
 */
import java.lang.*;
import java.io.*;

class Rolling {
       final static int nrolls=3000;
       final static int SEED=9965;
       public float up;
       public int count[] = new int[6];

       public Rolling() {
               int i;
               for(i=0; i<5; ++i) count[i]=0;
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

       public void ComputeRolling(){
               int i, side, n=SEED;
               PrintWriter out=null;

               i = 0;
               while (i < nrolls) {
                      n = random(n, up);
                      side = (int) Math.floor(up * 6);
                      count[side] = count[side] + 1;
                      i++;
               }

               try {
                   File f = new File("C:\\WORK\\EX1_5.OUT");
                   FileWriter fw = new FileWriter(f);
                   BufferedWriter bw = new BufferedWriter(fw);
                   out = new PrintWriter(bw);

                   out.println("==========================");
                   out.println("      THE STATISTICS");
                   out.println("==========================");
                   for (i = 0; i < 6; ++i)
                        out.println(" SIDE " + (i + 1) + " OCCURED " + count[i] + " TIMES");
               } catch(IOException ioe) { }
                 finally {
                       if (out != null) out.close();
                 }
       }
}

public class EX1_5 {
       public static void main(String[] args) {
                   Rolling r = new Rolling();
                   r.ComputeRolling();
  }
}