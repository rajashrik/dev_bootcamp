package models;
import org.junit.Test;
import static org.junit.Assert.*;


import hello.models.Dummy;

public class DummyTest {

    @Test
    public void shouldReturnTrueForEven() {
        assertTrue(new Dummy().isEven(2));
    }

    @Test
    public void shouldReturnFalseForOdd() {
        assertFalse(new Dummy().isEven(1));
    }

}
