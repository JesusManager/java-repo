package com.java.models.mappers;

import com.java.models.Person;
import com.java.models.daos.PersonDao;

public class PersonMapper {
    private PersonMapper(){}

    public static Person toPerson(PersonDao eventDao) {
        return new Person(
                eventDao.getUuid(),
                eventDao.getName()
        );
    }
    
}
