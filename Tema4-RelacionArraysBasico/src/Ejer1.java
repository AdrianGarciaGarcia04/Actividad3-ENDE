import java.util.Scanner;

public class Ejer1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		String primeraPalabra, segundaPalabra;
		primeraPalabra = pedirCadena("Introduce la primera palabra para ver si las palabras son amigos o no");
		segundaPalabra = pedirCadena("Introduce la segunda palabra");
		if(sonAmigas(primeraPalabra, segundaPalabra)) {
			System.out.println("Son amigas");
		}else {
			System.out.println("No son amigas");
		}
	}
	/**
	 * Devuelve si dos palabras son amigos, eso quiere decir si los pares de una palabras y los impares de otros o viceversa
	 * forman la misma palabra
	 * @param primeraPalabra Es la primera palabra pasada como parametro
	 * @param segundaPalabra Es la segunda palabra pasada como parametro
	 * @return Devuelve true en caso de que sean amigos, false en caso contrario
	 */
	public static boolean sonAmigas(String primeraPalabra, String segundaPalabra) {
		boolean esAmiga = false;
		if((cadenaConPosicionesPares(primeraPalabra).equalsIgnoreCase(cadenaConPosicionesImpares(segundaPalabra))) || (cadenaConPosicionesPares(segundaPalabra).equalsIgnoreCase(cadenaConPosicionesImpares(primeraPalabra)))) {
			esAmiga = true;
		}
		return esAmiga;
	}
	/**
	 * Saca la cadena que tiene los caracteres pares de una palabra
	 * @param palabra Es una palabra sacada como parametro
	 * @return Devuelve la cadena que tiene los caracteres pares de una palabra
	 */
	public static String cadenaConPosicionesPares(String palabra) {
		StringBuilder textoQueForma = new StringBuilder();
		for(int i = 0;i<palabra.length();i++) {
			if((i+1)%2==0) {
				textoQueForma.append(palabra.charAt(i));
			}
		}
		return textoQueForma.toString();
	}
	/**
	 * Saca la cadena que tiene los caracteres impares de una palabra
	 * @param palabra Es una palabra pasada como parametro
	 * @return Devuelve la cadena de caracteres impares de una palabra
	 */
	public static String cadenaConPosicionesImpares(String palabra) {
		StringBuilder textoPosicionesImpares = new StringBuilder();
		for(int i = 0;i<palabra.length();i++) {
			if((i+1)%2!=0) {
				textoPosicionesImpares.append(palabra.charAt(i));
			}
		}
		return textoPosicionesImpares.toString();
	}
	/**
	 * Pide una cadena al usuario
	 * @param msg Es el mensaje que le sale por pantalla al usuario para que intrduzca una cadena
	 * @return Devuelve la cadena que ha introducido el usuario
	 */
	public static String pedirCadena(String msg) {
		String cadena;
		System.out.println(msg);
		cadena = teclado.nextLine();
		return cadena;
	}
}
