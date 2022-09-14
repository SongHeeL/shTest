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
    public static void main(String [] args) {
        Singleton_T singleton1 = Singleton_T.getInstance();
        Singleton_T singleton2 = Singleton_T.getInstance();

        System.out.println("singleton1 : " + singleton1); // singleton1 : c.singleton.Singleton_T@1b6d3586
        System.out.println("singleton2 : " + singleton2); // singleton2 : c.singleton.Singleton_T@1b6d3586
    }
}