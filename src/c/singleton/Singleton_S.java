package c.singleton;

public class Singleton_S {
    private static Singleton_S singleton_s;

    private Singleton_S() {}

    static {
        try {
            singleton_s = new Singleton_S();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static Singleton_S getInstance() {
        return singleton_s;
    }
}
