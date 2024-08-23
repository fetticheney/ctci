//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Problem 1.1");
        boolean p1_1a = IsUnique.isUnique("test");
        boolean p1_1b = IsUnique.isUnique("abcdef");
        System.out.println(p1_1a);  // false
        System.out.println(p1_1b);  // true

        boolean p1_1c = IsUnique.isUnique_NoDS("test");
        boolean p1_1d = IsUnique.isUnique_NoDS("abcdef");
        System.out.println(p1_1a);  // false
        System.out.println(p1_1b);  // true

        System.out.println("\n\nProblem 1.2");
        System.out.println(CheckPermutation.checkPermutation("dog", "god"));
        System.out.println(CheckPermutation.checkPermutation("burger", "hotdog"));

        System.out.println("\n\nProblem 1.3");
        System.out.println(URLify.urlIfy("The quick brown fox jumped over the lazy dog", 13));

        System.out.println("\n\nProblem 1.4");
        PalindromePermutation.palindromePermutation("nodtdon");

        System.out.println("\n\nProblem 1.5");
        System.out.println(OneAway.oneAway("pale", "pale"));
        System.out.println(OneAway.oneAway("pale", "pald"));
    }
}