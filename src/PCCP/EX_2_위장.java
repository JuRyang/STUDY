package PCCP;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class EX_2_위장 {


    public static void main(String[] args) throws ParseException {

        //String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        String[][] clothes = {{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}};

        //모자 2 눈 1 -> 3*2 = 6 -1 = 5
        solution(clothes);


    }


    public static int solution2(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> list = new HashMap<>();
        int cnt =1;
        for(String[] a : clothes){
            list.put(a[1],list.getOrDefault(a[1],0) + 1);
        }

        var iter = list.values().iterator();
        while(iter.hasNext()){
            answer *= iter.next() + 1 ;

        }

        System.out.println();


        return answer-1;
    }


    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String,Integer> list = new HashMap<>();
        int cnt =1;
        for(String[] a : clothes){
            System.out.println(Arrays.toString(a));
            list.put(a[1],cnt++);
        }

        System.out.println("list" + list.entrySet());

//개초딩 코드넹...,
        for(int a : list.values()){
            if(list.size() == 1){
                answer = a;

                return answer;
            }else {
                answer = answer * a;
            }
        }
            answer = answer -1;


        return answer;
    }


}
