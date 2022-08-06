import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        QueueTest sample = new QueueTest();
        sample.checkLinkedList1();
        sample.checkLinkedList2();
    }
    public void checkLinkedList1(){
        Queue<String> queue = new LinkedList<>();

        queue.add("TEST1");
        queue.add("TEST2");
        System.out.println("queue => " + queue); // queue => [TEST1, TEST2]
        queue.remove();
        System.out.println("queue => " + queue); // queue => [TEST2]
    }
    public void checkLinkedList2(){
        List<String> list = new LinkedList<>();

        list.add("TEST3");
        list.add("TEST4");
        System.out.println("list => " + list); // list => [TEST3, TEST4]
    }
}
