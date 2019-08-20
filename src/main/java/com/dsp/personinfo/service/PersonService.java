package com.dsp.personinfo.service;

import com.dsp.personinfo.entity.Person;

import java.util.List;

/**
 * Created by Deepak on 8/17/19.
 */
public interface PersonService {
    Person createNewPerson(Person person);
    List<Person> getAllPersons();
}
