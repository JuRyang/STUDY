import java.util.Scanner;

public class EX_20220516 {
    public static void main(String[] args) {
        //첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
        /*
        10870번 피보나치 수5
        피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
        이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.
        n=17일때 까지 피보나치 수를 써보면 다음과 같다.
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

        n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
       입력 10 -> 출력 3628800
            0 -> 1
         */
        Scanner scan = new Scanner(System.in);
        int x =  scan.nextInt();
        number(x);
        System.out.println(number(x));

    }
    public static int number(int N) {
        if(N <= 0) return 0;	// 재귀 종료조건
        int sum =0;
        return  sum = number(N-1)+N;
    }
}
