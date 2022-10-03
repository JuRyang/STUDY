import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EX_20221002 {

//        백준 10828번 스택
//        정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
//
//        명령은 총 다섯 가지이다.
//
//        push X: 정수 X를 스택에 넣는 연산이다.
//        pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//        size: 스택에 들어있는 정수의 개수를 출력한다.
//        empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
//        top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int  X = scan.nextInt();

    System.out.println(X);
    String str = scan.next();
    System.out.println(str);

    // 아래 만든 메소드를 불러오는 구현해야댐


}

   //정수를 저장하는 스택
    int X; //scanner를 이용해서 배열 공간 입력 받음
    int[]  stack = new int [X];
    int size = 0; // 스택에 들어있는 정수의 개수

    //  push X: 정수 X를 스택에 넣는 연산이다.
    void push (int num){
        stack[size] = num;
        size++;
    }

    //pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    int pop (){
        if(size == 0 || stack == null ){
            return  -1;
        }else{
            int y = stack[size - 1];
            stack[size--] = 0;
            return y;
        }
    }

    //size: 스택에 들어있는 정수의 개수를 출력한다.
    int size (){
        return size;
    }
    //empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
    int empty(){
        if(size == 0){
            return 1;
        }
        return 0;
    }
    //top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    int top (){
        if(size == 0){
            return -1;
        }else{
            int z = stack[size];
            return z;
        }
    }

}

