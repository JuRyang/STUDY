package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class EX_20221019 {

    /*
    *
         첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
    *    두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
                            denum1	num1	denum2	num2	result
                            1	2	3	4	[5, 4]
                            9	2	1	3	[29, 6]
    *
    * */


    public static int getGcd(int a, int b) {
        if(a%b==0) {
            return b;
        }
        return getGcd(b, a%b);
    }

    public static void main(String[] args) {
        /*psvm 단축키 */
        Scanner scan = new Scanner(System.in);
        int denum1 = scan.nextInt();
        int num1 = scan.nextInt();
        int denum2 = scan.nextInt();
        int num2 = scan.nextInt();
        // denum1/ num1   denum2/num2


        denum1 = denum1 * num2 + denum2  * num1 ;
        num1 = num1 * num2;
        int gcd= getGcd(denum1, num1); //최대공약수를 구해준다.

        int [] result = new int[2];
        result[0] = denum1/gcd;
        result[1] = num1/gcd;

        System.out.println(Arrays.toString(result)); //기약분수 출력
//        int denum1 = scan.nextInt();
//        int num1 = scan.nextInt();
//        int denum2 = scan.nextInt();
//        int num2 = scan.nextInt();
//
//        denum1 = denum1 * num2 + denum1  * num1 ;
//        num1 = num1 * num2;
//
//        int gcd= getGcd(denum1, num1); //최대공약수를 구해준다.
//
//
//        System.out.println(denum1/gcd+" "+num1/gcd); //기약분수 출력
//
//
//        int[] answer = new int[2];
//        double x = (double)denum1 / num1;
//        System.out.println("x:"+x);
//        double y = (double)denum2 / num2;
//        System.out.println("y:"+y);
//        double sum = x + y;
//        System.out.println("sum:"+sum);


//        answer[0]  = (int) sum / 1;
//        answer[1]  =  (int) sum % 1;


    }

}
