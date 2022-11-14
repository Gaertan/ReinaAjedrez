package org.iesalandalus.programacion.reinaajedrez;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	
private Consola(){	
}

public static void mostrarMenu(){
	System.out.println("1. Crear la reina default.");
	System.out.println("2. Crear reina escogiendo el color.");
	System.out.println("3. Mover.");
	System.out.println("4. Salir.");
}

public static int elegirMenu() {
	int opcion = -1;
	do {
		System.out.print("Escoja la opción!(escriba 1,2,3 o 4),si el valor es erroneo se vuelve a pedir; ");
		opcion = Entrada.entero();
	} while (opcion < 1 || opcion > 4);

	return opcion;
	
}


}
