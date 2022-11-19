package org.iesalandalus.programacion.reinaajedrez.modelo;
import javax.naming.OperationNotSupportedException;

public class Reina {
	/*atribs, yas queen*/

	private Color color;
	private Posicion posicion;

/*getters y setters. */
	public Color getColor() {
		return this.color;
	}

	public Posicion getPosicion() {
		return this.posicion;
	}

	private void setPosicion(Posicion posicion) throws IllegalArgumentException{
	    if (posicion == null) { throw new IllegalArgumentException("Error en la entrada de datos");}
	    else {this.posicion = posicion;}
	}

	private void setColor(Color color) throws IllegalArgumentException{

		boolean tempBool = false;

	      for(Color c:Color.values())
	           if (color.name().equals(color)) {
	        	   	tempBool = true;
	      			this.color = color;
	      			}

	    if (!tempBool || (color == null)) throw new IllegalArgumentException("Error en la entrada de datos");


        }

	/*constructor por defecto */
		public Reina() {

			color = Color.BLANCO;
			posicion = new Posicion(1, 'd');
		}

		public Reina(Color color) {
			setColor(color);
			if (color == Color.BLANCO) {
				posicion = new Posicion(1, 'd');
			} else if (color == Color.NEGRO) {
				posicion = new Posicion(8, 'd');
			}

		}


	public void mover(Direccion direccion, int casillas) throws IllegalArgumentException, OperationNotSupportedException{
		if((casillas>7)||(casillas<1)) {
			 throw new IllegalArgumentException("Error en la entrada de datos, el numero de casillas ha de estar comprendido en el tablero");
		}

		else {
		int filaNumero = posicion.getFila();
		int columnNumero = (posicion.getColumna() - 96);
			switch(direccion){
			/*ya que al mover en la vertical en una columna,estaríamos realmente cambiando de fila
			 *  las casillas cambian "al contrario" que lo que puede parecer intuitivo
			 *  (al mover este/oeste se cambian columnas y norte/sur filas)*/

				case NORTE:{
					if((filaNumero-casillas)<1) {throw new OperationNotSupportedException("la reina no debe salirse del tablero");}
					else{this.posicion = (new Posicion(filaNumero-casillas, (char)(columnNumero + 96)));}
					break;

				}

				case SUR:{
					if((filaNumero+casillas)>8) {throw new OperationNotSupportedException("la reina no debe salirse del tablero");}
					else{this.posicion = (new Posicion(filaNumero+casillas, (char)(columnNumero + 96)));}
					break;
				}

				case ESTE:{
					if((columnNumero+casillas)>8) {throw new OperationNotSupportedException("la reina no debe salirse del tablero");}
					else{this.posicion = (new Posicion(filaNumero, (char)(columnNumero + 96 + casillas)));}
					break;
				}

				case NORESTE:{
					if(((columnNumero+casillas)>8)||filaNumero-casillas<1) {throw new OperationNotSupportedException("la reina no debe salirse del tablero");}
					else{this.posicion = (new Posicion(filaNumero-casillas, (char)(columnNumero + 96 + casillas)));}
					break;
				}

				case SURESTE:{
					if(((columnNumero+casillas)>8)||filaNumero+casillas>8) {throw new OperationNotSupportedException("la reina no debe salirse del tablero");}
					else{this.posicion = (new Posicion(filaNumero+casillas, (char)(columnNumero + 96 + casillas)));}
					break;
				}

				case OESTE:{
					if((columnNumero-casillas)<1) {throw new OperationNotSupportedException("la reina no debe salirse del tablero");}
					else{this.posicion = (new Posicion(filaNumero, (char)(columnNumero + 96 - casillas)));}
					break;
				}

				case SUROESTE:{
					if(((columnNumero-casillas)<1)||filaNumero+casillas>8) {throw new OperationNotSupportedException("la reina no debe salirse del tablero");}
					else{this.posicion = (new Posicion(filaNumero+casillas, (char)(columnNumero + 96 - casillas)));}
					break;
				}

				case NOROESTE:{
					if(((columnNumero-casillas)<1)||filaNumero-casillas>1) {throw new OperationNotSupportedException("la reina no debe salirse del tablero");}
					else{this.posicion = (new Posicion(filaNumero-casillas, (char)(columnNumero + 96 - casillas)));}
					break;
				}

			}





		}

	}


	@Override
	public String toString() {
		return "Reina [color=" + color + ", posicion=" + posicion + "]";
	}




	}

