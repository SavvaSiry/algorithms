package tink.test_contest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lunches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(scanner.nextInt());
        }
        System.out.println(getSum(nums, 0));
    }

    public static int getSum(List<Integer> nums, int k) {
        int sum = 0;
        int min = 300 * 300;
        for (int i = 0; i < nums.size(); i++) {
            if (k > 0) {
                ArrayList<Integer> newList = new ArrayList<>(nums);
                newList.remove(i);
                int local = getSum(newList, k - 1);
                if (local < min) min = local;

            } else if (nums.get(i) > 100) {
                sum += nums.get(i);
                if (nums.size() - i > 1) {
                    List<Integer> newList = nums.subList(i + 1, nums.size());
                    return sum + getSum(newList, k + 1);
                }
            } else sum += nums.get(i);
        }
        if (k == 1) return min;
        return sum;
    }
}
