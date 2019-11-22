import java.util.List;

public class Huesped extends Personaje {
	public Integer minutosRestantes;
	public List<Personaje> amigos;
	
	@Override  
	public Double felicidad() {
		return minutosRestantes * felicidadAmigos();
	}
	
	public Double felicidadAmigos() {
		//TO DO !!
		//return amigos.stream().map(a -> a.felicidad()).reduce(identity, accumulator);
		//amigos.sum({amigo => amigo.felicidad()})
		return felicidad();
	}
	
	@Override  
	public void consecuenciasDeConocerEscenario(Escenario escenario) {
		minutosRestantes -= 10;
	}

}
