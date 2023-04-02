package contestv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SchoolLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] arr = line.split(" ");
        System.out.println(arr[n / 2]);
    }
}
