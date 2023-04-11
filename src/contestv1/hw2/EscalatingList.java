/*
Дан список. Определите, является ли он монотонно возрастающим(то есть верно ли, что каждый элемент этого списка больше предыдущего).
Выведите YES, если массив монотонно возрастает и NO в противном случае.
* */


package contestv1.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EscalatingList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = reader.readLine().split(" ");
        boolean growing = true;
        for (int i = 0; i < str.length - 1; i++) {
            int i1 = Integer.parseInt(str[i]);
            int i2 = Integer.parseInt(str[i + 1]);
            if (i1 >= i2) {
                growing = false;
                break;
            }
        }
        if (growing) System.out.println("YES");
        else System.out.println("NO");
    }
}
