package com.personservice.personservice.client;


import com.personservice.personservice.dto.NoteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "notes")
public interface NotesClients {
    @GetMapping("/api/v1/notes")
     List<NoteDto> getNotesByPersonId(@RequestParam Long personId);
}
