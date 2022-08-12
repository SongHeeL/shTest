package e.thread.sync;

public class RunSync1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        RunSync1 runSync = new RunSync1();
        for(int loop = 0; loop < 100; loop++){
            runSync.runCommonCalculate();
        }

        long end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end - start) + "ms"); // 실행시간 : 110ms
    }
    public void runCommonCalculate(){
        CommonCalculate1 calc = new CommonCalculate1();
        ModifyAmountThread1 thread1 = new ModifyAmountThread1(calc,true);
        ModifyAmountThread1 thread2 = new ModifyAmountThread1(calc,true);

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
