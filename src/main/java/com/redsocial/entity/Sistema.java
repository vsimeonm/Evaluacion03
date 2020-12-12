package com.redsocial.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sistemaevaluacion")
public class Sistema {

	@Id
	private int idSistema;
	private String nombre;
	private String formula;
	private String estado;
}
