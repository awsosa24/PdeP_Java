
public class Estandar extends Categoria {
	public Integer extra() {
		return 10;
	}

	public void evolucionar(Escenario escenario) {
		escenario.setCategoria(new DeLujo(0));
	}
}
