package org.iesalandalus.programacion.reinaajedrez;
import org.iesalandalus.programacion.utilidades.Entrada;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.*;


public class MainApp {
	
	static Reina reina;	
		
	private static void ejecutarOpcion(int opcion) {
		
		switch(opcion){
		
		case 1:{
			
			break;
			}
			
		case 2:{	
			
			break;
			}
			
		case 3:{			
			break;
			}
			
		case 4:{
			
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
		
	public static void main(String[] args) {


	
	
	
	
	
	
	
	
	
	}
}
