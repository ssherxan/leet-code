package org.sherxan;


import org.junit.jupiter.api.Test;
import org.sherxam.ValidParentheses;

import static org.junit.jupiter.api.Assertions.*;

public class ValidParenthesesTest {

    @Test
    void validParentheses() {
        String parentheses = "{([])}()";
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid(parentheses);

        assertTrue(result);
    }

    @Test
    void unValidParentheses() {
        String parentheses = "(])";
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid(parentheses);

        assertFalse(result);
    }

}
