package com.julienvey.mapping.benchmark.mapper.dozer.converter;

import java.util.Calendar;
import java.util.Date;

import org.dozer.CustomConverter;
import org.dozer.MappingException;

public class DateToStringWithYearConverter implements CustomConverter {

    @Override
    public Object convert(Object destination, Object source, Class< ? > destClass, Class< ? > sourceClass) {
        if (source == null) {
            return null;
        }
        if (source instanceof Date) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime((Date ) source);
            return "" + calendar.get(Calendar.YEAR);
        } else if (source instanceof String) {
            throw new MappingException(
                            "Converter DateToStringWithYearConverter not supposed to be used in this way. Can only convert Date to String, not String to Date");
        } else {
            throw new MappingException(
                            "Converter DateToStringWithYearConverter used incorrectly. Arguments passed in were:"
                                            + destination + " and " + source);
        }
    }
}
