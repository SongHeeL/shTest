import java.math.*;

public class bigDecimalExam {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal("1.264");
        BigDecimal number2 = new BigDecimal("1.354");

        System.out.println(number1.add(number2)); //2.618
    }
}
