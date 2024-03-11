import java.util.Scanner;

public class NumerosNegativosEnArrays {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		int numeroElementosArray, numerosNegativos;
		int[] vectorNumeros;
		numeroElementosArray = numerosEnUnArray("Introduce la cantidad de numeros que quieres introducir");
		vectorNumeros = new int[numeroElementosArray];
		pedirNumerosArrays(vectorNumeros, numeroElementosArray);
		numerosNegativos = cantidadNumerosNegativos(vectorNumeros);
		System.out.println("En el vector hay " + numerosNegativos + " números negativos");
	}
	public static int numerosEnUnArray(String msg) {
		int numero;
		System.out.println(msg);
		numero = Integer.parseInt(teclado.nextLine());
		return numero;
	}
	public static void pedirNumerosArrays(int[] vector, int numeros) {
		int numero;
		for(int i = 0;i<vector.length;i++) {
			System.out.println("Introduce un número " + (i+1) + "/" + numeros);
			numero = Integer.parseInt(teclado.nextLine());
			vector[i] = numero;
		}
	}
	public static int cantidadNumerosNegativos(int[] vector) {
		int numerosNegativos = 0;
		for(int i = 0;i<vector.length;i++) {
			if(vector[i]<0) {
				numerosNegativos++;
			}
		}
		return numerosNegativos;
	}
}