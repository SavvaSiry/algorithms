package tink.backend_contest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FindMid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) {
            System.out.println(pairs[i][0] + "/" + pairs[i][1]);
        }

        int left = 1;
        int right = s;
        int ans = 1;
        while (left <= right) {

            int mid = left + (right - left) / 2;
            int sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {
                if (pairs[i][1] < mid) {
                    sum += pairs[i][0];
                } else if (pairs[i][0] >= mid) {
                    sum += pairs[i][0];
                } else if (pairs[i][0] <= mid && pairs[i][1] >= mid){
                    sum += mid;
                    count++;
                }
            }

            if (sum <= s) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(ans);
    }

}
