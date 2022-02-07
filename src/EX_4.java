import java.util.Scanner;

public class EX_4 {
    public static void main(String[] args) {
        //psvm

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();  //10
        //10871번 X보다 작은 수
        //첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
        //둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
        //입력
        // 10 5
        //1 10 4 9 2 3 8 5 7 6
        //출력
        //1 4 2 3
        int X = scan.nextInt(); //5
        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
        }
      //  scan.close();

        for(int i = 0; i<N; i++){
            if(arr[i] < X){
                System.out.print(arr[i]+" ");
            }
        }


        //출력방식이 틀림   배열에 담아서 비교하자!!
        for(int i =0; i <N; i++){
            int u = scan.nextInt();
            if(X > u){
                System.out.println(u);
            }

        }



        //2439번 별찍기 -2
        /*
                입력 : 5
                     *
                    **
                   ***
                  ****
                 *****
         */
        for(int i=1; i<= N; ++i){
            for(int j = 1; j<= N-i; ++j){
                System.out.print(" ");
            }
            for(int j=1; j<= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }



        //2438번 별찍기
        //첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
        /*
        입력 : 5
        출력
        *
        **
        ***
        ****
        *****
         */
        int e = scan.nextInt();
        for(int i=1; i <= e; ++i){
            for(int j=1; j <= i; ++j){
                System.out.print("*");
            }
            System.out.println();
        }
        //11022번 A+B-8
        //각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
        /*
        입력
        5
        1 1
        2 3
        3 4
        9 8
        5 2
        출력
        Case #1: 1 + 1 = 2
        Case #2: 2 + 3 = 5
        Case #3: 3 + 4 = 7
        Case #4: 9 + 8 = 17
        Case #5: 5 + 2 = 7
         */
        int k = scan.nextInt();
        for(int i = 1; i <= k; i++){
            int c = scan.nextInt();
            int d = scan.nextInt();
            System.out.println("Case #"+i+ " : " +c+ "+" + d + "=" + (c+d));
        }

        //11021번 A+B-7
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        int x = scan.nextInt();

        for(int i=1; i<=x; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a+b;
            System.out.println("case #"+i+":"+ c);
        }

        //자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
        //첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
        // 백준 2741번 N 찍기


        int n = scan.nextInt();

        for(int i=1; i <=n; i++){
            System.out.println(i);
        }

        //2742번 기찍 N
        //자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
        int m = scan.nextInt();
        for( int i = 0; i < m; i++){
            System.out.println(m-i);
        }



    }
}
