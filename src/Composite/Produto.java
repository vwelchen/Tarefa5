// A classe Produto implementa a interface Item, representando um Produto simples.

package Composite;

public class Produto implements Item {
	private double preco;

	public Produto(String nome, double preco) {
		this.preco = preco;
	}

	// Retorna o pre�o do produto
	@Override
	public double calcularPrecoFinal() {
		return preco;
	}

}