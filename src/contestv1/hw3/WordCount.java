package contestv1.hw3;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("input.txt"));
        Set<String> set = new HashSet<>();
        while (scanner.hasNext()) {
            set.add(scanner.next());
        }
        System.out.println(set.size());
    }
}
