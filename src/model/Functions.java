package model;

public class Functions {

	public double somar(double x, double y){

		return x + y;
	}

	public double subtrair(double x, double y){

		return x - y;
	}

	public double dividir(double x, double y){

		return x / y;
	}

	public double multiplicar(double x, double y){

		return x * y;
	}
	
	public double fatorial (double x){
		if (x <= 1) return 1;
		else return x * fatorial(x-1);
	}

}
