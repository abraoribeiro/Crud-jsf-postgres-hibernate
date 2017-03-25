package com.loja.negocio;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.loja.beans.Produto;
import com.loja.persistencia.ProdutoDAO;

@ManagedBean (name="viewProdutos")
@SessionScoped
public class ProdutoCtrl implements Serializable {

	private static final long serialVersionUID = 1L;

	private Produto produto = new Produto();

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getListagem() {
		return ProdutoDAO.listagem("");
	}

	public String actionGravar() {
		
		System.out.println( produto.getId());
		if (produto.getId() == 0) {
			System.out.println("entrou");
			ProdutoDAO.inserir(produto);
			return actionInserir();
		} else {
			ProdutoDAO.alterar(produto);
			return "lista_produto";
		}
	}

	public String actionInserir() {
		produto = new Produto();
		return "form_produto";
	}

	public String actionExcluir(Produto p) {
		ProdutoDAO.excluir(p);
		return "lista_produto";
	}

	public String actionAlterar(Produto p) {
		produto = p;
		return "form_produto";
	}
}
