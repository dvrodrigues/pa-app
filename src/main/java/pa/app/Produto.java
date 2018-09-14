package pa.app;


public class Produto {
	private int id;
	private String descricao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}
	public Produto(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	
	
}
