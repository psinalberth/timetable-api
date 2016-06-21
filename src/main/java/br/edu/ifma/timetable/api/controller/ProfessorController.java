package br.edu.ifma.timetable.api.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
public class ProfessorController {
	
	private Result result;
	private Professores professores;
	
	public ProfessorController() {
		
	}
	
	@Inject
	public ProfessorController(Result result, Professores professores) {
		this.result = result;
		this.professores = professores;
	}
	
	@Get("/professores")
	public void index() {
		result.use(Results.json()).withoutRoot().from(professores.findAll()).serialize();
	}
}
