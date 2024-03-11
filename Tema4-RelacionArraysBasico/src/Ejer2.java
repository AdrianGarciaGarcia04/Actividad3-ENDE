
public class Ejer2 {

	public static void main(String[] args) {
		String palabra;
		palabra = Ejer1.pedirCadena("Introduzca una palabra o frase para ver si se repite caracteres");
		if(tieneCaracteresRepetidos(palabra)) {
			System.out.println("En la palabra o frase '" + palabra + "' se repiten caracteres");
		}else {
			System.out.println("En la palabra o frase '" + palabra + "' no se repiten caracteres");
		}
	}
	/**
	 * Comprueba si una cadena tiene caracteres repetidos
	 * @param cadena Es la cadena pasada como parametro
	 * @return Deveulve true en caso de que haya algun caracter repetido, false en caso contrario
	 */
	public static boolean tieneCaracteresRepetidos(String cadena) {
		boolean esRepetido = false;
		char caracter;
		StringBuilder cadenaMoldeada = new StringBuilder(cadena.toLowerCase());
		for(int i = 0;i<cadenaMoldeada.length();i++) {
			caracter = cadenaMoldeada.charAt(i);
			cadenaMoldeada.deleteCharAt(i); //Elimino el caracter para que al buscarlo con el index, no cuente el caracter que se ha cogido, es decir, por ejemplo con la cadena "ABCDEFGE" cuando llegue la primera E se elimina para que no la cuente y tenga en cuenta la segunda E
			if(cadenaMoldeada.indexOf(String.valueOf(caracter)) !=-1) {
				esRepetido = true;
			}
		}
		return esRepetido;
	}
}
