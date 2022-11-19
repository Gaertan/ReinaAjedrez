package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Direccion {


	/* para que pase los tests como se dijo en clase, se hará directamente como la enum color */
		NORTE("Norte"), NORESTE("Noreste"), ESTE("Este"), SURESTE("Sureste"), SUR("Sur"), SUROESTE("Suroeste"), OESTE("Oeste"), NOROESTE("Noroeste");

		private String cadenaAMostrar;

		private Direccion(String cadenaAMostrar) {
			this.cadenaAMostrar = cadenaAMostrar;
		}

		/*aquí hacemos override al toString por defecto,devolviendo el valor de la cadena (nombre de la direccion) */
		@Override
		public String toString() {
			return cadenaAMostrar;
		}
}


