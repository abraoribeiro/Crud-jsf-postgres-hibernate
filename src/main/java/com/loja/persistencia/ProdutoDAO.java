package com.loja.persistencia;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.loja.beans.Produto;

public class ProdutoDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void inserir(Produto p) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(p);
		t.commit();
		sessao.close();
	}

	public static void alterar(Produto p) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.update(p);
		t.commit();
		sessao.close();
	}

	public static void excluir(Produto p) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.delete(p);
		t.commit();
		sessao.close();
	}

	public static List<Produto> listagem(String filtro) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Query consulta;
		if (filtro.trim().length() == 0) {
			consulta = sessao.createQuery("from Produto order by pro_nome");
		} else {
			consulta = sessao.createQuery("from Produto where pro_nome like :parametro" + "order by pro_nome");
			consulta.setString("parametro", "%" + filtro + "%");
		}
		List<Produto> lista = consulta.list();
		sessao.close();
		return lista;
	}

}
