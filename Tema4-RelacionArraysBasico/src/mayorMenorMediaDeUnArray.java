
public class mayorMenorMediaDeUnArray {

	public static void main(String[] args) {
		int posicionesArrays, maximo, minimo, repeticionesMayor, repeticionesMenor;
		double media;
		int[] numeros;
		posicionesArrays = NumerosNegativosEnArrays.numerosEnUnArray("Introduzca las posiciones que tendrá el array");
		numeros = new int[posicionesArrays];
		NumerosNegativosEnArrays.pedirNumerosArrays(numeros, posicionesArrays);
		maximo = numeroMayorArray(numeros);
		minimo = numeroMenorArray(numeros);
		media = mediaArray(numeros);
		repeticionesMayor = repeticionesMaximo(numeros, maximo);
		repeticionesMenor = repeticionesMinimo(numeros, minimo);
		System.out.print("El mayor numero introducido es " + maximo);
		if(repeticionesMayor>1) {
			System.out.println(" (se repite " + repeticionesMayor + " veces)");
		}
		System.out.println();
		System.out.print("El menor numero introducido es " + minimo);
		if(repeticionesMenor>1) {
			System.out.println(" (se repite " + repeticionesMenor + " veces)");
		}
		System.out.println();
		System.out.println("La media de los números introducidos es: " + media);
	}
	public static int numeroMayorArray(int[] vector) {
		int maximo = Integer.MIN_VALUE;
		for(int i = 0;i<vector.length;i++) {
			if(vector[i]>maximo) {
				maximo = vector[i];
			}
		}
		return maximo;
	}
	public static int numeroMenorArray(int[] vector) {
		int minimo = Integer.MAX_VALUE;
		for(int i = 0;i<vector.length;i++) {
			if(vector[i] < minimo) {
				minimo = vector[i];
			}
		}
		return minimo;
	}
	public static double mediaArray(int[] vector) {
		int suma = 0;
		double media = 0;
		for(int i = 0; i < vector.length;i++) {
			suma +=vector[i];
		}
		if(suma!=0) {
			media = suma/vector.length;
		}
		return media;
	}
	public static int repeticionesMaximo(int[]vectores, int maximo) {
		int seRepite = 0;
		for(int i = 0;i<vectores.length;i++) {
			if(maximo==vectores[i]) {
				seRepite++;
			}
		}
		return seRepite;
	}
	public static int repeticionesMinimo(int[]vectores, int minimo) {
		int seRepite = 0;
		for(int i = 0;i<vectores.length;i++) {
			if(minimo==vectores[i]) {
				seRepite++;
			}
		}
		return seRepite;
	}
}
