package org.atteo.xmlcombiner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Key2Test {
    @Test
    public void testEquals() {
        Key2 key2 = new Key2("", null);
        assertTrue(key2.equals(Key2.BEFORE_END));
    }

    @Test
    public void testHashCode() {
        assertEquals(1, Key2.BEFORE_END.hashCode());
    }

    @Test
    public void testToString() {
        assertEquals("", Key2.BEFORE_END.toString());
    }
}
