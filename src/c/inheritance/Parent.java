package c.inheritance;

public class Parent {
    int test1;
    int test2;

    public void add(int test1, int test2){
        this.test1 = test1;
        this.test2 = test2;
        System.out.println("test1 + test2 = " + (test1+test2));
    }
}
