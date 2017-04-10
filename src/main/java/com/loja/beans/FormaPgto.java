package com.loja.beans;

import javax.persistence.*;

@Entity
@Table (name="forma_pgto")
public class FormaPgto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numMaxParc;
	private String descricao;
	private int numPadraoParc;
	private int intervaloDias;
	private float percentualAcres;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumMaxParc() {
		return numMaxParc;
	}
	public void setNumMaxParc(int numMaxParc) {
		this.numMaxParc = numMaxParc;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNumPadraoParc() {
		return numPadraoParc;
	}
	public void setNumPadraoParc(int numPadraoParc) {
		this.numPadraoParc = numPadraoParc;
	}
	public int getIntervaloDias() {
		return intervaloDias;
	}
	public void setIntervaloDias(int intervaloDias) {
		this.intervaloDias = intervaloDias;
	}
	public float getPercentualAres() {
		return percentualAcres;
	}
	public void setPercentualAres(float percentualAres) {
		this.percentualAcres = percentualAres;
	}
	
}
