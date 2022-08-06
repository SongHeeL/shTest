import java.util.*;
import java.math.*;

public class ListTimeTest {
    public static void main(String[] args) {
        ListTimeTest timeTest = new ListTimeTest();
        timeTest.listTest1();
    }
    public void listTest1(){
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();

        long start = System.currentTimeMillis();

        for(int i = 0; i <= 100000; i++){
            list.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("ArrayList add 실행시간 : " + (end - start) + "ms"); // ArrayList add 실행시간 : 10ms

        long start1 = System.currentTimeMillis();

        for(int i = 0; i <= 100000; i++){
            list1.add(i);
        }

        long end1 = System.currentTimeMillis();
        System.out.println("LinkedList add 실행시간 : " + (end1 - start1) + "ms"); // LinkedList add 실행시간 : 7ms

        long start2 = System.currentTimeMillis();

        for(int i = 0; i <= 100000; i++){
            list.get(5000);
        }

        long end2 = System.currentTimeMillis();
        System.out.println("ArrayList get 실행시간 : " + (end2 - start2) + "ms"); // ArrayList get 실행시간 : 2ms

        long start3 = System.currentTimeMillis();

        for(int i = 0; i <= 100000; i++){
            list1.get(5000);
        }

        long end3 = System.currentTimeMillis();
        System.out.println("LinkedList get 실행시간 : " + (end3 - start3) + "ms"); // LinkedList get 실행시간 : 760ms

    }
}
