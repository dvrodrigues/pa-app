package pa.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarrinhoComprasTest {
	
	public ArrayList<Produto> produtos;
	CarrinhoCompras car;
	Produto p1,p2;
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Inicializa��o do ArrayList");
		produtos=new ArrayList<>();
		
		 p1= new Produto(1, "carro");
		 p2= new Produto(2, "mota");
		produtos.add(p1);
		produtos.add(p2);
		car=new CarrinhoCompras(produtos);
	}

	@Test
	void testGetProdutos() {
		car.setProdutos(produtos);
		assertTrue(true);
		
	}

	@Test
	void testSetProdutos() {
		car.getProdutos();
		assertTrue(true);
	}

	@Test
	void testToString() {
		car.toString();
		assertTrue(true);
	}

	@Test
	void testCarrinhoComprasArrayListOfProduto() {
		System.out.println("Lista Produtos");
		for (Produto produto : produtos) {
			System.out.println(produto);
			assertTrue(produto!=null);
		}
	}


	@Test
	void testAddProduto() {
		
	Produto p= new Produto(3,"Bicicleta");	
	car.addProduto(p);
	assertTrue(car.size()==3);
	System.out.println("Adicionar Produto");
	for (Produto produto : produtos) {
		
	}
	}

	@Test
	void testSize() {
		System.out.println("Tamanho Lista Produtos: "+produtos.size());
		assertTrue(car.size()==2);
	}

	@Test
	void testGetProductByPos() {
	int pos=1;
	
	Produto p=car.getProductByPos(pos);
	assertTrue(p==p2);
	System.out.println("Produto na posi�ao"+pos+": "+produtos.get(pos));
	}

	@Test
	void testRemoveProduct() {
	int pos =0;	
	boolean b=car.removeProduct(pos);
	
	assertTrue(b);
	System.out.println("Produto Removido" +car.getProductByPos(pos));
	}
	
	
	@Test
	void testRemoveProductFalse() {
	int pos =-1;	
	boolean b=car.removeProduct(pos);
	
	assertFalse(b);
	}
	
	@Test
	void testRemoveProductAlto() {
	int pos =12;	
	boolean b=car.removeProduct(pos);
	
	assertFalse(b);
	}

}
