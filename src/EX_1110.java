import java.util.Scanner;

public class EX_1110 {

    public static void main(String[] args) {
/*
        https://www.acmicpc.net/problem/1110

          0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
          먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
          그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

        26부터 시작한다. 2+6 = 8이다.
        int n = 26
        int m;
        int cnt = 0 ;
        int a = 26 / 10 = 2
                m / 10 = a
        int b = 26 % 10 = 6
                m % 10 = b


        b*10 + a = 68 = int x

        새로운 수는 68이다. 6+8 = 14이다.
                        (a + b)%10;

        int a = 68 / 10 = 6
        int b = 68 % 10 = 8

        새로운 수는 84이다. 8+4 = 12이다.
        b * 10 + (a+b)%10

        b*10 + a = 84 = int x

       int a = 84


        새로운 수는 42이다. 4+2 = 6이다.
        새로운 수는 26이다.

        위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

        N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

        입력
        첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.

        출력
        첫째 줄에 N의 사이클 길이를 출력한다.

        예제
        입력 1 / 출력 1
        26 / 4

        예제

        입력 2 / 출력 2
        55 / 3

        5+5 = 10
        50
        5+0 = 5
        5 * 10 =
        예제

        입력 3 / 출력 3
        1 / 60

        예제 입력 4 / 출력 4
        0 / 1
        0 * 10 = 0


        */


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = n;
        int count = 0;

        while(true){
            int a = x / 10;
            int b = x % 10;
            x = b * 10 + (a + b) % 10;
            count++;
            if(n == x){
                break;
            }
        }

        System.out.println(count);

    }

}
