package com.tutorials.junit;

import org.junit.Test;
import org.mockito.Mockito.*;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubstract() throws Exception {
        Calculator calculator = new Calculator();

        Method subtractMethod = Calculator.class.getDeclaredMethod("substract", int.class, int.class);
        subtractMethod.setAccessible(true);

        int result = (int) subtractMethod.invoke(calculator, 7, 3);
        assertEquals(4, result);
    }
}
