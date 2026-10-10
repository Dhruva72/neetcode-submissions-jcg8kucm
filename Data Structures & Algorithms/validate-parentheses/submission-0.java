

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Step 1: Push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // Step 2: Process closing brackets
            else {
                // No opening bracket available
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                // Step 3: Check for mismatched brackets
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }

                // Step 4: Remove the matched opening bracket
                stack.pop();
            }
        }

        // Step 5: No unmatched opening brackets should remain
        return stack.isEmpty();
    }
}
