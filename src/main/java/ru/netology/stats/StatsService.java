package ru.netology.stats;

public class StatsService {

    public long salesAmount(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public long averageSales(int[] sales) {

        long average = salesAmount(sales) / sales.length;
        return average;

    }

    public int maximumSales(int[] sales) {

        int maximum = sales[0];
        int month = 1;

        for (int i = 1; i <= sales.length; i++) {
            if (maximum < sales[i]) {
                maximum = sales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int minimumSales(int[] sales) {

        int minimum = sales[0];
        int month = 1;
        for (int i = 1; i <= sales.length; i++) {
            if (minimum > sales[i]) {
                minimum = sales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int numberBelowAverage(int[] sales) {
        int numberBelowAverage = 0;
        long averageSale = averageSales(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                numberBelowAverage += 1;
            }

        }
        return numberBelowAverage;
    }

    public int numberAboveAverage(int[] sales) {
        int numberAboveAverage = 0;
        long averageSale = averageSales(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                numberAboveAverage += 1;
            }

        }
        return numberAboveAverage;
    }

}


