package com.test.notes.repository;

import com.test.notes.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Long> {
    List<Note> findAllByPersonId(Long personId);
}
