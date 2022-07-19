public class TimeTest1 {
    public static void main(String[] args) {
        TimeTest1 tTest1 = new TimeTest1();
        tTest1.forTest1();
    }

    public void forTest1(){
        double var3 = 1.264;
        double var4 = 1.354;

        double sum2 = var3 + var4;

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++) {
            System.out.println("var3 + var4 => " + sum2);
        }

        long end = System.currentTimeMillis();
        System.out.println("실행시간 : " + (end - start)/1000.0); // 실행시간 : 1.136
    }
}
