package com.hdbandit.orika_mapper;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class TestOrika {

    public static void main(String[] args) {

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        // map Person-PersonBasicInfoDTO
        mapperFactory.classMap(Person.class, PersonBasicInfoDTO.class)
                .byDefault()
                .register();
        // map Person-PersonCompleteInfoDTO
        mapperFactory.classMap(Person.class, PersonCompleteInfoDTO.class)
                .byDefault()
                .register();

        MapperFacade mapper = mapperFactory.getMapperFacade();

        Person person = new Person();
        // set some field values
        person.setAddress("New York");
        person.setAge(32);
        person.setName("Peter");
        person.setSurname("Parker");
        person.setJobLocation("New York");
        person.setJobCategory("Super Hero");
        person.setSalary(0);

        // get basic info
        PersonBasicInfoDTO basicInfoDTO = mapper.map(person, PersonBasicInfoDTO.class);
        // get complete info
        PersonCompleteInfoDTO completeInfoDTO = mapper.map(person, PersonCompleteInfoDTO.class);

    }
}
