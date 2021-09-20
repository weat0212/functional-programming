package programming;

import com.sun.tools.javac.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 35);

        int sum = addListStructured(nums);
        System.out.println(sum);
    }

    private static int addListStructured(List<Integer> nums) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
