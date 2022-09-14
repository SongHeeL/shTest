package c.singleton;

public class Singleton_B {

    private Singleton_B() {}

    private static class SingletonHelper {
        private static final Singleton_B SINGLETON = new Singleton_B();
    }

    public static Singleton_B getInstance(){
        return SingletonHelper.SINGLETON;
    }
    public static void main(String [] args) {
        Singleton_B singleton1 = Singleton_B.getInstance();
        Singleton_B singleton2 = Singleton_B.getInstance();

        System.out.println("singleton1 : " + singleton1); // singleton1 : c.singleton.Singleton_B@1b6d3586
        System.out.println("singleton2 : " + singleton2); // singleton2 : c.singleton.Singleton_B@1b6d3586
    }
}