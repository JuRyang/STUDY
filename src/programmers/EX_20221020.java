package programmers;

import java.util.Scanner;

public class EX_20221020 {

    /*
    *최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
    * 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
                            array	            result
                            [1, 2, 3, 3, 3, 4]	    3
                            [1, 1, 2, 2]	        -1
                            [1]	                    1
    *
    * */


    public static int solution(int[] array) {
        int answer = 0;
        int [] index = new int[array.length];
        int temp ;
        int min = 0;
        int max = Integer.MIN_VALUE;


        for(int i = 0; i <array.length; i++){
            index[array[i]]++;

        }
        //먼저 최댓값 구하기
        for(int i = 0; i < array.length; i++){
            if(max < index[i]){
                max = index[i];
                min = i;
            }

        }
        System.out.println("최빈값: "+ min + "," + max+"번");   //최빈값이 두개이상일 경우 로직 모르겠이ㅏㅓㅁㄹ아늩

        /*

public int solution(int[] array) {
        Arrays.sort(array);

        int answer = 0;
        int max = 0;
        int maxNum = array[0];
        int cnt = 1;

        for (int i = 1; i < array.length; i++) {
            if(array[i] == array[i-1]) {
                cnt++;
                if(cnt > max) {
                    max = cnt;
                    maxNum = array[i];
                }
                else if(cnt == max) {
                    maxNum = -1;
                }
            }
            else{
                cnt = 1;
            }
        }
        answer = maxNum;

        return answer;
    }
        * */
        return answer;
    }
    public static void main(String[] args) {
        /*psvm 단축키 */
        Scanner scan = new Scanner(System.in);
        int [] denum1 = {1, 2, 3, 3, 3, 4};

        solution(denum1);
        // denum1/ num1   denum2/num2



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
