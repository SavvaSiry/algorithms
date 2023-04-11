/*
* Дан список чисел. Определите, сколько в этом списке элементов, которые больше двух своих соседей и выведите количество таких элементов.
* */

package contestv1.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NearestNeighbors {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int counter = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            if ( numbers[i - 1]< numbers[i] &&  numbers[i] > numbers[i + 1]) counter++;
        }
        System.out.println(counter);
    }
}
