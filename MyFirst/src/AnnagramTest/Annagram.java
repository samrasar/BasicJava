package AnnagramTest;

import java.util.Arrays;

/*Write java program to check two string are anagrams or not*/
public class Annagram {
    public static void main(String[] args) {
        isAnnagram("Race", "Care");
    }

    public static void isAnnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Both are not Annagrams");
        }
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Both are Annagrams");
        } else {
            System.out.println("Both are not Annagrams");
        }
    }
}
