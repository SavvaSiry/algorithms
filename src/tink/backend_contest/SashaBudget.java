package tink.backend_contest;

import java.util.*;

public class SashaBudget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + a[i - 1];
        }

        int count = 0;
        HashMap<Integer, Integer> freq = new HashMap<>(n);
        for (int i = 0; i <= n; i++) {
            if (freq.containsKey(prefix[i])) {
                count += n + 1 - i;
            }
            freq.put(prefix[i], freq.getOrDefault(prefix[i], 0) + 1);
        }

        System.out.println(count);
    }
}
