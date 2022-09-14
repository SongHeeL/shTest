package c.singleton;

public class Singleton_L {
    private static Singleton_L singleton_l;

    private Singleton_L() {}

    public static Singleton_L getInstance() {
        if (singleton_l == null) singleton_l = new Singleton_L();
        return singleton_l;
    }
}