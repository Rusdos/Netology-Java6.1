package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {



    @ParameterizedTest
    @ValueSource(ints = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18})
    void salesAmount(int sales) {
        StatsService service = new StatsService();
        int[] newsales;
        for (int newsale : sales) {
            newsale = sales;
        }
        long actual = service.salesAmount(newsales);
        assertEquals(180, actual);
    }


    @Test
    void averageSales() {
    }

    @Test
    void maximumSales() {
    }

    @Test
    void minimumSales() {
    }

    @Test
    void numberBelowAverage() {
    }

    @Test
    void numberAboveAverage() {
    }
}
