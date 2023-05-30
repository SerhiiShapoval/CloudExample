package com.personservice.personservice.service;

import com.personservice.personservice.client.NotesClients;
import com.personservice.personservice.domain.Person;
import com.personservice.personservice.dto.PersonDto;
import com.personservice.personservice.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;
    private final NotesClients notesClients;

    @Override
    public List<Person> findAll() {
       return personRepository.findAll();
    }

    @Override
    public Person save(Person person) {

        return personRepository.save(person);
    }

    @Override
    public PersonDto getWithNotesById(Long personId) {
        var person = personRepository.findById(personId)
                .orElseThrow();
        var notes = notesClients.getNotesByPersonId(personId);

        return new PersonDto(person.getFirstName(), person.getSecondName(), notes);
    }
}
