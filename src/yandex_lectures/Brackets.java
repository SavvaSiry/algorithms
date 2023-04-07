package yandex_lectures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brackets {

    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            generate("", 0, 0, n);
        }
    }

    public static void generate(String cur, int open, int close, int n) {
        if (cur.length() == n * 2) {
            System.out.println(cur);
            return;
        }
        if (open < n) {
            generate(cur + "(", open + 1, close, n);
        }
        if (close < open) {
            generate(cur + ")", open, close + 1, n);
        }
    }

}
