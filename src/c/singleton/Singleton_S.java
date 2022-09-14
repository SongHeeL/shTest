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
    public static void main(String [] args) {
        Singleton_S singleton1 = Singleton_S.getInstance();
        Singleton_S singleton2 = Singleton_S.getInstance();

        System.out.println("singleton1 : " + singleton1); // singleton1 : c.singleton.Singleton_S@1b6d3586
        System.out.println("singleton2 : " + singleton2); // singleton2 : c.singleton.Singleton_S@1b6d3586
    }
}
