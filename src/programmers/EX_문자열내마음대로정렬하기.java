package programmers;

import java.util.*;

public class EX_문자열내마음대로정렬하기 {
    /**
     * 2023. 01. 01

     문제 설명
     문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
     예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.

     입출력 예
     strings	                n	        return
     ["sun", "bed", "car"]	    1	    ["car", "bed", "sun"]
     ["abce", "abcd", "cdx"]	2	    ["abcd", "abce", "cdx"]
     * @return
     */

    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for(int i=0; i<strings.length; i++) {
            map.put(i, strings[i].substring(n, n+1));
        }
        System.out.println(map.keySet()+" , "+map.entrySet());

        String[] str = new String[strings.length];

        for(int j=0; j<map.size(); j++) {
            str[j] = map.get(j);
        }
        System.out.println(Arrays.toString(str));

        Arrays.sort(str);

        for(int k=0; k<map.size(); k++) {
            List<Integer> keyList = new ArrayList<Integer>();

            for(Map.Entry<Integer, String> entry : map.entrySet()){
                if(entry.getValue().equals(str[k]) ){

                    keyList.add(entry.getKey());
                }
            }
            if(keyList.size() == 1) {
                answer[k] = strings[keyList.get(0)];

                System.out.println(answer[k]);
            } else {
                String[] s = new String[keyList.size()];
                for(int t=0; t<keyList.size(); t++) {
                    s[t] = strings[keyList.get(t)];
                }
                Arrays.sort(s);
                for(int t=0; t<s.length;t++) {
                    answer[k++] = s[t];
                }
                k--;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
//        String  [] a = {"sun", "bed", "car"};
//        int n = 1;
        String  [] a = {"abce", "abcd", "cdx"};
        int n = 2;

        solution(a,n);

    }
}
