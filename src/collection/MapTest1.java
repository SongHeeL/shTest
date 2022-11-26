package collection;

import java.util.*;

public class MapTest1 {
    public static void main(String[] args) {
        MapTest1 mapT1 = new MapTest1();
        mapT1.testMap1();
    }
    public void testMap1(){
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Test1");
        map.put(2,"Test2");
        map.put(1,"Test3");
        System.out.println(map); // {1=Test3, 2=Test2}
    }
}
