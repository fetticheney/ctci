import static java.lang.Math.abs;

public class OneAway {
    static boolean oneAway(String str1, String str2) {
        int lengthDifference = abs(str1.length() - str2.length());
        if (lengthDifference == 0) {
            return oneReplace(str1, str2);
        }
        else if (lengthDifference == 1) {
            return oneInsertion(str1, str2);
        }
        return false;
    }

    private static boolean oneReplace(String s1, String s2) {
        boolean editCounter = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (!editCounter) {
                    editCounter = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean oneInsertion(String s1, String s2) {
        int s1Index = 0;
        int s2Index = 0;
        while (s1Index < s1.length() && s2Index < s2.length()) {
                if (s1.charAt(s1Index) != s2.charAt(s2Index)) {
                    if (s2Index > s1Index) {
                        return false;
                    }
                    s2Index++;
                } else {
                    s1Index++;
                    s2Index++;
                }
        }
        return true;
    }
}
