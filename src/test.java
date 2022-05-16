import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        List<List>  aa = new ArrayList<>();
		list.add("a");
		list.add("p");
		list.add("p");
		list.add("l");
		list.add("e");
        aa.add(list);

        list2.add("b");
        list2.add("a");
        list2.add("n");
        list2.add("a");
        list2.add("n");
        aa.add(list2);




        System.out.println(aa+"ddd");

		// 확장 for문
		System.out.println("확장 for문 출력");
		for(int i = 0; i<1; i++){

        }


    }
}
