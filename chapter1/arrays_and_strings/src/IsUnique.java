import java.util.Arrays;
// Problem 1.1
public class IsUnique {
    static boolean isUnique(String str) {
        char[] tempArray = str.toCharArray();
        Arrays.sort(tempArray);
        for (int i = 0; i < tempArray.length - 1; i++){
            if (tempArray[i] == tempArray[i+1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isUnique_NoDS(String str) {
        // bad solution as far as time complexity goes - O(n^2) but takes no space
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (j != i){
                    // skip checking character against itself
                    if (str.charAt(i) == str.charAt(j)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
