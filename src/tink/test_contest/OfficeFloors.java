package tink.test_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OfficeFloors {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] line = reader.readLine().trim().split(" ");
        int[] nt = convert(line);
        int n = nt[0];
        int t = nt[1];
        line = reader.readLine().trim().split(" ");
        int[] arr = convert(line);
        int wi = Integer.parseInt(reader.readLine().trim()) - 1;
        System.out.println(find(arr, t, wi));
    }

    public static int[] convert(String[] arr) {
        int[] ints = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ints[i] = Integer.parseInt(arr[i]);
        }
        return ints;
    }

    public static int find(int[] arr, int time, int workerIndex) {
        int fullLength = arr[arr.length -1] - arr[0];
        if (arr[arr.length -1] - arr[workerIndex] <= time || arr[workerIndex] - arr[0] <= time) {
            return fullLength;
        } else {
            int min = Math.min(arr[workerIndex] - arr[0], arr[arr.length - 1] - arr[workerIndex]);
            return min + fullLength;
        }
    }
}
