package pa.app;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoTest {
	Produto p1,p2;
	
	@BeforeEach
	void beforeEach() {
		
		 p1= new Produto(1, "carro");
		 p2= new Produto(2, "mota");
	}
	
	@Test
	void testGetId() {
		assertTrue(p1.getId()==1);
	}

	@Test
	void testSetId() {
		int newId=3;
		p1.setId(newId);
		assertTrue(p1.getId()==3);
	}

	@Test
	void testGetDescricao() {
		assertTrue(p1.getDescricao()=="carro");
	}

	@Test
	void testSetDescricao() {
		String newDescricao="novo";
		p1.setDescricao(newDescricao);
		assertTrue(p1.getDescricao()==newDescricao);
	}

	@Test
	void testToString() {
		assertEquals(p1.toString(),"Produto [id=1, descricao=carro]");
	}


	@Test
	void testProduto() {
		Produto p=new Produto(3,"Camiao");
		assertTrue(p!=null);
	}

}
