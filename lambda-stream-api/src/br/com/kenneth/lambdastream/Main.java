package br.com.kenneth.lambdastream;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Car> carros = List.of(new Car("BMW", 120000), new Car("Renault", 85000), new Car("VW", 70000));
		
		carros.stream()
			.sorted((c1, c2) -> Double.valueOf(c1.getPreco()).compareTo(c2.getPreco()))// Ordenar os carro por ondem crescente de valores
			.map(c -> new Car (c.getMarca().toLowerCase(), c.getPreco()))// Ordenando preço e colocando os nomes em letra minuscula.
		 	.peek(Car::addTax)// Peek não retorna void, ele permite que vc continue trabalhando a String.		 	
			.forEach(System.out::println);
	}

}
