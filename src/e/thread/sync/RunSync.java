package e.thread.sync;

public class RunSync {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        RunSync runSync = new RunSync();
        for(int loop = 0; loop < 100; loop++){
            runSync.runCommonCalculate();
        }

        long end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end - start) + "ms"); // 실행시간 : 136ms
    }
    public void runCommonCalculate(){
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc,true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc,true);

        thread1.start();
        thread2.start();

        try{
           thread1.join();
           thread2.join();
           System.out.println("Final value is " + calc.getAmount());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
