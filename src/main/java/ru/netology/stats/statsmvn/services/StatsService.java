package ru.netology.stats.statsmvn.services;

public class StatsService {

    public long sum(long[] sales) {

        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowAverage(long[] sales) {
        long averageSales = average(sales);
        int count = 0;
        long minSale = sales[0];
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int highAverage(long[] sales) {
        long averageSales = average(sales);
        int count = 0;
        long maxSale = sales[0];
        for (long sale : sales) {
            if (sale > averageSales) {

                count++;
            }
        }
        return count;
    }
}