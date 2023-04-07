package contestv1;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String newNumber = normalize(scanner.next());
        for (int i = 0; i < 3; i++) {
            String str = normalize(scanner.next());
            if (newNumber.equals(str)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static String normalize(String str) {
        String newStr = str.replace("+7", "8").replace("-", "").replace("(", "").replace(")", "");
        if (newStr.length() == 7) {
            return "8495" + newStr;
        } else return newStr;
    }
}
