package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiseTest {

    @Test
    public void sumAllSale () {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 180;
        long actual = service.sumAllSale(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumSales (){
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long expected = 15;
        long actual = service.averageSumSales(month);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthMinSales () {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 9;
        int actualMonht = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonht);
    }

    @Test
    public void monthPeakSales () {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 8;
        int actualMonht = service.maxSales(month);

        Assertions.assertEquals(expectedMonth, actualMonht);
    }

    @Test
    public void numberMonthsMinSales() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 5;
        int actualMonht = service.numberMonthsMinSales(month);

        Assertions.assertEquals(expectedMonth, actualMonht);
    }
    @Test
    public void numberMonthsMaxSales() {
        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expectedMonth = 5;
        int actualMonht = service.numberMonthsMaxSales(month);

        Assertions.assertEquals(expectedMonth, actualMonht);
    }
}
