package ejercicioTres;

import java.util.List;

public class Mayor extends Seleccion {
	@Override
	public Cola getPosInsert(List<Cola> multipleCola) {
		Cola mayor=multipleCola.get(0);// Supongo primer elemento menor y comparo con el resto, hasta que encuentro un menor y lo guardo
		for(int i=1; i<= multipleCola.size(); i++){
			if(multipleCola.get(i).cantidadElementosEstrctura() > mayor.cantidadElementosEstrctura()) {
				mayor=multipleCola.get(i);				
			}
		}
		return mayor;
	}

}
