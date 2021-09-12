package programming;

import com.sun.tools.javac.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(1, 2, 3, 4, 35));
    }

    private static void printAllNumbersInListStructured(List<Integer> nums) {

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
