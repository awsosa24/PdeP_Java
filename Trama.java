import java.util.List;
import java.util.stream.Collectors;

public class Trama {

		private List<Personaje> personajes;
		private Escenario escenario;
		
		public Escenario getEscenario() {
			return escenario;
		}

		public void setEscenario(Escenario escenario) {
			this.escenario = escenario;
		}

		public Double felicidadPersonajes() {
			return personajes.stream().mapToDouble(amigo -> amigo.felicidad()).sum();		
		}
		
		public Double complejidad() {
			return escenario.fama()/this.felicidadPersonajes();
		}
		
		public List<Personaje> renovar() {
			escenario.evolucionar();
			return personajes.stream().filter(personaje -> personaje.esRebelde()).collect(Collectors.toList());
		}
		
		public void cruzar(Trama otraTrama) {
			personajesConocenEscenario(otraTrama.getEscenario());
			cruzarPersonajes(otraTrama.getPersonajes());
		}
		public List<Personaje> getPersonajes() {
			return personajes;
		}

		public void setPersonajes(List<Personaje> personajes) {
			this.personajes = personajes;
		}

		public void personajesConocenEscenario(Escenario unEscenario) {
			// TODO Auto-generated method stub	
			personajes.forEach(personaje -> 
				personaje.conocerEscenario(unEscenario));
		}
		public void cruzarPersonajes(List<Personaje> otrosPersonajes) {
			// TODO Auto-generated method stub
			
			personajes.forEach(personaje -> 
				personaje.interactuarConMuchos(otrosPersonajes));	
		}
		
		public Boolean esAburrida() {
			return complejidad()>10;
		}	
}
