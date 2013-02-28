package com.julienvey.mapping.benchmark.mapper.utils;

import static org.fest.assertions.Assertions.assertThat;

import com.julienvey.mapping.benchmark.domaineB.CustomDate;

public class CustomDateUtils {

    private CustomDateUtils() {
    }

    public static void assertCustomDateEquals(CustomDate date1, CustomDate date2) {
        if (date1 == null || date2 == null) {
            assertThat(date1).isNull();
            assertThat(date2).isNull();
        } else {
            assertThat(date1.getDay()).isEqualTo(date2.getDay());
            assertThat(date1.getHour()).isEqualTo(date2.getHour());
            assertThat(date1.getMinute()).isEqualTo(date2.getMinute());
            assertThat(date1.getMonth()).isEqualTo(date2.getMonth());
            assertThat(date1.getSecond()).isEqualTo(date2.getSecond());
            assertThat(date1.getYear()).isEqualTo(date2.getYear());
        }
    }
}
