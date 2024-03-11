
public class Ejer3 {
	public static final int LONGITUD_TELEFONO = 9;
	public static final int PREFIJO_INICIO = 0;
	public static final int PREFIJO_FINAL = 3;
	public static String PREFIJOS_ANDALUCES ="954 SEVILLA-955 SEVILLA-956 CÁDIZ-958 GRANADA-959 HUELVA-950 ALMERÍA-953 JAÉN-957 CORDOBA-951 MÁLAGA-";
	public static void main(String[] args) {
		String telefono;
		String provincia;
		telefono = Ejer1.pedirCadena("Introduzca un número de telefono");
		if(comprobarTelefono(telefono)) {
			provincia = provinciaDelTelefono(telefono);
			System.out.println(provincia);
		}else {
			System.out.println("ERROR");
		}
	}
	/**
	 * Devuelve la provincia en la que se encuentra el numero, utilizndo el indexOf, y el Substring, y lo que se hace
	 * es buscar el prefijo del telefono en la constante y si se encuentra se coge la provincia
	 * @param telefono Es el telefono pasado como parametro
	 * @return Devuelve la provincia o ERROR en caso de que no se encuentre
	 */
	public static String provinciaDelTelefono(String telefono) {
		String provincia;
		String prefijo;
		int indice;
		prefijo = telefono.substring(PREFIJO_INICIO, PREFIJO_FINAL);
		indice = PREFIJOS_ANDALUCES.indexOf(prefijo);
		if(indice!=-1) {
			provincia = PREFIJOS_ANDALUCES.substring(indice + prefijo.length(), PREFIJOS_ANDALUCES.indexOf("-", indice)); //Si se encuentra la provincia, se saca la provincia desde la posicion del prefijo hasta el guion, que es donde se encuentra el nombre de la provincia
		}else {
			provincia = "ERROR";
		}
		return provincia.trim();
	}
	/**
	 * Se comprueba los caracteres del telefono, en caso de que el telefono tenga un caracter que NO seaa un caracter(un digito o caracter especial) es falso
	 * @param telefono Es el numero de telefono pasado como parametro
	 * @return Devuelve true en caso de que todos sean caracter, false en caso contrario
	 */
	public static boolean comprobarCaracteresTelefono(String telefono) {
		boolean esCorrecto = true;
		for(int i = 0;i<telefono.length();i++) {
			if(!Character.isDigit(telefono.charAt(i))) {
				esCorrecto = false;
			}
		}
		return esCorrecto;
	}
	/**
	 * Comprueba que el numero de telefono tenga 9 caracteres (una longitud de 9)
	 * @param telefono Es el numero de telefono pasado como parametro
	 * @return Devuelve true en caso de que tenga la longitud correcta (9), false en caso contrario
	 */
	public static boolean comprobarLongitudTelefono(String telefono) {
		return telefono.length() == LONGITUD_TELEFONO;
	}
	/**
	 * Se comprueba todos los métodos de comprobaciones creados anteriormente
	 * @param telefono Es el numero de telefono pasado como parametro
	 * @return Devuelve true en caso de que todas las comprobaciones sean correctas, false en caso de que alguna no cumpla
	 */
	public static boolean comprobarTelefono(String telefono) {
		return comprobarLongitudTelefono(telefono) && comprobarCaracteresTelefono(telefono);
	}
}