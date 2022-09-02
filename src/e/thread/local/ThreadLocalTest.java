package e.thread.local;

public class ThreadLocalTest implements Runnable {

    static class MyInfo {
        private String value;

        public MyInfo(String value) {

            this.value = value;
        }

        public String getValue() {

            return value;
        }
    }

    private static final ThreadLocal<MyInfo> myInfo = new ThreadLocal<MyInfo>() {

        @Override
        protected MyInfo initialValue() {
            return new MyInfo("defaultName");
        }
    };

    public void run() {

        System.out.println("Start thread name=" + Thread.currentThread().getName() + ", myInfo=" + myInfo.get().getValue());
        myInfo.set(new MyInfo("newValue From " + Thread.currentThread().getName()));
        System.out.println("End thread name=" + Thread.currentThread().getName() + ", myInfo=" + myInfo.get().getValue());
    }

    public static void main(String[] args) {
        ThreadLocalTest runnable = new ThreadLocalTest();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(runnable, "" + i);
            t.start();
        }
    }
}