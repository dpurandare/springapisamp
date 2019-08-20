package com.dsp.personinfo.controller;

import com.dsp.personinfo.entity.Person;
import com.dsp.personinfo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Deepak on 8/17/19.
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public ResponseEntity<Person> createNewPerson(@Valid @RequestBody Person person){
        Person persistedPerson = personService.createNewPerson(person);
        return new ResponseEntity<Person>(persistedPerson, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Person>> getUsers(){
        List<Person> persons = personService.getAllPersons();
        return new ResponseEntity<>(persons, HttpStatus.OK);
    }
}
