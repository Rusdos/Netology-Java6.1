package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    public static int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    public int expectedSales = 180;
    public int expectedAverageSales = 15;
    public int expectedMaximumSales = 8;
    public int expectedMinimumSales = 9;
    public int expectedBelowAverage = 5;
    public int expectedAboveAverage = 5;

    // @ParameterizedTest
    // @ValueSource(sales)
    @Test
    void salesAmount(int[] sales, int expectedSales) {
        StatsService service = new StatsService();
        long actual = service.salesAmount(sales);
        assertEquals(expectedSales, actual);
    }


    @Test
    void averageSales(int[] sales, int expectedAverageSales) {
        StatsService service = new StatsService();
        long actual = service.averageSales(sales);
        assertEquals(expectedAverageSales, actual);

    }

    @Test
    void maximumSales(int[] sales, int expectedMaximumSales) {
        StatsService service = new StatsService();
        int actual = service.maximumSales(sales);
        assertEquals(expectedMaximumSales, actual);
    }

    @Test
    void minimumSales(int[] sales, int expectedMinimumSales) {
        StatsService service = new StatsService();
        int actual = service.minimumSales(sales);
        assertEquals(expectedMinimumSales, actual);
    }

    @Test
    void numberBelowAverage(int[] sales, int expectedBelowAverage) {
        StatsService service = new StatsService();
        int actual = service.numberBelowAverage(sales);
        assertEquals(expectedBelowAverage, actual);
    }

    @Test
    void numberAboveAverage(int[] sales, int expectedAboveAverage) {
        StatsService service = new StatsService();
        int actual = service.numberAboveAverage(sales);
        assertEquals(expectedAboveAverage, actual);
    }
}
