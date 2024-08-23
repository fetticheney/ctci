import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    static void palindromePermutation(String str) {
        str = str.toLowerCase();
        System.out.println(str);
        Map<Character, Integer> charFreq = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                charFreq.merge(str.charAt(i), 1, Integer::sum);
            }
        }
        int a = 0;
        for (Integer i : charFreq.values()) {
            if (i % 2 != 0) {
                a++;
            }
        }
        if (a > 1) {
            System.out.println("Given string is not a permutation of a palindrome.");
        } else {
            StringBuilder sb = new StringBuilder();
            int x = 0;
            for (Character i : charFreq.keySet()) {
                x = charFreq.get(i);
                if (x % 2 == 0) {
                    while (x > 0) {
                        sb.insert(0, i);
                        sb.append(i);
                        x = x-2;
                    }
                } else {
                    sb.insert(sb.length() / 2, i);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
