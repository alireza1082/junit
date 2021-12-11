package test;

import junitTest.MessageUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
        Assert.assertEquals(message , messageUtil.printMessage());
    }
}
