package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class EX_중앙값구하기 {

    /*
        중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
        예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 arrayay가 매개변수로 주어질 때,
        중앙값을 return 하도록 solution 함수를 완성해보세요.

       arrayay	            result
        [1, 2, 7, 10, 11]	7
        [9, -1, 0]      	0
     */


    public static int solution(int[] array) {

        int sum = 0;
        int n = array.length;
        Arrays.sort(array);
        int answer = array[n/2];
        System.out.println(array[n/2]);  //방법 1


        int temp;
        for(int i=0; i<array.length-1; i++){
            for(int j=0; j<array.length-1-i; j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }

        }
        answer = array[n/2];
        System.out.println("answer:"+answer); //방법 2




        return answer;
    }
    

    public static void main(String[] args) {
        /*psvm 단축키 */
        int []  message = {1, 2, 7, 10, 11};

        solution(message);

    }

}
