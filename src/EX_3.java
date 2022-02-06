import java.io.*;
import java.util.StringTokenizer;

public class EX_3 {
    public static void main(String[] args) throws IOException {
        //pvsm 단축
        // Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
        // BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
        /*

        BufferedReader
        :Scanner와 유사.

        Bufferedwriter
        :System.out.println();과 유사

        둘은 모두 기존에 쓰던 scanner와 System.out.println()보다 속도 측면에서 훨씬 빠르기 때문에
        (입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임)
        많은 양의 데이터를 처리할 때 유리하다.

        하지만 그에 비해 BufferdReader은 Enter만 경계로 인식하고 받은 데이터 String으로 고정되기 때문에 입력받은 데이터를 가공하는 작업이 필요한 경우가 많다.
         */

        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        //String a = bf.readLine(); //String
        //int b = Integer.parseInt(bf.readLine()); //int

        //readLine(); 메서드 활용한다 여기서 두가지를 기억해야한다.
        //1. readLine() 리턴값을 String으로 고정되므로 String이 아닌 타입은 형변환을 해야된다.
        //2. 예외처리를 꼭 해줘야한다.
        // readLine을 할때마다 try & catch를 활용하여 예외처리를 해주어도 되지만
        // 대개 throws IOException을 통하여 작업한다

        //StringTokenizer st = new StringTokenizer(a); //StringTokenizer 인자 값에 입력 문자열 넣어줌

        //int x = Integer.parseInt(st.nextToken());
        //int y = Integer.parseInt(st.nextToken());
        
        //String array[] = a.split(""); //배열에 공백단위로 끊어서 데이터를 넣고 사용하는 방식

        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //할당된 버퍼에 값 넣어주기
        //String s = "adfad"; //출력할 문자열
        //bw.write(s+"\n"); //버퍼에 있는 값 전부 출력
        //bw.flush(); //남아있는 데이터를 모두 출시킴
        //bw.close(); //스트림을 닫음

        //BufferedWriter의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush(), close() 호출해줘야된다.

        //bw.write에는 System.out.println();과 같이 자동개행기능이 없기때문에
        // 개행을 해주어야할 경우에는 \n를 통해 따로 처리해주어야 한다
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            st = new StringTokenizer(br.readLine(),"");
          //  bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())));
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');

        }
        bw.close();

 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine()," ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append('\n');
        }
        br.close();

        System.out.println(sb);

    }
}