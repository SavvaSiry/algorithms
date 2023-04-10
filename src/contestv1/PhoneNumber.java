/*
 Телефонные номера в адресной книге мобильного телефона имеют один из следующих форматов:
 +7<код><номер>, 8<код><номер>, <номер>, где <номер> — это семь цифр, а <код> — это три
 цифры или три цифры в круглых скобках. Если код не указан, то считается, что он равен
 495. Кроме того, в записи телефонного номера может стоять знак “-” между любыми двумя
 цифрами (см. пример). На данный момент в адресной книге телефона Васи записано всего три
 телефонных номера, и он хочет записать туда еще один. Но он не может понять, не
 записан ли уже такой номер в телефонной книге. Помогите ему! Два телефонных номера
 совпадают, если у них равны коды и равны номера.
 Например, +7(916)0123456 и 89160123456 — это один и тот же номер.
* */


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
