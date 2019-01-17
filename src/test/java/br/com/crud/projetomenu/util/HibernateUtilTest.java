package br.com.crud.projetomenu.util;

import org.hibernate.Session;
//import org.junit.Ignore;
import org.junit.Test;

import br.com.crud.projetomenu.util.HibernateUtil;

public class HibernateUtilTest {

	@Test
	//@Ignore
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getFabricaDeSessoes().close();
	}
	
}
