package com.julienvey.mapping.benchmark.mapper.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Date;

import com.google.common.collect.Lists;
import com.julienvey.mapping.benchmark.domaineB.CustomDate;

public class ValueGenerator {

    private static SecureRandom random = new SecureRandom();

    private ValueGenerator() {
    }

    public static String getAString() {
        return new BigInteger(130, random).toString(32);
    }

    public static ArrayList<String> getAStringList() {
        return Lists.newArrayList(getAString(), getAString(), getAString());
    }

    public static Integer getAnIntegerBetween(int start, int end) {
        return doGetIntegerBetween(start, end, Math.random());
    }

    private static Integer doGetIntegerBetween(int start, int end, double randomDouble) {
        int coeff = end - start;
        return (int ) (randomDouble * coeff + start);
    }

    public static Boolean getABoolean() {
        return random.nextBoolean();
    }

    public static Date getADate() {
        return new Date(random.nextLong());
    }

    public static CustomDate getACustomDate() {
        return new CustomDate(getAnIntegerBetween(1, 28), getAnIntegerBetween(1, 12), getAnIntegerBetween(1900, 2010),
                        getAnIntegerBetween(0, 23), getAnIntegerBetween(0, 59), getAnIntegerBetween(0, 59));
    }

    public static Integer getAnInteger() {
        return random.nextInt();
    }

    public static Double getADouble() {
        return random.nextDouble();
    }

    public static Long getALong() {
        return random.nextLong();
    }

    public static BigInteger getABigInteger() {
        return new BigInteger(130, random);
    }

    public static BigDecimal getABigDecimal() {
        return BigDecimal.valueOf(getADouble());
    }

    public static Long getAPositiveLong() {
        return Math.abs(random.nextLong());
    }

}
