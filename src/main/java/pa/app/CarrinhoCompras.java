package pa.app;
import java.util.List;

public class CarrinhoCompras {
	
	private List<Produto> produtos;

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "CarrinhoCompras [produtos=" + produtos + "]";
	}

	public CarrinhoCompras(List<Produto> produtos) {
		super();
		this.produtos = produtos;
	}


	
	
	public void addProduto(Produto p) {
		produtos.add(p);
	}
	
	public int size() {
		return produtos.size();
	}
	
	public Produto getProductByPos(int pos) {
		return produtos.get(pos);
	}
	
	public boolean removeProduct(int pos) {
		if(pos<0 ||pos> produtos.size()) {
			return false;
		}else {
			produtos.remove(pos);
			return true;
		}
	}
	
}
