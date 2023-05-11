package tink.backend_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindPrefInArrNums {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] arr = reader.readLine().split(" ");
        System.out.println(findMaxPref(arr));
    }

    private static int findMaxPref(String[] arr) {
        int max = 0;
        HashMap<String, Integer> map = new HashMap<>(arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
            else map.put(arr[i], 1);
            if (isBoring(map)) max = i + 1;
        }
        return max;
    }

    private static boolean isBoring(HashMap<String, Integer> map) {
        int firstCount = -1;
        int diffCount = 0;

        for (int count : map.values()) {
            if (firstCount == -1) {
                firstCount = count;
            } else if (count != firstCount) {
                diffCount++;
                if (diffCount > 1 || Math.abs(count - firstCount) != 1) {
                    return false;
                }
            }
        }

        if (firstCount > 1 && diffCount == 0) return false;
        return true;
    }
}
