package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("4.2545");
        bd1 = bd1.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd1);
    }

}
