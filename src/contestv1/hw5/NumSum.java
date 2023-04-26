package contestv1.hw5;

import java.util.Scanner;

public class NumSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ints = readFromConsole(scanner, n);
        System.out.println(numSun(ints, k));
    }

    private static int numSun(int[] ints, int k) {
        int i = 0;
        int j = 0;
        int counter = 0;
        int sum = 0;
        while (j != ints.length) {
            if (sum < k) {
                sum += ints[j];
                j++;
            }
            if (sum > k){
                sum -= ints[i];
                i++;
            }
            if (sum == k) {
                counter++;
                sum -= ints[i];
                i++;
            }
        }
        return counter;
    }

    private static int[] readFromConsole(Scanner scanner, int n) {
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = scanner.nextInt();
        }
        return ints;
    }
}
