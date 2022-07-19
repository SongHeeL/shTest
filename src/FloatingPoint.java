public class FloatingPoint {
    public static void main(String[] args) {
        FloatingPoint ftPoint = new FloatingPoint();
        ftPoint.additive();
    }
    public void additive(){
        float var1 = 1.325f;
        float var2 = 1.253f;
        double var3 = 1.264;
        double var4 = 1.354;

        float sum1 = var1 + var1;
        System.out.println("float => " + sum1);  //float => 2.65

        double sum2 = var3 + var4;
        System.out.println("double => " + sum2); //double => 2.6180000000000003

    }
}
