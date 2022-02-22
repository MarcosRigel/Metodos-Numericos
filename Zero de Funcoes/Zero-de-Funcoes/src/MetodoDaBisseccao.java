
public class MetodoDaBisseccao {

	public static void main(String[] args) {
		double a = 1;
		double b = 6;
		double e = 0.01;
		if (f(a) * f(b) < 0) {
			while (Math.abs(b - a) / 2 > e) {
				double xi = (a + b) / 2;
				if (xi == 0) {
					System.out.println("A raiz é: " + xi);
				} 
				else if (f(a) * f(xi) < 0) {
					b = xi;
				} 
				else {
					a = xi;
				}
				System.out.println("Valor da raiz é: " + xi);
			}
		} 
		else {
			System.out.println("Não possui raiz neste intervalo!");
		}
	}

	public static double f(double x) {
		return (Math.pow(x, 2) - 5);
	}
}
