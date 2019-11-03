package com.bridgelabz.usernotes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Notes_Information")
public class NotesInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long noteId;
	private String NoteData;

	public NotesInformation() {
		super();
	}

	public NotesInformation(Long noteId, String noteData) {
		
		this.noteId = noteId;
		NoteData = noteData;
	}

	public Long getNoteId() {
		return noteId;
	}

	public void setNoteId(Long noteId) {
		this.noteId = noteId;
	}

	public String getNoteData() {
		return NoteData;
	}

	public void setNoteData(String noteData) {
		NoteData = noteData;
	}

}
