
public class DeLujo extends Categoria {

	private Integer visitas;
	
	public DeLujo(Integer visitas) {
		super();
		this.visitas = visitas;
	}
	
	@Override
	public Integer extra() {
		return visitas;
	}
	@Override
	public void aumentarVisitas() {
		visitas ++;
	}
	
	@Override
	public void evolucionar(Escenario escenario) {
		throw new RuntimeException ("esta categoria no puede evolucionar");
	}
}
