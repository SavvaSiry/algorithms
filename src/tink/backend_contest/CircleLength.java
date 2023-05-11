package tink.backend_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CircleLength {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean incr = true;
        boolean decr = true;
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] > ints[i + 1]) {
                decr = false;
            } else if (ints[i] < ints[i + 1]) {
                incr = false;
            }
        }
        System.out.println(incr || decr ? "YES" : "NO");
    }
}
