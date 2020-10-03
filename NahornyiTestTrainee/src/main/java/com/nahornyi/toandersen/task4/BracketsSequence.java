/**
 * Дана скобочная последовательность: [((())()(())]]
 * - Можно ли считать эту последовательность правильной?
 * - Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?
 * <p>
 * Ответ:
 * последовательность неправильная.
 * для того, чтобы она стала правильной нужно изменить второй или предпоследний символ: либо "[[(())()(())]]", либо "[((())()(()))]"
 */

package com.nahornyi.toandersen.task4;

import java.util.Stack;

public class BracketsSequence {
    final static String GIVEN_SEQUENCE = "[((())()(())]]";
    final static String RIGHT_SEQUENCE_1 = "[[(())()(())]]";
    final static String RIGHT_SEQUENCE_2 = "[((())()(()))]";

    public static void main(String[] args) {
        System.out.println();
        System.out.println("method to check bracket sequence:");
        System.out.println("given sequence \"[((())()(())]]\" is " + (toCheck(GIVEN_SEQUENCE) ? "right" : "wrong"));
        System.out.println("modified sequence \"[[(())()(())]]\" is " + (toCheck(RIGHT_SEQUENCE_1) ? "right" : "wrong"));
        System.out.println("modified sequence \"[((())()(()))]\" is " + (toCheck(RIGHT_SEQUENCE_2) ? "right" : "wrong"));
    }

    public static boolean toCheck(String arg) {
        final Stack<Character> stack = new Stack<>();
        final int n = arg.length();
        for (int i = 0; i < n; i++) {
            final int ch = arg.charAt(i);
            switch (ch) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    final char top = stack.pop();
                    if (top != ch) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
