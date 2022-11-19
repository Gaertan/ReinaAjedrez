package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;


public class MainApp {

	static Reina reina;
	static boolean petar = true;

	private static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {

		switch(opcion){

		case 1:{
			crearReinaDefecto();
			break;
			}

		case 2:{
			crearReinaColor();
			break;
			}

		case 3:{
			mover();
			break;
			}

		case 4:{
			petar = false;
			break;
		}


		}


	}

	private static void crearReinaDefecto() {

		reina = new Reina();
	}

	private static void crearReinaColor() {

		reina = new Reina(Consola.elegirColor());

	}

	private static void mover() throws OperationNotSupportedException {

		Consola.menuDirecciones();

		reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
	}

	public static void mostrarReina() {
		if (reina == null) {System.out.println("la reina no existe");}
		else{System.out.println(reina.toString());}

	}

	public static void main(String[] args) {



		do {
			Consola.mostrarMenu();
			try {
				ejecutarOpcion(Consola.elegirMenu());
			} catch (OperationNotSupportedException e) {
				System.out.println("se ha producido un error");
				e.printStackTrace();
			}

		} while (!petar);
	}




}
