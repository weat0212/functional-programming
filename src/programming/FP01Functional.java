package programming;

import com.sun.tools.javac.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        printAllNumbersInListFunction(List.of(1, 2, 3, 4, 35));
    }

    private static void print(int num) {
        System.out.println(num);
    }

    private static void printAllNumbersInListFunction(List<Integer> nums) {

        //Method Reference
        nums.stream().forEach(FP01Functional::print);
    }
}
