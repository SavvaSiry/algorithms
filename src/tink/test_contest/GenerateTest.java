package tink.test_contest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class GenerateTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long r = scanner.nextLong();
        AtomicInteger sum = new AtomicInteger();
        generate().forEach(x -> {
            if (x >= l && x <= r) {
                sum.getAndIncrement();
            }
        });
        System.out.println(sum);
    }


    public static ArrayList<Long> generate() {
        ArrayList<Long> list = new ArrayList<>(100);
        for (int i = 0; i < 9; i++) {
            list.add((long) (i + 1));
            for (int j = i * 18; j < i * 18 + 17; j++) {
                list.add(list.get(j) * 10 + i + 1);
            }
        }
        return list;
    }

//    public static int check(String[] arr, boolean left) {
//        int sum = Integer.parseInt(arr[0]);
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (Integer.parseInt(arr[i]) > Integer.parseInt(arr[i + 1])) {
//                --sum;
//                break;
//            } else if (left && Integer.parseInt(arr[i]) == Integer.parseInt(arr[i + 1])) {
//                --sum;
//                break;
//            }
//        }
//        return sum + (arr.length - 1) * 9;
//    }
}
