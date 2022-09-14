package c.singleton;

public class Singleton_T {
    private static Singleton_T singleton;

    private Singleton_T() {}

    public static Singleton_T getInstance(){
        if(singleton == null){
            synchronized (Singleton_T.class) {
                if(singleton == null) singleton = new Singleton_T();
            }
        }
        return singleton;
    }
}