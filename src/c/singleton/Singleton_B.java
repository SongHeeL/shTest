package c.singleton;

public class Singleton_B {

    private Singleton_B() {}

    private static class SingletonHelper {
        private static final Singleton_B SINGLETON = new Singleton_B();
    }

    public static Singleton_B getInstance(){
        return SingletonHelper.SINGLETON;
    }
}