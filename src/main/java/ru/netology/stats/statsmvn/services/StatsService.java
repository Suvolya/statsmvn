package ru.netology.stats.statsmvn.services;

public class StatsService {

    public static Integer calculateSum(long[] sales) {

        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public static Integer calculateArithmetic(long[] sales) {

        int result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result / sales.length;
    }

    public static Integer calculateMaxSales(long[] sales) {
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

    public static Integer calculateMinSales(long[] sales) {
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

    public static Integer calculateBelowArithmetic(long[] sales) {

        int result = 0;
        for (long sale : sales) {
            result += sale;
        }
        int count = 0;
        long minSale = sales[0];
        for (long sale : sales) {
            if (sale < result / sales.length) {

                count++;
            }
        }
        return count;
    }

    public static Integer calculateAboveArithmetic(long[] sales) {

        int result = 0;
        for (long sale : sales) {
            result += sale;
        }
        int count = 0;
        long maxSale = sales[0];
        for (long sale : sales) {
            if (sale > result / sales.length) {

                count++;
            }
        }
        return count;
    }
}