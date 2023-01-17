package pl.krupix.leetcode.palindrome_number;

import java.util.LinkedList;
import java.util.List;

class Solution {

    // * third, fastest version based on numbers
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }


    // * second version based on collections, but slower than String version
    public boolean isPalindromeCollections(int x) {
        if (x < 0) return false;

        List<Integer> arr = new LinkedList<>();

        int nr = x;
        do {
            arr.add(nr % 10);
            nr = nr / 10;
        } while (nr != 0);

        for (int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equals(arr.get((arr.size() - 1 - i)))) return false;
        }
        return true;
    }

    // * first version based on String
    public boolean isPalindromeString(int x) {
        if (x < 0) return false;

        var charArr = (String.valueOf(x)).toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != charArr[(charArr.length - 1 - i)]) {
                return false;
            }
        }
        return true;
    }
}
