package contestv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetroCircle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] arr = line.split(" ");
        int n = Integer.parseInt(arr[0]);
        int i = Integer.parseInt(arr[1]);
        int j = Integer.parseInt(arr[2]);

        if (i > j) {
            int k = j;
            j = i;
            i = k;
        }

        int leftN = j - i - 1;
        int rightN = n - leftN - 2;
        if (leftN < rightN) System.out.println(leftN);
        else System.out.println(rightN);
    }
}
