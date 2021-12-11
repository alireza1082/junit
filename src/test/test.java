package test;

import junitTest.MessageUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class test {

    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        assertEquals(message , messageUtil.printMessage());
    }

    @Test
    public void testAdded() {
        //test data
        int num = 5;
        String temp = null;
        String str = "Junit is working fine";

        //check for equality
        assertEquals("Junit is working fine", str);

        //check for false condition
        assertFalse(num > 6);

        //check for not null value
        assertNull(temp);
    }
}
