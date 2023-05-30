package com.personservice.personservice.dto;

import java.util.List;

public record PersonDto(String firstName, String secondName, List<NoteDto> noteDtoList) {
}
