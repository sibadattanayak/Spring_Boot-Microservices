package com.bridgelabz.usernotes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.usernotes.model.NotesInformation;
import com.bridgelabz.usernotes.service.NotesService;
import com.bridgelabz.usernotes.service.NotesServiceImplementation;

@RestController
@RequestMapping(value = "usernotes")
public class NotesController {
	@Autowired
	private NotesInformation notesInformation;
	NotesService notesService = new NotesServiceImplementation();

	@PostMapping(value = "/createnote")
	public ResponseEntity<NotesInformation> createNote(@RequestBody String noteData) {
		notesService.createNote(noteData);
		return new ResponseEntity(notesInformation,HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/deletenote")
	public ResponseEntity<NotesInformation> deleteNote(@RequestHeader Long id)
	{
		notesService.deleteNote(id);
		return new ResponseEntity<NotesInformation>(notesInformation,HttpStatus.OK);
	}

}
