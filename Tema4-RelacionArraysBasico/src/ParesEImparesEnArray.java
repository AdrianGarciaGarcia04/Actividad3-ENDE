import java.util.Random;

public class ParesEImparesEnArray {
	public static final int NUMEROS_A_GENERAR = 20;
	public static void main(String[] args) {
		int[] numeros = new int[NUMEROS_A_GENERAR];
		generarNumeros(numeros);
		System.out.println("El conjunto de numeros ordenados por pares y luego impares es: ");
		pintarNumerosOrdenados(numeros);
	}
	/**
	 * Genera los numeros para introducirlos en el Array. Además, en este método, se llama a otros métodos para organizar en un vector auxiliar los números pares e impares, 
	 * y luego los vuelca en el array original
	 * @param vector Es el vector donde se encuentran los números
	 */
	public static void generarNumeros(int[] vector) {
		int[] vectorAuxiliar = new int[NUMEROS_A_GENERAR];
		Random serieAleatoria = new Random();
		for(int i = 0;i<vector.length;i++) {
			vector[i] = serieAleatoria.nextInt(101);
		}
		organizarNumerosParesImpares(vector, vectorAuxiliar);
		ordenarArray(vector, vectorAuxiliar);
	}
	/**
	 * Se organiza los números en un array auxiliar, de manera que los pares vayan primero y luego los impares
	 * @param vector Es el vector que contiene los números
	 * @param vectorAuxiliar Es el vector auxiliar donde se ordenan los números
	 */
	public static void organizarNumerosParesImpares(int[] vector, int[] vectorAuxiliar) {
		int indice = 0;
		for(int i = 0;i<vector.length;i++) {
			if(vector[i]%2==0) {
				vectorAuxiliar[indice] = vector[i];
				indice++;
			}
		}
		for(int i = 0;i<vector.length;i++) {
			if(vector[i]%2!=0) {
				vectorAuxiliar[indice] = vector[i];
				indice++;
			}
		}
	}
	/**
	 * Pinta los números que contiene el vector
	 * @param vector Es el vector pasado como parámetro que contiene los números
	 */
	public static void pintarNumerosOrdenados(int[] vector) {
		for(int i = 0; i<vector.length;i++) {
			System.out.print(vector[i] + " ");
		}
	}
	/**
	 * Introduce los números del array ordenado en el array original
	 * @param vector Es el vector original donde se van a volcar los números ordenados
	 * @param vectorAuxiliar Es el vector auxiliar donde están todos los números ordenados
	 */
	public static void ordenarArray(int[] vector, int[] vectorAuxiliar) {
		for(int i = 0;i<vector.length;i++) {
			vector[i] = vectorAuxiliar[i];
		}
	}
}
