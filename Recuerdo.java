
public class Recuerdo {
	private String descripcion;
	private Escenario escenario;
	
	public Recuerdo(String descripcion, Escenario escenario) {
		this.descripcion = descripcion;
		this.escenario = escenario;
	}
	
	
	public Integer emotividad() {
		return descripcion.length() * escenario.fama();
	}
}
