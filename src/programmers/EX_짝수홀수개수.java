package programmers;

import java.util.Scanner;

public class EX_짝수홀수개수 {

    /*
        정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

        num_list	        result
        [1, 2, 3, 4, 5]	[2, 3]
        [1, 3, 5, 7]	[0, 4]
     */


    public static int[] solution(int[] num_list) {

        int a = 0;
        int b = 0;
        for(int data : num_list){
            if(data % 2 == 0){
                a++;
            }else if(data % 2 != 0){
                b++;
            }
        }
        int[] answer = {a,b};



        return answer;
    }

    public static int[] solution2(int[] num_list) {

        int[] answer = {};
        for(int data : num_list){
            if(data % 2 == 0){
                answer[0]++;
            }else if(data % 2 != 0){
                answer[1]++;
            }
        }




        return answer;
    }
    

    public static void main(String[] args) {
        /*psvm 단축키 */
        Scanner scan = new Scanner(System.in);
        int [] message = {1, 2, 3, 4, 5};

        solution(message);

    }

}
