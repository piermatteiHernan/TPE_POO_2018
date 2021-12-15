package ejercicioTres;

import java.util.List;

public class Menor extends Seleccion {
	@Override
	public Cola getPosInsert(List<Cola> multipleCola) {
		Cola menor=multipleCola.get(0);// Supongo primer elemento menor y comparo con el resto, hasta que encuentro un menor y lo guardo
		for(int i=1; i<= multipleCola.size(); i++){
			if(multipleCola.get(i).cantidadElementosEstrctura() < menor.cantidadElementosEstrctura()) {
				menor=multipleCola.get(i);				
			}
		}
		return menor;
	}
}