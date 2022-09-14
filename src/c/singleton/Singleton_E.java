package c.singleton;

public class Singleton_E {
    private static Singleton_E singleton_e = new Singleton_E();
    private Singleton_E(){}

    public static Singleton_E getInstance(){
        return singleton_e;
    }
}
