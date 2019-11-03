package com.bridgelabz.usernotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.usernotes.model.NotesInformation;

@Repository
public interface NotesRepository extends JpaRepository<NotesInformation, Long>{

}
