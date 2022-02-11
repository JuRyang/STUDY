import java.util.Scanner;

//while
public class EX_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //psvm

        //1110번
        /*
        0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
        먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
        그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
        26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
        위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
        N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오
         */
        int cnt = 0;
        int x = scan.nextInt(); //26
        int y = x;
        //int y = scan.nextInt();
        while (true){
            int i = x / 10; //값 2
            int u = x % 10; //나머지 6
            // 2 + 6 = 8 ---> i+u
            // 6 * 10 + 2 + 6 = 68
            // (u * 10)/ + (i + u) % 10 =14


            //i + u 10 이상이면

            int result = u * 10 + (i + u) % 10;
            cnt++;
            if(x == result){
                System.out.println(cnt);
                break;
            }


        }




        //10951번
        //입력은 여러 개의 테스트 케이스로 이루어져 있다.
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

        /*
        입력
        1 1
        2 3
        3 4
        9 8
        5 2
        출력
        2
        5
        7
        17
        7
         */
//        while (true){
//            int c = scan.nextInt();
//            int d = scan.nextInt();
//            System.out.println(c+d);
//        }
        //입력받는 값이 있는지 확인 하는 방법 : hasNextInt(), hasNext()
        while (scan.hasNextInt()){
            int c = scan.nextInt();
            int d = scan.nextInt();
            System.out.println(c+d);
        }

        //10952번
        //두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        /*
        입력
        1 1
        2 3
        3 4
        9 8
        5 2
        0 0
        출력
        2
        5
        7
        17
        7
         */

//        while (true){
//            int a = scan.nextInt();
//            int b = scan.nextInt();
//            if( a == 0 && b == 0){
//                scan.close();
//                break;
//            }
//            System.out.println(a+b);
//

//        }
    }
}
