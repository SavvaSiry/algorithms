package tink.backend_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMinSubStr {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        char[] str = reader.readLine().toCharArray();
        System.out.println(findMinStr(str));
    }

    private static int findMinStr(char[] str) {
        int l = 0;
        int r = 1;
        int min = str.length + 1;
        while (r < str.length + 1) {
            if (containsABCD(str, l, r)) {
                l++;
                if (r - l < min) min = r - l + 1;
            } else {
                r++;
            }
        }
        return min == str.length + 1 ? -1 : min;
    }

    private static boolean containsABCD(char[] str, int fromIndex, int toIndex) {
        if (toIndex - fromIndex < 4) return false;
        boolean a = false;
        boolean b = false;
        boolean c = false;
        boolean d = false;
        for (int i = fromIndex; i < toIndex; i++) {
            if (str[i] == 'a') a = true;
            else if (str[i] == 'b') b = true;
            else if (str[i] == 'c') c = true;
            else d = true;
        }
        return a && b && c && d;
    }
}
