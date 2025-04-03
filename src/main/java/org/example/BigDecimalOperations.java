package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("4.2545");
        BigDecimal bd2 = new BigDecimal("1.2345");
        BigDecimal bd3 = new BigDecimal("-45.67");
        BigDecimal num = new BigDecimal("-1");
        bd1 = bd1.setScale(2, RoundingMode.HALF_UP);
        System.out.println(bd1);
        BigDecimal result1 = num.multiply(bd2);
        result1 = result1.setScale(1,RoundingMode.HALF_UP);
        BigDecimal result2 = num.multiply(bd3);
        result2 = result2.setScale(1,RoundingMode.HALF_UP);
        System.out.println(result1);
        System.out.println(result2);
    }

}
