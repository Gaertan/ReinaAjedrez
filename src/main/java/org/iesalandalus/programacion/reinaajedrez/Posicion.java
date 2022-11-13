package org.iesalandalus.programacion.reinaajedrez;

public class Posicion {
private int fila;

private char columna;

	/*getters */
public int getFila() {
	return this.fila;
}
public char getColumna() {
	return this.columna;
}
	/*setters*/
	private void setFila(int fila) {
		if (fila<1 || fila>8) {
			throw new IllegalArgumentException("ERROR; valor de fila no valido");
			}
		else this.fila = fila;
	}


	private void setColumna(char columna) {

		int columnNumero = columna;
			if(columnNumero<1 || columnNumero>8) {
				throw new IllegalArgumentException("ERROR; valor de columna no valido");
			}
		else this.columna=columna;
		
		}
/*constructor de posicion.*/
	public Posicion(int fila, char columna) {
		int columnNumero = columna;
		if((columnNumero<1 || columnNumero>8)||(fila<1 || fila>8)) {
			throw new IllegalArgumentException("ERROR; valor de columna o fila no valido");
		}
		else
		setFila(fila);
		setColumna(columna);
	}
}


