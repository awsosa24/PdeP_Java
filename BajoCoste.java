
public class BajoCoste extends Categoria {
	private String zona;
	
	@Override
	public Integer extra() {
		return zona.length();
	}
	
	@Override
	public void evolucionar(Escenario escenario) {
		escenario.setCategoria(new Estandar());
	}
}
