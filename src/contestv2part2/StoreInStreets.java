package contestv2part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoreInStreets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = reader.readLine().split(" ");
        int[] iArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            iArr[i] = Integer.parseInt(arr[i]);
        }

        int max1 = 0;
        int max2 = 0;
        int max = 0;
        int res = 0;
        for (int i = 0; i < iArr.length; i++) {
            if (max > res) res = max;
            max1 = 10;
            max2 = 10;
            if (iArr[i] == 1) {
                for (int j = 0; j < iArr.length - i - 1; j++) {
                    if (iArr[i + j + 1] == 2) {
                        max1 = j + 1;
                        break;
                    }
                }
                for (int j = i; j >= 0; j--) {
                    if (iArr[j] == 2) {
                        max2 = i - j;
                        break;
                    }
                }
                max = Math.min(max1, max2);
            }
        }
        System.out.println(res);
    }
}
