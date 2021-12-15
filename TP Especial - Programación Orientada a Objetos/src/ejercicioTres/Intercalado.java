package ejercicioTres;

import java.util.List;

public class Intercalado extends Seleccion {
	int ultimaIntercalada=0;
	@Override
	public Cola getPosInsert(List<Cola> multipleCola) {
		if(ultimaIntercalada > multipleCola.size()) {
			ultimaIntercalada=0;//Reseteo el indice de intercalado por llegar al maximo de la lista
		}
			int posAux =ultimaIntercalada;//Guardo la pos que voy a retornar, asi puedo avanzar la original para la proxima invocacion
			ultimaIntercalada++;
			return multipleCola.get(posAux);			
	}
}