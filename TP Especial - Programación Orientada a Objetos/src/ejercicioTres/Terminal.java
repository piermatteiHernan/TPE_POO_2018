package ejercicioTres;

import java.util.ArrayList;
import java.util.List;

public class Terminal extends Cola {
	private List<Object> colaTerminal = new ArrayList<>();;
	@Override
	public void agregarElemento(Object elemento) {
		colaTerminal.add(elemento);
	}
	@Override
	public Object recuperarElemento() {
		if(colaTerminal.size() != 0) { //Control de cola vacia
			Object aux = colaTerminal.get(0);
			colaTerminal.remove(0);
			return aux;
		}
		else
			return null;
	}

	@Override
	public int cantidadElementosEstrctura() {
		return colaTerminal.size(); // Utilizo el .size() de la lista, porque estoy en una cola terminal y no poseo subcolas, posee unicamente elemntos
	}
	//Metodos abstractos auto-generados, no se utilizan en esta clase.
	@Override
	public Cola colaTerminalMayor() {
		return this;
	}

	@Override
	public int cantidadColasTerminales() {
		return 1;
	}

}
