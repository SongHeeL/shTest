import java.math.*;

public class TimeTest {
    public static void main(String[] args) {
        TimeTest tTest = new TimeTest();
        tTest.forTest();
    }

    public void forTest(){
        BigDecimal number1 = new BigDecimal("1.325");
        BigDecimal number2 = new BigDecimal("1.253");

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            System.out.println("number1 + number2 => " + number1.add(number2));
        }

        long end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end - start)/1000.0); // 실행시간 : 0.707
    }
}