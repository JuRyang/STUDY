package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EX_배열뒤집기 {

    /*
        정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
        num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
num_list	            result
[1, 2, 3, 4, 5]	        [5, 4, 3, 2, 1]
[1, 1, 1, 1, 1, 2]	    [2, 1, 1, 1, 1, 1]
[1, 0, 1, 1, 1, 3, 5]	[5, 3, 1, 1, 1, 0, 1]
     */


    public static int [] solution(int[] n) {

        int [] result = n;
        int [] answer = new int [n.length];

        for(int i = 0; i < n.length; i++){
            answer[n.length -1 -i] = result[i];

        }
        System.out.println(Arrays.toString(answer));


        return answer;
    }



    

    public static void main(String[] args) {
        /*psvm 단축키 */
        Scanner scan = new Scanner(System.in);
        int []  message = {1,2,3,4,5};

        solution(message);

    }

}
