package PCCP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class EX_1_동영상재생기 {

    /*
    *
    *   첫째 줄에 다음 세 가지 중 하나를 출력한다.
        A가 B보다 큰 경우에는 '>'를 출력한다.
        A가 B보다 작은 경우에는 '<'를 출력한다.
        A와 B가 같은 경우에는 '=='를 출력한다.

    *
    * */

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("mm:ss");

        String video_len = "34:33";
        String pos = "13:00";
        String op_start = "00:55";
        String op_end = "02:55";
        String [] commands = {"next", "prev"};


        solution(video_len,pos,op_start, op_end,commands);


    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) throws ParseException {
        String answer = "00:00";
        //동영상의 길이 video_len :34:33
        //직전의 재생위치 pos :13:00
        //오프닝 시작 시각 op_start :00:55
        //오프닝이 끝나는 시각 op_end : 02:55
        //prev 10초 전 , next 10초 후
        String prev = "prev";
        String next = "next";


        SimpleDateFormat format = new SimpleDateFormat("mm:ss");
        Date video_lenDate1 = format.parse(video_len);  //영상 길이
        Date posDate1 = format.parse(pos); //직전 재생위치
        Date op_start1 = format.parse(op_start); // 오프닝 시작
        Date op_end1 = format.parse(op_end); // 오프닝 끝
        Date result = format.parse(pos);




        System.out.println(format.format(result));

        for(int i= 0; i < commands.length; i++ ){
            System.out.println(commands[i]);

            if(prev.equals(commands[i])){
                System.out.println(" i["+i+"] >>" +prev);

                if(op_start1.before(posDate1)){

                    result = format.parse("00:00");
                    System.out.println(format.format(result));

                }else if (posDate1.after(op_end1) && posDate1.before(op_end1)){

                    System.out.println(" i["+i+"] >>" +prev);


                    result = op_end1;
                   // System.out.println(format.format(result.setTime(10)) );
                }else{

                }


            }else if (next.equals(commands[i])){
                posDate1.setSeconds(10);
                System.out.println(format.format(result) +":"+i);

            }

        }

        System.out.println(format.format(result));

        return answer;
    }







    public static String solution2(String video_len, String pos, String op_start, String op_end, String[] commands) throws ParseException {
        String answer = "00:00";
        //동영상의 길이 video_len :34:33
        //직전의 재생위치 pos :13:00
        //오프닝 시작 시각 op_start :00:55
        //오프닝이 끝나는 시각 op_end : 02:55
        //prev 10초 전 , next 10초 후
        String prev = "prev";
        String next = "next";
        String tenmm = "00:10";


        SimpleDateFormat format = new SimpleDateFormat("mm:ss");
        Date video_lenDate1 = format.parse(video_len);  //영상 길이
        Date posDate1 = format.parse(pos); //직전 재생위치
        Date op_start1 = format.parse(op_start); // 오프닝 시작
        Date op_end1 = format.parse(op_end); // 오프닝 끝
        Date result = format.parse(answer);

        Date reset = format.parse(answer);

        Date tensecond = format.parse(tenmm);






        System.out.println(format.format(result));

        for(int i= 0; i < commands.length; i++ ){

            // 커맨드가 이전이야? 그럼 현재 재생시간에 -10
            //커맨크가 다으밍야? 그럼 현재 시간에 +10
            if(prev.equals(commands[i])){
                posDate1.setDate(-10);

            } else if (next.equals(commands[i])){
                posDate1.setTime((10));
            }
            result = posDate1;

            //계산결과값이  10초미만이야 ? 그럼 00 : 00

            if(result.before(tensecond)){
                result = reset;
            }
            //계산결과값이 영상 끝나기 10초 미만이야? 그 동영상 길이를 출력해
            //계산결과값이 op_start ≤ 현재 재생 위치 ≤ op_end)인 경우 자동으로 오프닝이 끝나는 위치로 이동





        }

        System.out.println(format.format(result));

        return answer;
    }





}
