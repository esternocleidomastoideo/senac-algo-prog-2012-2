package br.com.senacrs.alp.aulas;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MinhaPilhaImpTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMinhaPilhaImp() {

		MinhaPilhaImp<Object> obj = null;

		try {
			obj = criarMinhaPilhaImp();
			Assert.assertNotNull(obj);
		} catch (Exception e) {
			fail("Não deveria lançar exceção");
		}
	}

	private <T> MinhaPilhaImp<T> criarMinhaPilhaImp() {

		MinhaPilhaImp<T> resultado = null;

		resultado = new MinhaPilhaImp<T>();

		return resultado;
	}

	@Test
	public void testGetMinhaLista() {

		MinhaPilhaImp<Object> obj = null;
		MinhaLista<Object> lista = null;

		obj = criarMinhaPilhaImp();
		lista = obj.getMinhaLista();
		Assert.assertNotNull(lista);
	}

}
