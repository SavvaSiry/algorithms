
/*
* Дана строка типа: AAAAABBBBCCCCXXXXXYYYYZZZZZZAAAAAD
* Нужна написать функцию, которая на выходе суммирезирует повторяющиеся символы,
* и выдаст A10B4C4X5Y4Z6D
* Если символ встретился один раз он остается без изменения
* */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class RLEFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] arr = line.split("");

        StringBuffer result = new StringBuffer("");
        String currentLetter = arr[0];
        int count = 0;
        for (String s : arr) {
            if (Objects.equals(s, currentLetter)) {
                count++;
            } else {
                if (count > 1) result.append(currentLetter).append(count);
                else result.append(currentLetter);
                count = 1;
            }
            currentLetter = s;
        }
        if (count > 1) result.append(currentLetter).append(count);
        else result.append(currentLetter);
        System.out.println(result);
    }
}
