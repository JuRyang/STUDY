import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EX_6 {
    public static void main(String[] args) {
        //psvm
        //10818번 최대 최소
        //N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
        Scanner scan = new Scanner(System.in);



//        //풀이 2
        int N = scan.nextInt();
        int [] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        //오름차순으로 정렬 하는 메소드
        System.out.println(arr[0]+","  +arr[N-1]);


        // 풀이 1 (내가 푼 풀이)
        int x = scan.nextInt();
        int[] q = new int[x];

        for(int i = 0; i<q.length; i++){
            int y = scan.nextInt();
            q[i] = y;

        }
        int min = q[0];
        int max = q[0];
        for(int num :q){
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        System.out.println("최대값"+max);
        System.out.println("최소값"+min);


    }
}
