package c.inheritance;

public class ToString {
    public static void main(String[] args) {
        ToString toString = new ToString();
        toString.toStringMethod();
    }
    public void toStringMethod(){
        System.out.println(this);            // c.inheritance.ToString@1b6d3586
        System.out.println(this.toString()); // c.inheritance.ToString@1b6d3586
        System.out.println("plus " + this);  // plus c.inheritance.ToString@1b6d3586

    }
}
