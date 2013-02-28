package com.julienvey.mapping.benchmark.mapper.dozer.converter;

import java.util.Date;

import org.dozer.CustomConverter;
import org.dozer.MappingException;

import com.julienvey.mapping.benchmark.domaineB.CustomDate;

public class CustomDateToDateConverter implements CustomConverter {

    @Override
    public Object convert(Object destination, Object source, Class< ? > destClass, Class< ? > sourceClass) {
        if (source == null) {
            return null;
        }
        if (source instanceof Date) {
            return CustomDate.fromDate((Date ) source);
        } else if (source instanceof CustomDate) {
            return CustomDate.toDate((CustomDate ) source);
        } else {
            throw new MappingException(
                            "Converter CustomDateToDateConverter used incorrectly. Arguments passed in were:"
                                            + destination + " and " + source);
        }
    }
}
