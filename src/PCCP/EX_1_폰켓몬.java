package PCCP;

import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class EX_1_폰켓몬 {


    public static void main(String[] args) throws ParseException {


        int[] arr = {3,3,3,2,2,4};
        solution(arr);

    }


    public static int[] solution(int[] arr) {
        int[] answer = {};

        Map<Integer, Integer> list = new HashMap<>();
        for(int a = 0; a < arr.length; a++){
            list.put(arr[a], arr.length/2);
        }

        Math.min(list.keySet().size(), arr.length/2);



        return answer;
    }


}
