
public class Escenario {
	private String nombre;
	private Categoria categoria;
	
	public Integer fama() {
		return categoria.extra() + 100;
	}
	
	public void aumentarVisitas() {
		categoria.aumentarVisitas();
	}
	
	public void evolucionar() {
		categoria.evolucionar(this);
	}

	public Categoria getCategoria() {
		return categoria;		
	}

	public void setCategoria(Categoria categoria) {
		this.categoria= categoria;		
	}

}
