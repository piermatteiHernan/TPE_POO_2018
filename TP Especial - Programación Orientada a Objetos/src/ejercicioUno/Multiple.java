package ejercicioUno;
import java.util.*;
public abstract class  Multiple extends Cola { 
	protected List<Cola> colaMultiple  = new ArrayList<>();;
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
	//Metodos abstractos de clase
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
