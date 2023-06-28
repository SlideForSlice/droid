import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12,5,6,4,7,6,22};
        long expected = 22;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}