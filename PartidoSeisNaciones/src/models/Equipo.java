package models;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private Naciones nombreNacion;
	private ArrayList<Jugador> plantillaJugadores = new ArrayList<Jugador>();
	private ArrayList<Entrenador> plantillaEntrenadores = new ArrayList<Entrenador>();
	private List<Jugador> alineacion = new ArrayList<Jugador>();
	private int partidosEmpatados;
	private int partidosPerdidos;
	private int partidosGanados;
	private int partidosJugados;
	private int mediaTeam;
	
	//Constructores
	
	
	public Equipo(int partidosGanados, int partidosJugados, int partidosPerdidos, int partidosEmpatados,
	            ArrayList<Jugador> jugadores, ArrayList<Entrenador> entrenadores) {
	        this.partidosGanados = partidosGanados;
	        this.partidosJugados = partidosJugados;
	        this.partidosPerdidos = partidosPerdidos;
	        this.partidosEmpatados = partidosEmpatados;
	        this.plantillaJugadores = jugadores;
	        this.plantillaEntrenadores = entrenadores;
    }
	
	public Equipo(Naciones nombreNacion) {
		this.nombreNacion = nombreNacion;
		partidosEmpatados = 0;
		partidosGanados = 0;
		partidosPerdidos = 0;
		partidosJugados = 0;
	}
	
	//Setter y getter de la alineacion
	
	
	public void setAlineacion(List<Jugador> alineacion) {
		this.alineacion = alineacion;
	}

	public List<Jugador> getAlineacion() {
		return alineacion;
	}

	// getter y setters de las variables
	
	public Naciones getNombreNacion() {
		return nombreNacion;
	}
	
	// media para el calculo de los puntos del equipo
	
	 public int dameMedia() {
	        for (int i = 0; i < plantillaJugadores.size(); i++) {
	            mediaTeam = plantillaJugadores.get(i).getMediaPuntos();
	        }
	        return mediaTeam;
	    }
	 
	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	// a�ade jugador y entrenador

	public void a�adirJugador(Jugador jugador) {
		plantillaJugadores.add(jugador);
	}
	
	public void a�adirEntrenador(Entrenador entrenador) {
		plantillaEntrenadores.add(entrenador);
	}
	
	//getter y setters de las plantillas

	public ArrayList<Jugador> getPlantilla() {
		return plantillaJugadores;
	}
	
	public ArrayList<Jugador> getPlantillaJugadores() {
		return plantillaJugadores;
	}

	public ArrayList<Entrenador> getPlantillaEntrenadores() {
		return plantillaEntrenadores;
	}
	
	// A�ade el historial del equipo
	
	public void addEmpatado() {
        partidosEmpatados++;
    }

    public void addGanado() {
        partidosGanados++;
    }

    public void addPartido() {
        partidosJugados++;
    }

    public void addPerdido() {
        partidosPerdidos++;
    }
	
	@Override
	public String toString() {
		return "\n\tEquipo [nombreNacion=" + nombreNacion + ", partidosGanados=" + partidosGanados + ", plantillaJugadores="
				+ plantillaJugadores + " plantillaEntrenadores=" + plantillaEntrenadores + ", alineacion=" + alineacion
				+ ", partidosEmpatados=" + partidosEmpatados + ", partidosPerdidos=" + partidosPerdidos + "]";
	}

}