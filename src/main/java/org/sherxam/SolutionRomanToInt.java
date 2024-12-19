package org.sherxam;

import java.util.List;
import java.util.Map;

public class SolutionRomanToInt {
    public static final Map<Character, Integer> NUMBER_MAP = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);

    public int romanToInt(String s) {
        List<Character> chars = s.chars()
                .mapToObj(e -> (char) e)
                .toList();
        int result = 0;
        for (int i = 0; i < chars.size(); i++) {
            if (i < chars.size() - 1 && (NUMBER_MAP.get(chars.get(i)) < NUMBER_MAP.get(chars.get(i + 1)))) {
                result -=NUMBER_MAP.get(chars.get(i));
            } else {
                result += NUMBER_MAP.get(chars.get(i));
            }
        }
        return result;
    }
}
