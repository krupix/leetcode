package pl.krupix.leetcode.valid_parentheses;

import java.util.Stack;

class Solution {

    // * My solution
    public boolean isValid(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return false;
        }
        char[] stack = new char[s.length()];
        int currentEmptyStack = 0;
        for (var i = 0; i < s.length(); i++) {
            if (currentEmptyStack == 0 && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                return false;
            }
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack[currentEmptyStack] = s.charAt(i);
                currentEmptyStack++;
            } else if (s.charAt(i) == ')') {
                if (stack[currentEmptyStack - 1] == '(') {
                    currentEmptyStack--;
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack[currentEmptyStack - 1] == '{') {
                    currentEmptyStack--;
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ']') {
                if (stack[currentEmptyStack - 1] == '[') {
                    currentEmptyStack--;
                } else {
                    return false;
                }
            }
        }
        return currentEmptyStack <= 0;
    }

    // * Simples solution
    boolean isValidSimple(String s) {
        Stack<Character> stack = new Stack<>();
        for (var c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

}
