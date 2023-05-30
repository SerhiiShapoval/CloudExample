package com.personservice.personservice.controller;

import com.personservice.personservice.domain.Person;
import com.personservice.personservice.dto.PersonDto;
import com.personservice.personservice.service.PersonServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/persons")
@RequiredArgsConstructor
public class PersonController {
    private final PersonServiceImpl personService;

    @PostMapping
    public Person createPerson(@RequestBody Person person){
        return personService.save(person);
    }

    @GetMapping
    public List<Person> allPerson(){
        return personService.findAll();
    }

    @GetMapping("/{personId}")
    public PersonDto personWithNotes(@PathVariable Long personId){
        return personService.getWithNotesById(personId);
    }

}
