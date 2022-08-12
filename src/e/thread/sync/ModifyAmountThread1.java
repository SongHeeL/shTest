package e.thread.sync;

public class ModifyAmountThread1 extends Thread{
    private CommonCalculate1 calc;
    private boolean addFlag;
    public ModifyAmountThread1(CommonCalculate1 calc, boolean addFlag){
        this.calc = calc;
        this.addFlag = addFlag;
    }

    public void run(){
        for(int loop = 0; loop < 10000; loop++){
            if(addFlag){
                calc.plus(1);
            }else {
                calc.minus(1);
            }
        }
    }
}
