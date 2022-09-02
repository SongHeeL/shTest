package c.stream;

import java.util.*;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        int sum = nums.stream().mapToInt(i -> i).sum();
        System.out.println("sum = " + sum); // sum = 15
    }
}
