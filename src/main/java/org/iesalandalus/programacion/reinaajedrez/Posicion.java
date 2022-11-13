package org.iesalandalus.programacion.reinaajedrez;

import java.util.Objects;

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
	
/*metodo copia*/	
	public Posicion(Posicion posicion) {
		this.fila=posicion.getFila();
		this.columna=posicion.getColumna();
	}
	
	/*usando generate hashcode y equals en eclipse(Source->generate hashcode y equals) genero los metodos requeridos*/
	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}
	
	/*metodo toString, tambien generado mediante la opcion automatizada para mas comodidada*/
	@Override
	public String toString() {
		return "Posicion [fila=" + fila + ", columna=" + columna + "]";
	}
	
	
	
	
	
	
	
}


