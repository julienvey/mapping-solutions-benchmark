package com.julienvey.mapping.benchmark.mapper.orika.converter;

import java.util.Calendar;
import java.util.Date;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class DateToStringWithYearConverter extends CustomConverter<Date, String> {

    @Override
    public String convert(Date source, Type< ? extends String> destinationType) {
        if (source == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(source);
        return "" + calendar.get(Calendar.YEAR);
    }
}
