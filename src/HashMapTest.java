import java.util.*;

public class HashMapTest {
    String name;
    int price;

    public HashMapTest(String name, int price){
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) {
        HashMapTest chicken1 = new HashMapTest("후라이드치킨", 16000);
        HashMapTest chicken2 = new HashMapTest("후라이드치킨", 16000);
        HashMapTest chicken3 = new HashMapTest("양념치킨", 16000);

        System.out.println(chicken1.equals(chicken2)); // false => equals를 재정의 하지 않을 경우 동일한 값이여도 false로 출력됨.
        System.out.println(chicken1.equals(chicken3)); // false

        Map<HashMapTest, Integer> map = new HashMap<>();

        map.put(new HashMapTest("후라이드치킨", 16000), 10);
        map.put(new HashMapTest("생맥주", 4500), 4);

        Integer friedCount = map.get(new HashMapTest("후라이드치킨", 16000));
        System.out.println(friedCount); // null => 10이 아닌 null이 나오는 이유는 해시맵에 값을 넣을 때 사용된 해시값과 조회할 때 사용되는 해시값이 다르기 때문이다.
    }
}
