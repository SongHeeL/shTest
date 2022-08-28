package c.wrapper;

public class WrapperTest {
    public static void main(String[] args) {
        int i = 10;
        Integer wi = new Integer(i);

        System.out.println("BoxingTest = " + wi); // BoxingTest = 10

        int j = wi.intValue();

        System.out.println("UnboxingTest = " + j); // UnboxingTest = 10
    }
}
