package org.iesalandalus.programacion.reinaajedrez;
import org.iesalandalus.programacion.utilidades.Entrada;
import org.iesalandalus.programacion.reinaajedrez.modelo.*;

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

	int input = -1;
	do {
		System.out.print("Escoja la opción!(escriba 1,2,3 o 4),si el valor es erroneo se vuelve a pedir; ");
		input = Entrada.entero();
	} while (input < 1 || input > 4);

	return input;
	
}


public static Color elegirColor() {

	int input;
	do {
		System.out.print("Introduce 1 para una reina blanca o 2 para una reina negra(en caso de valor erroneo se vuelve a pedir): ");
		input = Entrada.entero();
	} while ((input < 1 )&&(input > 2));

	if (input == 1) {
		return Color.BLANCO;
	} else {
		return Color.NEGRO;
	}
}


public static void menuDirecciones() {
	System.out.println("Estas son las posibles direcciones a escoger");
	System.out.println("1 ESTE");
	System.out.println("2 OESTE");
	System.out.println("3 NORTE");
	System.out.println("4 SUR");
	System.out.println("5 SURESTE");
	System.out.println("6 SUROESTE");
	System.out.println("7 NORESTE");
	System.out.println("8 NOROESTE");		
	
}

}
