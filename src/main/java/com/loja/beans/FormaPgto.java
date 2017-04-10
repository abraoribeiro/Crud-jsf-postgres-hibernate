package com.loja.beans;

import javax.persistence.*;

@Entity
@Table (name="forma_pgto")
public class FormaPgto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="fgp_id")
	private int id;
	@Column (name="fgp_numMaxParc", nullable= true)
	private int numMaxParc;
	@Column (name="fgp_descricao", nullable= true)
	private String descricao;
	@Column (name="fgp_numPadraoParc", nullable= true)
	private int numPadraoParc;
	@Column (name="fgp_intervaloDias", nullable= true)
	private int intervaloDias;
	@Column (name="fgp_percentualAcres", nullable= true)
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
