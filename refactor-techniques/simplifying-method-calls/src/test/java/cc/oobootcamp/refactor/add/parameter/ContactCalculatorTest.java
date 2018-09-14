package cc.oobootcamp.refactor.add.parameter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContactCalculatorTest {
    @Test
    public void should_get_contact_name() {
        ContactGenerator contactCalculator = new ContactGenerator();
        assertEquals("Kent", contactCalculator.getContact());
    }

}