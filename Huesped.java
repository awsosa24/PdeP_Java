import java.util.List;

public class Huesped extends Personaje {
	public Integer minutosRestantes;
	public List<Personaje> amigos;
	
	@Override  
	public Double felicidad() {
		return minutosRestantes * felicidadAmigos();
	}
	
	public Double felicidadAmigos() {
		return amigos.stream().mapToDouble(amigo -> amigo.felicidad()).sum();
	}
	
	@Override  
	public void consecuenciasDeConocerEscenario(Escenario escenario) {
		minutosRestantes -= 10;
	}

}
