package com.julienvey.mapping.benchmark.mapper.orika;

import org.springframework.stereotype.Component;

import com.julienvey.mapping.benchmark.domainA.ObjectFirstLevelA;
import com.julienvey.mapping.benchmark.domainA.ObjectSecondLevelA;
import com.julienvey.mapping.benchmark.domaineB.ObjectFirstLevelB;
import com.julienvey.mapping.benchmark.domaineB.ObjectSecondLevelB;
import com.julienvey.mapping.benchmark.mapper.orika.converter.CustomDateToDateConverter;
import com.julienvey.mapping.benchmark.mapper.orika.converter.DateToStringWithYearConverter;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

@Component
public class OrikaMapper {

    MapperFactory mapperFactory;

    public OrikaMapper() {
        mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.getConverterFactory().registerConverter(new CustomDateToDateConverter());
        mapperFactory.getConverterFactory().registerConverter("DateToStringWithYearConverter", new DateToStringWithYearConverter());

        mapperFactory.classMap(ObjectFirstLevelA.class, ObjectFirstLevelB.class).field("sinitres[0].roles[0].prenom", "fakeValue").byDefault().register();

        mapperFactory.classMap(ObjectSecondLevelA.class, ObjectSecondLevelB.class)
                        .field("dateDeclaration", "dateDeclaration")
                        .fieldMap("dateDeclaration", "exDeclaration").converter("DateToStringWithYearConverter").add()
                        .byDefault().register();
    }

    public MapperFacade get(){
        return mapperFactory.getMapperFacade();
    }
}
