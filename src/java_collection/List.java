package java_collection;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class List {

    /*
    * set (HashSet, TreeSet) : 무질서 순서X , 데이터 중복 X
    *
    * List (LinkedList, Vector, ArrayList) : 순서가 있고 데이터 중복 허용
    *
    * Queue (LinkedList, PriorityQueue) :List와 유사
    *
    * Map (Hashtable, HashMap, TreeMap) : 키와 값의 쌍으로 이루어진 데이터 집합,
    *                                     순서는 유지되지 않고 Key의 중복 X, value값은 중복 허용
    * */

    public static void main(String[] args) {

        HashMap<String,String> map1 = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>(map1); //다른 컬렉션으로부터 초기화
        HashMap<String,String> map3 = new HashMap<>(10); //초기 용량 설정
        HashMap<String,String> map4 = new HashMap<>(10,0.8f); //초기 용량 및 load factor 설정

        //추가
        map1.put("1","아메리카노");
        map1.put("2","카페라떼");
        map1.put("1","바닐라라떼");
        map1.put("3","오이주스");
        map1.put("4","수박주스");
        map1.put("5","오렌지주스");
        map1.put("6","헤이즐럿라떼");
        map1.put("7","초코라떼");
        map1.put("8","모카라떼");

      //  System.out.println("map1>>>"+map1);

        //삭제
      //  map1.remove("1"); //해당 키 삭제
      //  map1.clear(); //모든 데이터 삭제

        map1.get("1"); //key 1d에 해당하는 value 리턴
        System.out.println(map1.get("1")+"Dddd");

        //HashkMap을 순회하는 방법
        //EntrySet 이용
        for (Map.Entry<String, String> entry : map1.entrySet()){
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : "+entry.getValue());
        }

        System.out.println("======================");

        //KeySet이용
        for (String key : map1.keySet()){
            System.out.println("key : " + key);
            System.out.println("value : "+ map1.get(key));
        }

        System.out.println("====Iterator이용=====");
        //for each 구문말고 Iterator이용
        Iterator<Map.Entry<String,String>> entries = map1.entrySet().iterator();
        while(entries.hasNext()){
            Map.Entry<String,String> entry = entries.next();
            System.out.println("Key : " +entry.getKey());
            System.out.println("Value : " +entry.getValue());
        }

        Iterator<String> keys = map1.keySet().iterator();
        while (keys.hasNext()){
            String key = keys.next();
            System.out.println("Key : " +key);
            System.out.println("value: " +map1.get(key));
        }



        //keySet을 이용해서 순회할때는 get()매소드로 다시 해시테이블을 조회하는 오버헤드이다.
        // 그렇기때문에 EntrySet을 이용하는게 더 효율적이다.


















    }
}
