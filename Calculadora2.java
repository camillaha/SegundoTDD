public class Calculadora2 {

	public static int somar(int[] valores) {
		int somatorio = 0;
		for (int i = 0; i < 3; i++) {
			somatorio = somatorio + valores[i];
		}
		return somatorio;
	}

	public static int multiplicar(int[] valores) {
		int mult = 1;
		for (int i = 0; i < valores.length; i++) {
			mult = mult * valores[i];
		}
		return mult;
	}

	public static int dividir(int i, int j) {
		return i / j;
	}

}