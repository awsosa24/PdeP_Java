import java.util.List;

public class Anfitrion extends Personaje {
	private static final Integer FACTOR_PARQUE = 10;  
	private Double velocidadProcesamiento;
	private List<Recuerdo> recuerdos; 
	
	@Override 
	public Double felicidad() {
		return super.getEnergia() / velocidadProcesamiento * FACTOR_PARQUE;
	}
	
	@Override 
	public void consecuenciasDeConocerEscenario(Escenario escenario) {
		recuerdos.add(new Recuerdo("Conoci un escenario", escenario));
	}
	
	@Override 
	public void interactuar() {
		super.interactuar();
		velocidadProcesamiento /=2;
	}

}
