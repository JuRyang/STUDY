
import java.util.*;

public class EX_20220221_2 {
    public static void main(String[] args) {
        //psvm
        /* 8958번 OX퀴즈
        "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
        문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
        "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
        OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
        5
        OOXXOXXOOO          10
        OOXXOOXXOO           9
        OXOXOXOXOXOXOX       7
        OOOOOOOOOO          55
        OOOOXOOOOXOOOOX     30
         */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        List<String> list = new ArrayList<>();
        String [] info = new String[x];

        for(int i =0; i< info.length; i++) {
//            List<String> y = Collections.singletonList(scan.next());
//            list.add(String.valueOf(y));
            info[i] = scan.next();
        }
            // split 함수에 공백문자를 지정
          //  String[] strArray = info[i].split("");
           // for(String s : strArray) {
                 //System.out.println(s);

        for(int i =0; i< info.length; i++) {
            int cnt = 0;
            int sum = 0;

                for(int j =0; j< info[i].length(); j++){
                    if (info[i].charAt(j) =='O') {

                        cnt++;

                    } else {
                        cnt=0;
                    }
                    sum += cnt;

                }

           // }

            System.out.println(sum+"답");

        }

    }
}
