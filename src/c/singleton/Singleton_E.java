package c.singleton;

public class Singleton_E {
    private static Singleton_E singleton_e = new Singleton_E();
    private Singleton_E(){}

    public static Singleton_E getInstance(){
        return singleton_e;
    }
    public static void main(String [] args) {
        Singleton_E singleton1 = Singleton_E.getInstance();
        Singleton_E singleton2 = Singleton_E.getInstance();

        System.out.println("singleton1 : " + singleton1); // singleton1 : c.singleton.Singleton_E@1b6d3586
        System.out.println("singleton2 : " + singleton2); // singleton2 : c.singleton.Singleton_E@1b6d3586
    }
}
