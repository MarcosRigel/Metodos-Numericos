
import java.util.Scanner;

public class FalsaCorda {

	public static void main(String[] args) {

		falsaPosicao(-2, 5);

	}

	public static void falsaPosicao(double a, double b) {
		double ERRO = 0.000001;
		double x = 0;
		boolean achou = false;
		
		for (int i = 0; i < 10; i++) {
			double fa = funcao(a);
			double fb = funcao(b);
			double xi = b - fb * (b - a) / (fb - fa);
			double fxi = funcao(xi);
			
			System.out.printf("xi = %f\n", xi);
			System.out.printf("f(xi) = %f\n", fxi);
			System.out.printf("[A, B] = [%f, %f]\n", a, b);
			System.out.printf("F(A) = %f\n", fa);
			System.out.printf("F(B) = %f\n", fb);
			
			if (fxi == 0 || Math.abs(fxi) < ERRO) {
				x = xi;
				achou = true;
				break;
			}
			if (fxi * fb < 0) {
				a = xi;
			}
			else if (fa * fxi < 0) {
				b = xi;
			}

			System.out.println();
		}
		if (achou) {
			System.out.printf("Raiz = %f\n", x);
		} 
		else {
			System.out.println("Não foi possivel achar a raiz");
		}
	}

	public static double funcao(double x) {
		return (x * Math.pow(Math.E, (0.5 * x))) + (1.2 * x) - 5;
	}

}
