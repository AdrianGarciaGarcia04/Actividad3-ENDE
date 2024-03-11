import java.util.Random;

public class Primitiva {

	public static final int NUMERO_COMBINACIONES = 6;
	public static void main(String[] args) {
		int[] primitiva;
		primitiva = new int[NUMERO_COMBINACIONES];
		numeroPrimitivo(primitiva);
		System.out.print("La primitiva es ");
		for(int i = 0; i<primitiva.length;i++) {
			System.out.print(primitiva[i] + " ");
		}
	}
	/**
	 * Mete en el array vector las combinaciones diferentes generado de manera aleatoria del 1 al 49
	 * @param vector Es el aeeay a modificar e introducir las combinaciones aleatorias
	 */
	public static void numeroPrimitivo(int[] vector) {
		Random serieAleatoria = new Random();
		int combinacionAleatoria;
		for(int i = 0;i<vector.length;i++) {
			combinacionAleatoria = serieAleatoria.nextInt(49) + 1;
			while(comprobarCombinacion(vector, combinacionAleatoria, i)) {
				combinacionAleatoria = serieAleatoria.nextInt(49) + 1;
			}
			vector[i]  = combinacionAleatoria;
		}
	}
	/**
	 * Comprueba si en el array de la primitiva se encuentra la combinacion aleatoria
	 * @param vector Es el array donde se encuentra la primitiva
	 * @param combinacionAleatoria Es la combinacion a comprobar si se encuentra en el array
	 * @return Devuelve true si no se repite, false en caso contrario
	 */
	public static boolean comprobarCombinacion(int[] vector, int combinacionAleatoria, int limiteBusqueda) {
		boolean SeEncuentra  = false;
		for(int i = 0;i<limiteBusqueda && !SeEncuentra;i++) {
			if(vector[i] == combinacionAleatoria) {
				SeEncuentra=true;
			}
		}
		return SeEncuentra;
	}
}
