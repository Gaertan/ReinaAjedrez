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


public static Direccion elegirDireccion() {
	int input = -1;
	Direccion direccion = null;
		
		do {
			System.out.println("Escoja la dirección a usar(se pedirá el valor hasta que sea válido)");
			input=Entrada.entero();
			
		}
		while(input<1||input>8);
		
	
		switch(input) {
		
		case 1:
			direccion = Direccion.ESTE;
			
		break;
		case 2:
			direccion = Direccion.OESTE;
			
		break;
		case 3:
			direccion = Direccion.NORTE;
			
		break;
		case 4:
			direccion = Direccion.SUR;
			
		break;
		case 5:
			direccion = Direccion.SURESTE;
			
		break;
		case 6:
			direccion = Direccion.SUROESTE;
			
		break;
		case 7:
			direccion = Direccion.NORESTE;
			
		break;
		case 8:
			direccion = Direccion.NOROESTE;
			
		break;
		
		}
	
	return direccion;
}



}
