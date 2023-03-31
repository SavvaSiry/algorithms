/*
 * Дана последовательность положительных чисел длинной N и число X
 * Нужно найти два числа различных A и B, которые в сумме дадут X
 * и вывести эту пару, иначе вывести 0, 0
 * */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class FindSumOfTwo {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String x = reader.readLine();
        String[] strings = line.split(" ");
        Integer[] values = Arrays.stream(strings)
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        System.out.println(findPair(values, Integer.parseInt(x)));
    }

    public static String findPair(Integer[] nums, int x) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : nums) {
            if (set.contains(x - num))
                return num + ", " + (x - num);
            set.add(num);
        }
        return "0, 0";
    }
}
