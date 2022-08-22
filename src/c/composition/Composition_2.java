package c.composition;

public class Composition_2 {
    private static Composition_1 composition_1 = new Composition_1();
    public static int add(){
        return 200;
    }

    public static void main(String[] args) {
        System.out.println(composition_1.add() + "/" + add()); // 600/200
    }
}
