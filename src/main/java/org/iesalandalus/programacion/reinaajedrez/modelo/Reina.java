package org.iesalandalus.programacion.reinaajedrez.modelo;

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

	    if (tempBool == false) throw new IllegalArgumentException("Error en la entrada de datos");
	    if (color == null) throw new IllegalArgumentException("Error en la entrada de datos");
	    
	    
        }
	
	/*constructor por defecto */
	public Reina() {

		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}
	
	
	
	}

