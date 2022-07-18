import java.math.BigDecimal;

public class floatingPoint {
    public static void main(String[] args) {
        floatingPoint ftPoint = new floatingPoint();
        ftPoint.additive();
    }
    public void additive(){
//        float var1 = 1.325f;
//        float var2 = 1.253f;
//        double var3 = 1.264;
//        double var4 = 1.354;

//        float sum1 = var1 + var1;
//        System.out.println(sum1); //2.65

//        double sum2 = var3 + var4;
//        System.out.println(sum2); //2.6180000000000003

        long start = System.currentTimeMillis();

        for(int i = 0; i <= 100000; i++){
            float var1 = 1.325f;
            float var2 = 1.253f;
            float sum1 = var1 + var1;
            System.out.println("덧셈(+) :" +sum1); //2.65
        }
        long end = System.currentTimeMillis();
        System.out.println("SDB에서 노드생성까지의 실행시간 : " + (end - start)/1000.0);

    }
}
