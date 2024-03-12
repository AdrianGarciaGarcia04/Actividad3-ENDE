import java.util.Scanner;

public class TemperaturaMedia {
	public static final int NUMERO_MESES = 12;
	public static Scanner teclado = new Scanner(System.in);
	public static final String[] meses= {"ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DEC"};
	public static final String[] mesesEnteros = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	public static void main(String[] args) {
		String caracter;
		int[] temperaturas;
		temperaturas = new int[NUMERO_MESES];
		pedirTemperaturasMedias(temperaturas);
		caracter = pedirCaracter("Introduce un caracter para pintar el diagrama:");
		pintarDiagrama(temperaturas, caracter);
	}
	/**
	 * Pide la temperatura a los usuarios
	 * @param vector Es el vector con las temperaturas
	 */
	public static void pedirTemperaturasMedias(int[] vector) {
		for(int i = 0;i<vector.length;i++) {
			System.out.println("Introduce la temperatura (ºC) media de " + mesesEnteros[i] + ":");
			vector[i] = Integer.parseInt(teclado.nextLine());
		}
	}
	/**
	 * Pinta el diagrama con las temperaturas
	 * @param vector Es el vector con las temperaturas
	 * @param caracter
	 */
	public static void pintarDiagrama(int vector[], String caracter) {
		for(int i = 0;i<vector.length;i++) {
			System.out.print(meses[i] +": ");
			for(int j = 0;j<vector[i];j++) {
				System.out.print(caracter);
			}
			System.out.println();
		}
	}
	public static String pedirCaracter(String msg) {
		String caracter;
		System.out.println(msg);
		caracter = teclado.nextLine();
		return caracter;
	}
}