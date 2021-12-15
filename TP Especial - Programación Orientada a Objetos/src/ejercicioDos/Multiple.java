package ejercicioDos;

import java.util.ArrayList;
import java.util.List;

public class  Multiple extends Cola { 
	private List<Cola> colaMultiple  = new ArrayList<>();
	private Seleccion seleccion; //Estructura que sirve para diferenciar la forma que se agrega y recupera en la cola
	// Metodos concretos de clase Multiple
	public void setMultiple(Cola otraCola) {
		colaMultiple.add(otraCola);
	}
	public void setSeleccion(Seleccion selec) { //Selecciona el modo de agregar y recuperar en la cola
		this.seleccion=selec;
	}
	//Metodos abstractos de clase
	@Override
	public void agregarElemento(Object elemento) {
		this.seleccion.getPosInsert(colaMultiple).agregarElemento(elemento);		
	}
	@Override
	public Object recuperarElemento() {
		return this.seleccion.getPosInsert(colaMultiple).recuperarElemento();
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
