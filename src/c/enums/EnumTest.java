package c.enums;

public class EnumTest {
    public enum FourSeasons {
        Spring, Summer, Autumn, Winter;
    }

    public static void main(String[] args) {
        System.out.println("가을 = " + FourSeasons.Autumn); // 가을 = Autumn
    }
}

