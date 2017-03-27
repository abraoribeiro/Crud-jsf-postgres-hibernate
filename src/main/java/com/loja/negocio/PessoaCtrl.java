package com.loja.negocio;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.loja.beans.Fone;
import com.loja.beans.Pessoa;
import com.loja.persistencia.PessoaDAO;

@ManagedBean(name = "viewPessoas")
@SessionScoped
public class PessoaCtrl implements Serializable {

	private static final long serialVersionUID = 1L;
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getListagem() {
		return PessoaDAO.listagem("");
	}

	
	public String actionGravar() {
		if (pessoa.getId() == 0) {
			PessoaDAO.inserir(pessoa);
			return actionInserir();
		} else {
			PessoaDAO.alterar(pessoa);
			return "lista_pessoas";
		}
	}

	public String actionInserir() {
		pessoa = new Pessoa();
		return "form_pessoa";
	}

	public String actionExcluir(Pessoa p) {
		PessoaDAO.excluir(p);
		return "lista_pessoas";
	}

	public String actionAlterar(Pessoa p) {
		pessoa = p;
		return "form_pessoa";
	}
	
	public String actionInserirFone(){
		Fone fone = new Fone();
		fone.setPessoa(pessoa);
		pessoa.getFones().add(fone);
		return "lista_pessoas";
	}
	public String actionExcluirFone(){
		
		return "lista_pessoas";
	}
}