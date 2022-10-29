package programmers;

import java.util.Scanner;

public class EX_양꼬치 {

    /*
        머쓱이네 양꼬치 가게는 10인분을 먹으면 음료수 하나를 서비스로 줍니다.
        양꼬치는 1인분에 12,000원, 음료수는 2,000원입니다.
        정수 n과 k가 매개변수로 주어졌을 때,
        양꼬치 n인분과 음료수 k개를 먹었다면 총얼마를 지불해야 하는지 return 하도록 solution 함수를 완성해보세요.

        n	k	result
        10	3	124,000
        64	6	768,000
     */


    public static int solution(int n, int k) {
        int answer = 0;

        //10분을 먹으면
        if(n  / 10 > 0 ){
            int i = n  / 10;
            k -=i;
            answer = (n * 12000) + (k * 2000);
            System.out.println("answer:"+answer);

        }else{
            answer = (n * 12000) + (k * 2000);
        }


        return answer;
    }


    // 다른 사람 코드 ---- 코드를 단순하게 구현해봐야겠따..
    public int solution2(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }

    public static void main(String[] args) {
        /*psvm 단축키 */
        Scanner scan = new Scanner(System.in);
        int denum1 = 64;
        int height  = 6;

        solution(denum1 , height);

    }

}
