/*
* Вам дан словарь, состоящий из пар слов.
* Каждое слово является синонимом к парному
* ему слову. Все слова в словаре различны.
* Для одного данного слова определите его синоним.
* */

package contestv1.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SynonymDictionary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine().trim());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] line = reader.readLine().split(" ");
            map.put(line[0], line[1]);
            map.put(line[1], line[0]);
        }
        System.out.println(map.get(reader.readLine().trim()));
    }
}
