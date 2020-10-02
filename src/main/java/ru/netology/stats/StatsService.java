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
        int number = 0;

        for (int sale : sales) {
            number += 1;
        }
        long average = salesAmount(sales) / number;
        return average;

    }

    public int maximumSales(int[] sales) {

        int maximum = sales[0];
        int month = 0;

        for (int i = 1; i < sales.length; i++) {
            if (maximum < sales[i]) {
                maximum = sales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int minimumSales(int[] sales) {

        int minimum = sales[0];
        int month = 0;
        for (int i = 1; i < sales.length; i++) {
            if (minimum > sales[i]) {
                minimum = sales[i];
                month = i + 1;
            }
        }
        return month;
    }

    public int numberBelowAverage(int[] sales) {
        int numberBelowAverage = 0;

        for (int sale : sales) {
            if (sale < averageSales(sales)) {
                numberBelowAverage += 1;
            }

        }
        return numberBelowAverage;
    }

    public int numberAboveAverage(int[] sales) {
        int numberAboveAverage = 0;

        for (int sale : sales) {
            if (sale > averageSales(sales)) {
                numberAboveAverage += 1;
            }

        }
        return numberAboveAverage;
    }

}


