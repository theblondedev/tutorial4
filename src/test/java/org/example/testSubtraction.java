package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testSubtraction {
  Calc c = new Calc();

    @Test
    void testSubtraction() {
        assertEquals(5, c.subtract(4,2));
    }

}
