package ejercicioDos;

import java.util.List;

public class Azar extends Seleccion{
	@Override
	public Cola getPosInsert(List<Cola> multipleCola) {
		int posAzar=(int)(Math.random()*multipleCola.size());
		return multipleCola.get(posAzar);
	}
}