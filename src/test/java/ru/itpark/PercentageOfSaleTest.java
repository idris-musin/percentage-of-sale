package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PercentageOfSaleTest {

    @Test
    void calculate() {
        PercentageOfSale service = new PercentageOfSale();
        int[]sales ={12_000, 8_000, 15_000, 8_000};

        int bonus = service.calculate(sales);

        assertEquals(350, bonus);
    }
}