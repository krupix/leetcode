package pl.krupix.leetcode.roman_to_integer;

class Solution {

    public int romanToInt(String s) {
        int result = 0;
        var charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            switch (charArray[i]) {
                case 'I' -> result += (result >= 5) ? -1 : 1;
                case 'V' -> result += 5;
                case 'X' -> result += (result >= 50) ? -10 : 10;
                case 'L' -> result += 50;
                case 'C' -> result += (result >= 500) ? -100 : 100;
                case 'D' -> result += 500;
                case 'M' -> result += 1000;
                default -> {
                }
            }

        }
        return result;
    }

}