package com.loja.teste;

import com.loja.beans.Pessoa;
import com.loja.beans.Produto;
import com.loja.negocio.ProdutoCtrl;
import com.loja.persistencia.HibernateUtil;
import com.loja.persistencia.PessoaDAO;
import com.loja.persistencia.ProdutoDAO;

public class Teste {

	public static void main(String[] args) {
		/*
		Produto p = new Produto();
		Pessoa pe = new Pessoa();
		p.setNome("sabao");
		p.setPreco(25);
		pe.setNome("joao");
		pe.setBairro("bairro");
		System.out.println(p.getId());
		*/
		ProdutoDAO pd = new ProdutoDAO();
		PessoaDAO ped = new PessoaDAO();
	//	pd.listagem("kkk");
	//	ped.inserir(pe);
		
		//ProdutoCtrl pc = new ProdutoCtrl();
	//	pc.actionGravar();
		
		HibernateUtil.getSessionFactory().openSession();
		
		
		HibernateUtil.getSessionFactory().close();
		System.out.println("sucesso");
	}

}
