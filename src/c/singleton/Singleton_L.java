package c.singleton;

public class Singleton_L {
    private static Singleton_L singleton_l;

    private Singleton_L() {}

    public static Singleton_L getInstance() {
        if (singleton_l == null) singleton_l = new Singleton_L();
        return singleton_l;
    }
    public static void main(String [] args) {
        Singleton_L singleton1 = Singleton_L.getInstance();
        Singleton_L singleton2 = Singleton_L.getInstance();

        System.out.println("singleton1 : " + singleton1); // singleton1 : c.singleton.Singleton_L@1b6d3586
        System.out.println("singleton2 : " + singleton2); // singleton2 : c.singleton.Singleton_L@1b6d3586
    }
}