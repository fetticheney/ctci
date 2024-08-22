import java.util.HashMap;

public class CheckPermutation {
    static boolean checkPermutation(String str1, String str2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            map1.merge(str1.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < str2.length(); i++) {
            map2.merge(str2.charAt(i), 1, Integer::sum);
        }

        return map1.equals(map2);
    }
}
