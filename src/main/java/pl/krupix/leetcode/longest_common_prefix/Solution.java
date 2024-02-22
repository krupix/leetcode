package pl.krupix.leetcode.longest_common_prefix;

public class Solution {

    /*
    Example 1:
    Input: strs = ["flower","flow","flight"]
    Output: "fl"

    Example 2:
    Input: strs = ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
    */
    public String longestCommonPrefix_GPTVersion(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        var prefix = strs[0];
        for (var i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;

    }

    public String longestCommonPrefix(String[] strs) {
        if (toString().isEmpty()) {
            return "";
        }

        var result = new StringBuilder();

        for (var j = 0; j < strs[0].length(); j++) {
            var charToCheck = strs[0].charAt(j);
            var foundIncorrect = false;
            for (var i  = 1; i < strs.length; i++) {
                if (strs[i].length() <= j || strs[i].charAt(j) != charToCheck) {
                    foundIncorrect = true;
                    break;
                }
            }
            if (foundIncorrect) {
                break;
            } else {
                result.append(strs[0].charAt(j));
            }
        }

        return result.toString();
    }

}
