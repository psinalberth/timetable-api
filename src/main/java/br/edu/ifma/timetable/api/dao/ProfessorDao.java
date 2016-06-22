package br.edu.ifma.timetable.api.dao;

import java.util.List;

import javax.ejb.Stateless;

import br.edu.ifma.timetable.api.model.Professor;
import br.edu.ifma.timetable.api.repository.GenericRepository;
import br.edu.ifma.timetable.api.repository.ProfessorRepository;

@Stateless
public class ProfessorDao extends GenericRepository<Professor> implements ProfessorRepository {
	
	public ProfessorDao() {
	}
	
	public ProfessorDao(Class<Professor> clazz) {
		super(Professor.class);
	}

	@Override
	public List<Professor> findAll() {		
		return manager.createQuery("from Professor", Professor.class).getResultList();
	}
	
}
