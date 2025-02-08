package org.example.module12;

import java.util.*;

public class Module12_1 {
    public static void main(String[] args) {
        Module12_1 m = new Module12_1();
        System.out.println("-----expect false");
        m.checkStringArray(m.falseData());
        System.out.println("-----expect true");
        m.checkStringArray(m.trueData());
    }

    private void checkStringArray(String[] data) {
        for (String line: data) {
            System.out.println(checkString(line));
        }

    }

    private boolean checkString(String line) {
        Map<Character, Character> pairs = Map.of('[', ']', '{', '}', '<', '>', '(', ')');
        Deque<Character> deque = new ArrayDeque<>();
        for (Character ch: line.toCharArray()) {
            if (deque.peekLast() != null && ch.equals(pairs.get(deque.peekLast()))) {
                deque.pollLast();
            } else {
                deque.addLast(ch);
            }
        }
        return deque.isEmpty();
    }

    private String[] falseData() {
        return new String[] {
                "<", "<{", "()]", "({)}", "<{>}", "([)]", "({[}])", "((())", "({<>}", "<{})", "([)]", "({[}])", "((())", "({<>}", "<{})"
        };
    }

    private String[] trueData() {
        return new String[] {
                "", "()", "[]", "{}", "<>", "()[]{}<>", "({[]})", "<{}([])>", "()(())", "<><><>", "({<>})", "((()))", "[{()}]", "<({[]})>", "({}<>)", "([]){<>}"
        };
    }
}
