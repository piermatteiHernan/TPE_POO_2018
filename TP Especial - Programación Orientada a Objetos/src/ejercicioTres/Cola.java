package ejercicioTres;

public abstract class Cola {
	public abstract void agregarElemento(Object elemento);
	public abstract Object recuperarElemento();
	public abstract int cantidadElementosEstrctura();
	public abstract Cola colaTerminalMayor();
	public abstract int cantidadColasTerminales();	
}