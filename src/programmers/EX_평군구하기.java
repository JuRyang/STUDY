package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class EX_평군구하기 {

    /**
        정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

        제한사항
        arr은 길이 1 이상, 100 이하인 배열입니다.
        arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
        입출력 예
        arr	return
        [1,2,3,4]	2.5
        [5,5]	5
    * */
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    public static double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i< arr.length; i++){
            sum += arr[i];
            answer = sum / arr.length;
        }
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        /*psvm 단축키 */

        int [] a = {1,2,3,4};
        //int [] a = {4,4};
        solution(a);

        System.out.println();




    }

}
