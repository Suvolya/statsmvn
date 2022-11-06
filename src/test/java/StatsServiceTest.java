import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.statsmvn.services.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldcalcSum() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 180;
        int actual = StatsService.calculateSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcArithmetic() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 15;
        int actual = StatsService.calculateArithmetic(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 8;
        int actual = StatsService.calculateMaxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 9;
        int actual = StatsService.calculateMinSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcBelowArithmetic() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 5;
        int actual = StatsService.calculateBelowArithmetic(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcAboveArithmetic() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 5;
        int actual = StatsService.calculateAboveArithmetic(sales);

        Assertions.assertEquals(expected, actual);
    }
}
