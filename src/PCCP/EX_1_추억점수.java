package PCCP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class EX_1_추억점수 {


    public static void main(String[] args) throws ParseException {


        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};


        solution(name, yearning, photo);
//[19, 15, 6]

    }


    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];
        Map<String, Integer> list = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            list.put(name[i], yearning[i]);
        }

        //System.out.println(list.entrySet());
        //System.out.println(Arrays.toString(photo[1]));


        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            System.out.println(Arrays.toString(photo[i]));
            for (int j = 0; j < photo[i].length; j++) {

                for (Map.Entry<String, Integer> entry : list.entrySet()) {
                    if (entry.getKey().equals(photo[i][j])) {

                        System.out.println(entry.getKey() + " , " + entry.getValue());
                        sum += entry.getValue();

                        // System.out.println(sum +"a");
                    }

                }

            }
            answer[i] = sum;

        }


        System.out.println(answer.toString());
        return answer;
    }


}
