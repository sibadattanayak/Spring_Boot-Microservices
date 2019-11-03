package com.bridgelabz.usernotes.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bridgelabz.usernotes.model.NotesInformation;
import com.bridgelabz.usernotes.repository.NotesRepository;

@Component
public class NotesServiceImplementation implements NotesService {

	@Autowired
	private NotesRepository notesRepository;
	@Autowired
	private NotesInformation noteInformation;

	@Override
	public Boolean createNote(String noteData) {
		noteInformation.setNoteData(noteData);
		notesRepository.save(noteInformation);
		return true;
	}

	@Override
	public Boolean deleteNote(Long id) {
		Optional<NotesInformation> noteInfo = notesRepository.findById(id);
		if (noteInfo.isPresent()) {
			notesRepository.deleteById(id);
			return true;
		} else
			return null;
	}

}
