package ejercicioUno;

public class Main {	
	public static void main(String[] args) {
		Cola ter1= new Terminal();
		Cola ter2= new Terminal();
		Cola ter3= new Terminal();
		Cola ter4= new Terminal();
		Cola ter5= new Terminal();
		Cola ter6= new Terminal();
		Multiple azar1= new Azar();
		Multiple azar2= new Azar();
		Multiple azar3= new Azar();
		Multiple intercalada= new Intercalado();
		azar1.setMultiple(intercalada);
		azar1.setMultiple(azar2);
		azar2.setMultiple(ter5);
		azar2.setMultiple(ter6);
		intercalada.setMultiple(ter3);
		intercalada.setMultiple(ter4);
		intercalada.setMultiple(azar3);
		azar3.setMultiple(ter1);
		azar3.setMultiple(ter2);
		ter1.agregarElemento(new Integer(1));
		ter1.agregarElemento(new Integer(1));
		ter1.agregarElemento(new Integer(1));
		ter1.agregarElemento(new Integer(1));
		ter2.agregarElemento(new Integer(1));
		ter3.agregarElemento(new Integer(1));
		ter4.agregarElemento(new Integer(6));
		ter5.agregarElemento(new Integer(1));
		ter6.agregarElemento(new Integer(1));
		ter1.agregarElemento(new Integer(1));
		ter1.agregarElemento(new Integer(1));
		
		
					
		System.out.println("Cantidad de elementos estructura: "+ azar1.cantidadElementosEstrctura());
		System.out.println("Cola terminal mayor: "+ azar1.colaTerminalMayor().cantidadElementosEstrctura());
		System.out.println("Cantidad de colas terminales: "+ azar1.cantidadColasTerminales());
	}

}
