package hr.ivlahek.learning.jacoco;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Igor on 25.6.2014..
 */
public class MockTest {

    @Test
    public void should_true() {
        assertEquals(4, new Mock().doSomething());
    }

}
