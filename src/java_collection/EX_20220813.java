package java_collection;

import java.util.HashMap;
import java.util.Scanner;

public class EX_20220813 {

    public static void main(String[] args) {
        /*psvm 단축키 */
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<N; i++){
            int a = scan.nextInt();
            map.put(i,a);


        }


        int M = scan.nextInt();
        //상근이가 가지고 있는 카드
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i =0; i<M; i++){
            int b = scan.nextInt();
            map2.put(i,b);

        }

        for(int i =0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(map.get(i).equals(map2.get(j))){
                    int count;
            }


            }

        }

    }

}
