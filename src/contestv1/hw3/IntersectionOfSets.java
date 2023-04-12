/*
* Даны два списка чисел, которые могут содержать до 10000 чисел каждый.
* Выведите все числа, которые входят как в первый, так и во второй список
* в порядке возрастания. Примечание.
* */

package contestv1.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfSets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> setFirst = new HashSet<>();
        Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(setFirst::add);
        Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).filter(setFirst::contains).sorted().forEach(n -> System.out.print(n + " "));
    }
}
