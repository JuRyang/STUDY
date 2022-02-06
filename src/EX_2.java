import java.util.Scanner;

public class EX_2 {
    public static void main(String[] args) {
//        pvmc 단축

        Scanner scan = new Scanner(System.in);


        //백준 8393 합
        //n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
        //입력 3 출력 6
        int n = scan.nextInt();
        int sum = 0;

        for(int i = 1; i <= n; i++ ){
            sum += i;
        }
        System.out.println(sum);


        //백준 10950 A+B-3
        // 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        // 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        int T = scan.nextInt();
        System.out.println(T);
        for(int i=0; i < T; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();

            System.out.println(A+B);
        }



//        백준 2739 구구단
//        N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.


        int a = scan.nextInt();
        int b;
        for(int i =1; i<10; i++){
            b = a * i;
            System.out.println(a +"*"+ i +"=" + b);
        }






    }
}
