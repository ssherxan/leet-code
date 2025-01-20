package org.sherxam;


import java.util.*;

public class ValidParentheses {

    private static final Map<Character, Character> PARENTHESES = Map.of(
            '(', ')',
            '[', ']',
            '{', '}'
    );

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Deque<Character> queue = new LinkedList<>();
        Set<Character> opened = PARENTHESES.keySet();
        Collection<Character> closed = PARENTHESES.values();

        if (closed.contains(chars[0])) {
            return false;
        }
        queue.add(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            if (opened.contains(chars[i])) {
                queue.add(chars[i]);
            } else {
                if (queue.isEmpty() && closed.contains(chars[i])) {
                    return false;
                }
                if (PARENTHESES.get(queue.getLast()).equals(chars[i])) {
                    queue.removeLast();
                } else{
                    return false;
                }
            }
        }
        return queue.isEmpty();
    }
}
