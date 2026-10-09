
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String operation : operations) {

            if (operation.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();

                int sum = last + secondLast;

                stack.push(last);
                stack.push(sum);
            }
            else if (operation.equals("C")) {
                stack.pop();
            }
            else if (operation.equals("D")) {
                int doubled = 2 * stack.peek();
                stack.push(doubled);
            }
            else {
                stack.push(Integer.parseInt(operation));
            }
        }

        int total = 0;

        for (int score : stack) {
            total += score;
        }

        return total;
    }
}
