import java.util.HashMap;

public class MapTest {
    String phone;
    public MapTest(){
    }
    public MapTest(String phone){
        this.phone = phone;
    }
    public static void main(String[] args) {
        MapTest mapT = new MapTest();
        mapT.testMap1();
    }
    public void testMap1(){
       MapTest mapT1 = new MapTest("010-1234-1234");

       HashMap<MapTest, String> map = new HashMap<>();

       map.put(mapT1,"홍길동");
       System.out.println(map); // {MapTest@1b6d3586=홍길동}
    }
}
