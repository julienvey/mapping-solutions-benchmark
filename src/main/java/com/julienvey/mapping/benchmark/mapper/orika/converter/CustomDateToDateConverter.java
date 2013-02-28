package com.julienvey.mapping.benchmark.mapper.orika.converter;

import java.util.Date;

import com.julienvey.mapping.benchmark.domaineB.CustomDate;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.metadata.Type;

public class CustomDateToDateConverter extends CustomConverter<Date, CustomDate> {

    @Override
    public CustomDate convert(Date source, Type<? extends CustomDate> destinationType) {
        if(source == null){
            return null;
        }
        return CustomDate.fromDate(source);
    }
}
