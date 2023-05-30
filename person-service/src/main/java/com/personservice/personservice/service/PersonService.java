package com.personservice.personservice.service;

import com.personservice.personservice.domain.Person;
import com.personservice.personservice.dto.PersonDto;

import java.util.List;
import java.util.Optional;

public interface PersonService {

   Person save(Person person);
   List<Person> findAll();

   PersonDto getWithNotesById(Long personId);
}
