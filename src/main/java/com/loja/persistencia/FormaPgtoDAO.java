package com.loja.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.loja.beans.FormaPgto;
import com.loja.beans.Pessoa;

public class FormaPgtoDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	public static void inserir(FormaPgto fp) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(fp);
		t.commit();
		sessao.close();
	}

	public static void alterar(FormaPgto fp) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.update(fp);
		t.commit();
		sessao.close();
	}

	public static void excluir(FormaPgto fp) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.delete(fp);
		t.commit();
		sessao.close();
	}

	public static List<Pessoa> listagem(String filtro) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Query consulta;
		if (filtro.trim().length() == 0) {
			consulta = sessao.createQuery("from FormaPgto order by fpg_id");
		} else {
			consulta = sessao.createQuery("from FormaPgto " + "where pes_descricao like :parametro order by fgp_id");
			consulta.setString("parametro", "%" + filtro + "%");
		}
		List<Pessoa> lista = consulta.list();
		sessao.close();
		return lista;
	}

}
