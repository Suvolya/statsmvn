import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.statsmvn.services.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldcalcSum() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long expected = 180;
        long actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcAverage() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        long expected = 15;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcLowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 5;
        int actual = service.lowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldcalcHighAverage() {
        StatsService service = new StatsService();
        long[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expected = 5;
        int actual = service.highAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}