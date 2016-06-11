package com.example.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Matricula {
	@Id
	private Integer id_alumno;

	private Integer id_curso;
	
	public Matricula(Integer id_curso, Integer id_alumno) {
		this.id_curso 	= id_curso;
		this.id_alumno 	= id_alumno;
	}

}
