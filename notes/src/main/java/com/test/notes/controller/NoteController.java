package com.test.notes.controller;

import com.test.notes.domain.Note;
import com.test.notes.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
@RequiredArgsConstructor
public class NoteController {

    private final NoteRepository noteRepository;
    @GetMapping
    public List<Note> getNoteByPersonId(@RequestParam Long personId){
        return noteRepository.findAllByPersonId(personId);
    }

    @PostMapping
    public Note createNode(@RequestBody Note note){
       return noteRepository.save(note);
    }
}
