package c.stream;

import java.io.*;

public class InputOutputTest {
    public static void main(String[] args) {
        int data = 0;
        InputStream inputTest = System.in;
        OutputStream outPutTest = System.out;
        System.out.println("입력 = ");

        try{
            while ((data = inputTest.read()) != -1){
                if(data == 'x' || data == 'X'){
                    System.out.println("종료");
                    break;
                }
                outPutTest.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
