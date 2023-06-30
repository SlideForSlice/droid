import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldCreate(){
        Conditioner condi = new Conditioner();

    }

    @Test
    public void shouldInitFildToZeroValues() {
        Conditioner condi = new Conditioner();
        assertNull(condi.name);
        assertEquals(0,condi.maxTemp);
        assertEquals(0,condi.minTemp);
        assertEquals(0, condi.currentTemp);
        assertTrue(condi.on);
    }

}