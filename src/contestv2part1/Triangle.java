package contestv2part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double d = Integer.parseInt(reader.readLine());
        String[] arr = reader.readLine().split(" ");
        double x = Integer.parseInt(arr[0]);
        double y = Integer.parseInt(arr[1]);

        if (x >= 0 && y >= 0) {
            if (y <= d - x) System.out.println(0);
            else if (x <= d / 2 && y <= d / 2) System.out.println(1);
            else if (y <= x) System.out.println(2);
            else System.out.println(3);
        } else {
            if (x > d / 2) System.out.println(2);
            else if (y > d / 2) System.out.println(3);
            else System.out.println(1);
        }
    }
}
