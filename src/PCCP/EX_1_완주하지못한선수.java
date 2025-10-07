package PCCP;

import java.text.ParseException;
import java.util.*;


public class EX_1_완주하지못한선수 {


    public static void main(String[] args) throws ParseException {

        /**
         * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
         *
         * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
         * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
         *
         * participant	completion	return
         * ["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
         * ["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
         * ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
         *
         * */

        String [] participant = {"mislav", "stanko", "mislav", "ana"};
        String [] completion = {"stanko", "ana", "mislav"};
        solution3(participant,completion);

    }


    public static String solution3(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        System.out.println("P : " +Arrays.toString(participant));
        Arrays.sort(completion);
        System.out.println("c : " +Arrays.toString(completion));


        for(int i =0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                System.out.println(participant[i]);
                return participant[i];
            }
        }

        System.out.println(participant[participant.length-1]);
        return participant[participant.length-1];
    }

    public static String solution2(String[] participant, String[] completion) {
        String answer = "";

       // List<String> lis = new ArrayList<>();
        Map<String, Integer> list = new HashMap<>();
        for(String p : participant){
            list.put(p,list.getOrDefault(p,0)+1);
        }

        for(String c : completion){
            int n = list.get(c)-1;
            if(n == 0){
                list.remove(c);
            }else{
                list.put(c,n);
            }
        }


        return list.keySet().iterator().next();
    }
        //효율성 체크에서 타임아웃 남.,
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        List<String> lis = new ArrayList<>();
        for(String p : participant){
            lis.add(p);

        }

        for(String c : completion){
            for(String a : lis){
                if(a.equals(c)){
                    lis.remove(a);
                    break;
                }
            }

        }

        System.out.println(lis.get(0));

        return lis.get(0);
    }


}
