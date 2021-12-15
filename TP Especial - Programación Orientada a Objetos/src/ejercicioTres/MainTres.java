package ejercicioTres;

public class MainTres {

	public static void main(String[] args) {
		// Fijo ejemplo de enunciado 3
		Cola terminal1 = new Terminal();
		Cola terminal2 = new Terminal();
		Cola terminal3 = new Terminal();
		Cola terminal4 = new Terminal();
		Cola terminal5 = new Terminal();
		Cola terminal6 = new Terminal();
		Multiple colaMultiple1 = new Multiple();
		Multiple colaMultiple2 = new Multiple();
		Multiple colaMultiple3 = new Multiple();
		Multiple colaMultiple4 = new Multiple();
		
		colaMultiple1.setSeleccion(new Intercalado(), new Azar()); //Agrega intercalado, recupera al azar
		colaMultiple2.setSeleccion(new Intercalado(),new Mayor()); //Agrega Intercalado, recupera mayor
		colaMultiple3.setSeleccion(new Menor(), new Azar()); //Agrega menor, recupera al azar
		colaMultiple4.setSeleccion(new Menor(), new Azar()); //Agrega menor, recupera al azar
		
		colaMultiple1.setMultiple(colaMultiple2);
		colaMultiple1.setMultiple(colaMultiple3);
		colaMultiple2.setMultiple(colaMultiple4);
		colaMultiple2.setMultiple(terminal3);
		colaMultiple2.setMultiple(terminal4);
		colaMultiple3.setMultiple(terminal5);
		colaMultiple3.setMultiple(terminal6);
		colaMultiple4.setMultiple(terminal1);
		colaMultiple4.setMultiple(terminal2);
		
		terminal1.agregarElemento(new Integer(1));
		
		terminal2.agregarElemento(new Integer(1));
		terminal2.agregarElemento(new Integer(2));
		
		terminal3.agregarElemento(new Integer(1));
		terminal3.agregarElemento(new Integer(2));
		terminal3.agregarElemento(new Integer(3));
		
		terminal4.agregarElemento(new Integer(1));
		terminal4.agregarElemento(new Integer(2));
		terminal4.agregarElemento(new Integer(3));
		terminal4.agregarElemento(new Integer(4));
		
		terminal5.agregarElemento(new Integer(1));
		terminal5.agregarElemento(new Integer(2));
		terminal5.agregarElemento(new Integer(3));
		terminal5.agregarElemento(new Integer(4));
		terminal5.agregarElemento(new Integer(5));
		
		terminal6.agregarElemento(new Integer(1));
		terminal6.agregarElemento(new Integer(2));
		terminal6.agregarElemento(new Integer(3));
		terminal6.agregarElemento(new Integer(4));
		terminal6.agregarElemento(new Integer(5));
		terminal6.agregarElemento(new Integer(6));
			
		System.out.println("Cantidad de elementos estructura: "+ colaMultiple1.cantidadElementosEstrctura());
		System.out.println("Cola terminal mayor: "+ colaMultiple1.colaTerminalMayor().cantidadElementosEstrctura());
		System.out.println("Cantidad de colas terminales: "+ colaMultiple1.cantidadColasTerminales());
	}

}
