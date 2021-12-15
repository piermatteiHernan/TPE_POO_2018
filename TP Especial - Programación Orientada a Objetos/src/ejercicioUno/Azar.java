package ejercicioUno;

public class Azar extends Multiple{
	
	private Cola getPosAzar() {
		int posAzar=(int)(Math.random()*colaMultiple.size());
		return colaMultiple.get(posAzar);
	}
	@Override
	public void agregarElemento(Object elemento) {
		getPosAzar().agregarElemento(elemento);		
	}

	@Override
	public Object recuperarElemento() {
		return (getPosAzar().recuperarElemento());
	}
}
