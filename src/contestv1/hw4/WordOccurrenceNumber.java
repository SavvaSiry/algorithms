/*
* Во входном файле (вы можете читать данные из файла input.txt) записан текст.
* Словом считается последовательность непробельных символов идущих подряд, слова
* разделены одним или большим числом пробелов или символами конца строки.
* Для каждого слова из этого текста подсчитайте, сколько раз оно встречалось
* в этом тексте ранее.
* */


package contestv1.hw4;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordOccurrenceNumber {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        while (scanner.hasNext()) {
            String str = scanner.next();
            if (map.containsKey(str)) {
                int count = map.get(str) + 1;
                map.put(str, count);
                System.out.print(count + " ");
            }
            else {
                map.put(str, 0);
                System.out.print("0 ");
            }
        }
    }
}

