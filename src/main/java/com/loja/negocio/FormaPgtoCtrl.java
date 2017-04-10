package com.loja.negocio;

import java.io.Serializable;

import com.loja.beans.FormaPgto;

public class FormaPgtoCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	
	FormaPgto formaPgto = new FormaPgto();
	private String filtro = "";
	
	
	public FormaPgto getFormaPgto() {
		return formaPgto;
	}
	public void setFormaPgto(FormaPgto formaPgto) {
		this.formaPgto = formaPgto;
	}
	public String getFiltro() {
		return filtro;
	}
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	
	

}
