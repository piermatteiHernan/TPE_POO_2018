package ejercicioUno;

public class Intercalado extends Multiple {
	int ultimaIntercalada=0;
	private Cola getPosIntercalado() {
		if(ultimaIntercalada > colaMultiple.size()) {
			ultimaIntercalada=0;//Reseteo el indice de intercalado por llegar al maximo de la lista
		}
			int posAux =ultimaIntercalada;//Guardo la pos que voy a retornar, asi puedo avanzar la original para la proxima invocacion
			ultimaIntercalada++;
			return colaMultiple.get(posAux);			
	}
	
	@Override
	public void agregarElemento(Object elemento) {
		getPosIntercalado().agregarElemento(elemento);
	}

	@Override
	public Object recuperarElemento() {
		return getPosIntercalado().recuperarElemento();
	}	
}
