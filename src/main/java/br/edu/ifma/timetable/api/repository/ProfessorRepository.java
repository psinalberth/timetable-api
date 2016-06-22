package br.edu.ifma.timetable.api.repository;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import br.edu.ifma.timetable.api.model.Professor;

@RequestScoped
public interface ProfessorRepository {
	
	public List<Professor> findAll();
}
