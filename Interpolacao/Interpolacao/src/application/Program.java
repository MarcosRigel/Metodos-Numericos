package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Quantidade de pontos: ");
	    int n = sc.nextInt();
	 
	    double[] x = new double[n];
	    double[] y = new double[n];
	    double[] coeficientes = new double[n];
	 
	    for(int i=0; i<n; i++) {
	        System.out.printf("Digite X %d: ", i);
	        x[i] = sc.nextDouble();
	        System.out.printf("Digite Y %d: ", i);
	        y[i] = sc.nextDouble();
	    }
	 
	    System.out.print("Valor que deseja interporlar: ");
	    double interporlar = sc.nextDouble();
	 
	    for(int i=0; i < n; i++){
	        double l=1.0;
	        for (int j=0; j < n; j++){
	            if (i!=j){
	                l *= (interporlar-x[j])/(x[i] - x[j]);
	            }
	        }
	        coeficientes[i] = l;
	    }
	 
	    double pn = 0.0;
	    for(int i=0; i < n; i++){
	        pn += y[i]*coeficientes[i];
	    }
	 
	    System.out.printf("P(%d)= %.2f", interporlar, pn);


	}

}
