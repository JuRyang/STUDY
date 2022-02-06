import java.util.Scanner;

public class EX_1 {

    /*
    *
    *   첫째 줄에 다음 세 가지 중 하나를 출력한다.
        A가 B보다 큰 경우에는 '>'를 출력한다.
        A가 B보다 작은 경우에는 '<'를 출력한다.
        A와 B가 같은 경우에는 '=='를 출력한다.

    *
    * */

    public static void main(String[] args) {
        /*psvm 단축키 */
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        if(A > B){
            System.out.println(">");
        }else if(A < B){
            System.out.println("<");
        }else if(A == B){
            System.out.println("==");
        }


        /*
        * 시험 점수를 입력받아
        * 90 ~ 100점은 A, 80 ~ 89점은
        * B, 70 ~ 79점은 C, 60 ~ 69점은 D,
        * 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
        *
        * */
//        Scanner scan = new Scanner(System.in);
        int AA = scan.nextInt();

        if(100 == AA || AA >= 90){
            System.out.println("A");
        }else if(89 <= AA || AA >= 80){
            System.out.println("B");
        }else if(79 <= AA || AA >= 70){
            System.out.println("C");
        }else if(69 <= AA || AA >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }


        /*
        *연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
        윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
        예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
        1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
        하지만, 2000년은 400의 배수이기 때문에 윤년이다.
        * */
        if(A % 4 == 0 && A % 100 != 0 || A % 400 == 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
//        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(x > 0 && y > 0){
            System.out.println("1");
        }else if(x < 0 && y < 0){
            System.out.println("3");
        }else if(x < 0 && y > 0){
            System.out.println("2");
        }else if(x > 0 && y < 0){
            System.out.println(4);
        }


        /*

        상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.
        상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.
        이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.
        바로 "45분 일찍 알람 설정하기"이다.
        이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다.
        어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다.
        이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.
        현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.
        첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
        입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다.
        시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

        입력 10 10   0 30     23 40
        출력 9 25    23 45    22 55

        * */

        int h = scan.nextInt();
        int m = scan.nextInt();

        if(m < 45){
            h--;
            m = 60 - (45 - m);
            if(h < 0){
                h = 23;
            }

            System.out.println(h + " " +m);
        }else{
            System.out.println(h + " " +(m-45));
        }


    }

}
