import java.util.List;

public abstract class Personaje {

	protected Double energia;
	
	public Double getEnergia() {
		return energia;
	}

	public void setEnergia(Double energia) {
		this.energia = energia;
	}
	
	public Double felicidad() {return Double.valueOf(0.0);}
	
	
	public Double rebeldia() {		
		return (1 / felicidad()); 
	}
	
	public void consecuenciasDeConocerEscenario(Escenario escenario) {}
	
	
	public void conocerEscenario(Escenario escenario) {
		energia -= escenario.fama();
		consecuenciasDeConocerEscenario(escenario);
		escenario.aumentarVisitas();
	}
	
	public Boolean esRebelde() {
		return rebeldia() > 10;
	}

	public void interactuar() {
		energia /= 2;
	}

	public void interactuarCon(Personaje personaje) {
		personaje.interactuar();
	}
	
	public void interactuarConMuchos(List<Personaje> personajes) {
		personajes.forEach(personaje -> {
			interactuar();
			interactuarCon(personaje);
		});
	}
}
