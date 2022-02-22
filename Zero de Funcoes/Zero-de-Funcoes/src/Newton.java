
public class Newton {

	public static void main(String[] args) {
		
		double raiz = raizQuadrada(33.0);
		System.out.println(raiz);

	}
	
	private static double raizQuadrada(double numero) {
		double raiz, raizAnterior;
		raiz = numero/2;
		do {
		raizAnterior = raiz;
		raiz = (raiz * raiz + numero) / (2 * raiz);
		} while(Math.abs(raiz - raizAnterior) < 0.000001);
		return raiz;

	}
}