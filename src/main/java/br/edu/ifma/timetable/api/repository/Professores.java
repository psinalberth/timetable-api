package br.edu.ifma.timetable.api.repository;

import javax.ejb.Stateless;

import br.edu.ifma.timetable.api.model.Professor;

@Stateless
public class Professores extends GenericRepository<Professor> {
	
	public Professores() {
		super(Professor.class);
	}
}
