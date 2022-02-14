import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class EX_20220214 {
    public static void main(String[] args) {
        //psvm
        /*
        두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
        예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
        수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
         */
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[10];
        int num = arr[0];
        int cnt = 0;
        boolean bl;
        for(int i = 0; i < arr.length; i++) {
            int a = scan.nextInt();
            int b = a % 42;
            arr[i] = b;
        }

        for(int i = 0; i< arr.length; i++) {
            bl = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    bl = true;
                    break;
                }
            }
            if (bl == false) {
                bl = true;
                break;
            }
        }

        System.out.println(cnt);
    }
}
