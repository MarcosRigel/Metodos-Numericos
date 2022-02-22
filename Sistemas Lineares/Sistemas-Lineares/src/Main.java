import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final double nuloNum = 1e-5;
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da matriz quadrada:");
		int tamanho = sc.nextInt();
		double[][] mat = new double[tamanho][tamanho];
		
		System.out.println("Digite os valores da matriz: ");
		for (int i=0; i<tamanho; i++) {
			for (int j=0; j<tamanho; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		double[] vetor = new double[tamanho];
		System.out.println("Digite os valores do vetor: ");
		for (int i=0; i<tamanho; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double[] x = Gauss(mat, vetor);
		System.out.println();
		System.out.println("Metriz Triangular: ");
		for (int i=0; i<tamanho;i++) {
			for (int j=0; j < tamanho; j++) {
				System.out.printf("%.1f ", mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int num = 1;
		
		System.out.println("Os valores de x1, x2, x3, x4, x5");
		for (int i=0; i<tamanho; i++) {
			System.out.println("x" + num + " = ");
			System.out.printf("%.1f%n", x[i]);
			num++;
		}
		
		sc.close();
	}
	
	public static double[] Gauss(double[][] A, double[] b) {
		int n = b.length;
		
		for (int p = 0; p < n; p++) {
			int max = p;
			for (int i = p + 1; i < n;i++) {
				if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
					max = i;
				}
			}
			double[] temp = A[p]; 
			A[p] = A[max];
			A[max] = temp;
			double t = b[p];
			b[p] = b[max];
			b[max] = t;
			
			for (int i = p + 1; i < n; i++) {
				double alpha = A[i][p] / A[p][p];
				b[i] -= alpha * b[p];
				for (int j = p; j < n; j++) {
					A[i][j] -= alpha * A[p][j];
				}
			}
		}
		
		double[] x = new double[n];
		for (int i=n-1; i >= 0; i--) {
			double sum = 0.0;
			for (int j=i+1; j < n; j++) {
				sum += A[i][j] * x[j];
			}
			x[i] = (b[i] - sum) / A[i][i];
		}
		return x;
	}
	
}
