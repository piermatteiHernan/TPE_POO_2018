package ejercicioTres;

import java.util.ArrayList;
import java.util.*;

public class  Multiple extends Cola { 
	private List<Cola> colaMultiple  = new ArrayList<>();
	private Seleccion seleccionAgre;
	private Seleccion seleccionRec;
	// Metodos concretos de clase Multiple
	public void setMultiple(Cola otraCola) {
		colaMultiple.add(otraCola);
	}
	public Cola getMultiple(int indice) {//Lo utilizo para revisar elementos propios de una cola multiple si es necesario a la hora de implementarla
		if (colaMultiple.size()>0) { //Por si la cola esta vacia
			return colaMultiple.get(indice);
		}
		return null;
	}
	public void setSeleccion(Seleccion selec1, Seleccion selec2) {
		this.seleccionAgre=selec1;
		this.seleccionRec=selec2;
	}
	//Metodos abstractos de clase
	@Override
	public void agregarElemento(Object elemento) {
		this.seleccionAgre.getPosInsert(colaMultiple).agregarElemento(elemento);		
	}
	@Override
	public Object recuperarElemento() {
		return this.seleccionRec.getPosInsert(colaMultiple).recuperarElemento();
		}
	
	@Override
	public int cantidadElementosEstrctura() {
		int cantidad=0;
		for(Cola aux: this.colaMultiple) {
			cantidad += aux.cantidadElementosEstrctura(); //Acumulo el total de elementos de la estructura "colaMultiple"
		}
		return cantidad;
	}

	@Override
	public Cola colaTerminalMayor() {
		Cola colaMayor = null;
		int auxMayor=-1;
		for(Cola colaAux: this.colaMultiple){
			Cola aux = colaAux.colaTerminalMayor();
			if (aux.cantidadElementosEstrctura() > auxMayor) {
					colaMayor = aux;
					auxMayor=aux.cantidadColasTerminales();
			}
		}
		return (Terminal)colaMayor; //Hago el casting para que me retorne la mayor terminal
	}

	@Override
	public int cantidadColasTerminales() {
		int cantidad =0;
		for(Cola colaAux: this.colaMultiple) {
			cantidad+= colaAux.cantidadColasTerminales();
		}
		return cantidad;
	}
	

}
