package contestv2part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudBenches {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");

        int len = Integer.parseInt(arr[0]);
        String[] x = reader.readLine().split(" ");
        double l;
        if (len % 2 == 0) l = len / 2 - 0.5;
        else l = len / 2;
        int val;

        for (int i = 0; i < x.length; i++) {
            val = Integer.parseInt(x[i]);
            if (val > l) {
                System.out.println(x[i - 1] + " " + x[i]);
                break;
            } else if (val == l) {
                System.out.println(x[i]);
                break;
            }
        }
    }
}
