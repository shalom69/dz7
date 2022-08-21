package ru.netology.stats;

public class StatsService {

    public long sumAllSale(long[] sales){

       long sum = 0;

       for (long i : sales) {
           sum = sum + i;
       }
       return sum;
    }
    public long averageSumSales(long[] sales){

        long sum = sales[0];

        for (long i : sales) {
            sum = sum + i;
        }
        long avrSum = sum / sales.length;

        return avrSum;
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
    public int numberMonthsMinSales(long[] sales) {

        long nombMonthMin = 0;
        long avr = averageSumSales(sales);

        for (int i = 0; i < sales.length ; i++) {
            if (sales[i] < avr) {
                nombMonthMin = nombMonthMin + 1;
            }
        }
        return (int) nombMonthMin;
    }
    public int numberMonthsMaxSales(long[] sales) {

        long nombMonthMax = 0;
        long avr = averageSumSales(sales);

        for (int i = 0; i < sales.length ; i++) {
            if (sales[i] < avr) {
                nombMonthMax = nombMonthMax + 1;
            }
        }
        return (int) nombMonthMax;
    }
}
