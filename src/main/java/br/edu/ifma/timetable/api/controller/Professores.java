package br.edu.ifma.timetable.api.controller;

import javax.ejb.Stateless;

import br.edu.ifma.timetable.api.model.Professor;
import br.edu.ifma.timetable.api.repository.GenericRepository;

@Stateless
public class Professores extends GenericRepository<Professor> {
	
	public Professores() {
		super(Professor.class);
	}
}
