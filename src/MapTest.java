import java.util.HashMap;

public class MapTest {
    String test;
    public MapTest(){

    }
    public MapTest(String test){
        this.test = test;
    }
    public static void main(String[] args) {
        MapTest mapT = new MapTest();
        mapT.testMap1();
    }
    public void testMap1(){
       MapTest mapT1 = new MapTest("test");
        HashMap<MapTest,String> map = new HashMap<>();

        map.put(mapT1,"A");
        System.out.println(map);
    }
}
