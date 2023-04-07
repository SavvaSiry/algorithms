package yandex_lectures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class VectorLength {
    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String vectorStr = reader.readLine();
            String[] vector = vectorStr.split(" ");
            int localLength = 0, maxLength = 0;
            for (int i = 0; i < vector.length; i++) {
                if (Objects.equals(vector[i], "1")) {
                    localLength++;
                    if (localLength > maxLength) maxLength = localLength;
                } else localLength = 0;
            }
            System.out.println(maxLength);
        }
    }
}
