import java.math.*;

public class bigDecimalExam {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        BigDecimal number1 = new BigDecimal("100000.12345");
//        BigDecimal number2 = new BigDecimal("100000");

        for(int i = 0; i <= 100000; i++){
            BigDecimal number1 = new BigDecimal("100000.12345");
            BigDecimal number2 = new BigDecimal("100000");
            System.out.println("덧셈(+) :" +number1.add(number2));
        }

//        System.out.println("덧셈(+) :" +number1.add(number2));         // 덧셈(+) :200000.12345
//        System.out.println("뺄셈(-) :" +number1.subtract(number2));    // 뺄셈(-) :0.12345
//        System.out.println("곱셈(*) :" +number1.multiply(number2));    // 곱셈(*) :10000012345.00000
//        System.out.println("나눗셈(/) :" +number1.divide(number2));    // 나눗셈(/) :1.0000012345
//        System.out.println("나머지(%) :" +number1.remainder(number2)); // 나머지(%) :0.12345
        long end = System.currentTimeMillis();
        System.out.println("SDB에서 노드생성까지의 실행시간 : " + (end - start)/1000.0);
    }
}
