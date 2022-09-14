package c.singleton;

public enum Singleton_Enum {
    INSTANCE;

    public static void main(String [] args) {
        System.out.println(System.identityHashCode(Singleton_Enum.INSTANCE.getClass())); // 685325104
        System.out.println(System.identityHashCode(Singleton_Enum.INSTANCE.getClass())); // 685325104
    }
}

