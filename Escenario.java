
public class Escenario {
	private String nombre="UnNombre";
	private Categoria categoria;
	
	public Integer fama() {
		return categoria.extra() + 100;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
