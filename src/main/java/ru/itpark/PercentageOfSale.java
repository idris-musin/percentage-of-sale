package ru.itpark;

public class PercentageOfSale {
    public int calculate (int[] sales) {
        int percent = 5;

        int sumBonus = 0;
        int minSumSale = 10_000;

        for (int sale : sales) {
            if (sale > minSumSale) {
                sumBonus += (sale - minSumSale) / 100 * percent;
            }
        }

        return sumBonus;
    }
}
