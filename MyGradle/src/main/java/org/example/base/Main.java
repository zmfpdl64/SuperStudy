package org.example.base;

import org.example.person.Person;
import org.example.person.PersonDto;
import org.example.person.PersonMapStruct;

public class Main {
    public static void main(String[] args) {
        PersonDto dto = new PersonDto("name", 10, "여자");

        Person person = PersonMapStruct.INSTANCE.personDtoToPerson(dto);
        System.out.println(dto);
        System.out.println(person);
    }
}
