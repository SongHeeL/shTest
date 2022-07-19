import java.math.*;

public class BigDecimalExam {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1.325");
        BigDecimal number2 = new BigDecimal("1.253");
        BigDecimal number3 = new BigDecimal("1.264");
        BigDecimal number4 = new BigDecimal("1.354");

        System.out.println("number1 + number2 => " + number1.add(number2)); // number1 + number2 => 2.578
        System.out.println("number3 + number4 => " + number3.add(number4)); // number3 + number4 => 2.618
    }
}
