package main;


import head.General;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    @Test
    public void abc()
    {
        int a = 2, b = 2;
        int res = General.sum(a, b);
//        assertEquals(4, res);
        assertEquals(5, res);
    }
}
