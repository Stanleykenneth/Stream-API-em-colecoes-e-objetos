package br.com.kenneth.lambdastream;

public class Car {

	private String marca;
	private double preco;
	
	public Car(String marca, double preco) {
		this.marca = marca;
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void addTax() {
		preco = preco += preco *0.1;
	}
	
	@Override
	public String toString() {
		return "Carro [ marca = " + marca + ", preco = " + preco + "]";
	}
	
}
