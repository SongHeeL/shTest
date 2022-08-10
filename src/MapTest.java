import java.util.HashMap;

public class MapTest {
    String phone;
    String name;
    public MapTest(){
    }
    public MapTest(String phone, String name){
        this.phone = phone;
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        MapTest mapT = new MapTest();
        mapT.testMap1();
    }
    public void testMap1(){
       MapTest mapT1 = new MapTest();
       mapT1.phone = "010-1234-5678";
       mapT1.name = "홍길동";
       HashMap<String, String> map = new HashMap<>();

       map.put(mapT1.phone,mapT1.name);
       System.out.println(map);
    }
}
