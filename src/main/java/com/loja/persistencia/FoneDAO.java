package com.loja.persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.loja.beans.Fone;
import com.loja.beans.Pessoa;

public class FoneDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public static void inserir(Fone fone) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.save(fone);
		t.commit();
		sessao.close();
	}

	public static void alterar(Fone fone) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.update(fone);
		t.commit();
		sessao.close();
	}

	public static void excluir(Fone fone) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Transaction t = sessao.beginTransaction();
		sessao.delete(fone);
		t.commit();
		sessao.close();
	}

	public static List<Pessoa> listagem(String filtro) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Query consulta;
		if (filtro.trim().length() == 0) {
			consulta = sessao.createQuery("from Fone order by fon_numero");
		} else {
			consulta = sessao.createQuery("from Fone " + "where pes_id like :parametro order by fon_numero");
			consulta.setString("parametro", "%" + filtro + "%");
		}
		List<Pessoa> lista = consulta.list();
		sessao.close();
		return lista;
	}

}
