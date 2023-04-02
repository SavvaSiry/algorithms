package contestv2part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class MaxInSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayList<Integer> arr = new ArrayList<>(10);
        do {
            arr.add(Integer.parseInt(str));
            str = reader.readLine();
        } while (!Objects.equals(str, "0"));
        int max = arr.get(0);
        int counter = 0;
        for (Integer integer : arr) {
            if (integer > max) {
                max = integer;
                counter = 1;
            } else if (integer == max) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
