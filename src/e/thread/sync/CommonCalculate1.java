package e.thread.sync;

public class CommonCalculate1 {
    private int amount;
    private int interest;
    private Object interestLock = new Object();
    private Object amountLock = new Object();
    public CommonCalculate1(){
        amount = 0;
    }
    public void plus(int value){
        synchronized(interestLock){
            amount+=value;
        }
    }
    public synchronized void minus(int value){
        synchronized(amountLock) {
            amount -= value;
        }
    }
    public int getAmount(){
        return amount;
    }
}
