import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class EX_20220213 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //psvm
        /*2577번 숫자의 개수
        세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
        예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
        계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
         */
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int num = a * b* c;

        int [] arrNum = new int[10];
        int [] count = new int[10];

        arrNum = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
//        System.out.print(Arrays.toString(arrNum));
//        System.out.println(arrNum.length+"arrlength");
//        System.out.println(Arrays.toString(count)+"cnt");


        for(int i = 0; i < arrNum.length; i++){
            count[arrNum[i]]++;
            System.out.println(count[arrNum[i]]+"cnt[i]");
        }

        System.out.println();
        for(int i = 0; i < 10; i++){
            System.out.println(i+"의 개수:"+count[i]);
        }
    }
}
