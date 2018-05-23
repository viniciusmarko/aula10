package br.com.db1.start.exercicio03;

public class Calculadora {
	private Double resultado = 0d;
	private Double primeiroValor = 0d;
	private Double segundoValor = 0d;

	public Calculadora(Double primeiroValor222, Double segundovalor2333) {
		zerar();
		primeiroValor = primeiroValor222;
		segundoValor = segundovalor2333;

	}

	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

	public Double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}
	public Double somar() {
		return primeiroValor + segundoValor;
	}

	public Double subtrair() {
		return segundoValor - primeiroValor;
	}

	public void zerar() {
		primeiroValor = 0d;
		segundoValor = 0d;
		
	}

	public Double multiplicar() {
		return primeiroValor * segundoValor;
	}

	public Double dividir() {
		return primeiroValor / segundoValor;
	}

}

