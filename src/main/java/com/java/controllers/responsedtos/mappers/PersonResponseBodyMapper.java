package com.java.controllers.responsedtos.mappers;

import com.java.controllers.responsedtos.PersonResponseBody;
import com.java.models.Person;

public class PersonResponseBodyMapper {
    private PersonResponseBodyMapper(){}
    
    public static PersonResponseBody fromPerson(Person person) {
        return new PersonResponseBody(
                person.getUuid().toString(),
                person.getName()
        );
    }
}
