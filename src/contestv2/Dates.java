package contestv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dates {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] arr = line.split(" ");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        int z = Integer.parseInt(arr[2]);
        if (x > 0 && x < 32 && y < 32 && y > 0 && z > 1969 && z < 2070 && !(x > 12 && y > 12)) {
            if (x == y || x > 12 || y > 12) System.out.println(1);
            else System.out.println(0);
        } else System.out.println(0);

    }
}
