package org.example.reverse;

import org.example.reverse.reverse.Reverse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseTest {
    private Reverse reverse = new Reverse();
    @Test
    public void reverse_shouldReverse_ifContainsString() {
        String result = reverse.reverseWord("Hello");
        Assertions.assertEquals("olleH", result);
    }
    @Test
    public void reverse_shouldReturnNull_ifStringIsEmpty() {
        String result = reverse.reverseWord("");
        Assertions.assertEquals("",result);


    }
    @Test
    public void reverse_shouldDoNothing_ifStringContainsNoLetters() {
        String result = reverse.reverseWord("23423 @#$");
        Assertions.assertEquals("23423 @#$", result);
    }
    @Test
    public void reverse_shouldReverseOnlyLetters() {
        String result = reverse.reverseWord("4Hel#lo$");
        Assertions.assertEquals("4oll#eH$", result);

    }

    @Test
    public void reverse_shouldReverseMixedCaseString() {
        String result = reverse.reverseWord("DcBa");
        Assertions.assertEquals("aBcD", result);
    }
}
