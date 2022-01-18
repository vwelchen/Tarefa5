package Composite;

import java.util.ArrayList;

public class PrincipalComposite {

	public static void main(String[] args) {
		
		System.out.println("O Composite � um padr�o de projeto estrutural que tem como objetivo principal tratar\n"
				+ "diferentes objetos da mesma maneira, fazendo sentido apenas se a aplica��o puder ser\n"
				+ "organizada em estrutura de �rvore. Como exemplo um sistema de pedidos em que\n"
				+ "precisamos calcular o pre�o total dos produtos. Esse sistema faz uso das classes Caixa e Produto.\n"
				+ "Uma Caixa pode conter nela um ou mais Produtos. Al�m disso, dentro de uma Caixa podem existir outras Caixas,\n"
				+ "contendo mais alguns Produtos e assim por diante. Chegar no pre�o total desses produtos pode ser algo complexo,\n"
				+ "pois temos que ter conhecimento de todas as classes envolvidas, saber o n�vel de composi��o das caixas, entre outros detalhes.\r\n"
				+ "Com o padr�o Composite podemos trabalhar com Produtos e Caixas atrav�s de uma classe abstrata ou interface comum que utilize\n"
				+ "um m�todo para contagem do pre�o total. Para um �nico produto, que representa um objeto individual, apenas retorna o pre�o dele.\n"
				+ "J� para uma caixa, que representa uma composi��o de objetos individuais, seria verificado cada item contido nela e\n"
				+ "retornaria o seu pre�o at� ter o valor total desse agrupamento. E se uma caixa possuir outra subcaixa, faz o mesmo procedimento\n"
				+ "de verificar item a item do agrupamento e retorna o seu pre�o, at� que seja somado todos os componentes internos de forma recursiva no c�digo.\r\n"
				+ "A grande vantagem desse padr�o � que todos os elementos ser�o acessados da mesma forma atrav�s de uma interface ou classe abstrata,\n"
				+ "independente se o objeto � individual ou composto. N�o � necess�rio se preocupar com as classes concretas dos objetos que comp�em a �rvore.\n"
				+ "Toda a estrutura complexa ser� tratada de maneira uniforme\n");

		Caixa caixaMaster = new Caixa(new ArrayList<Item>());

		caixaMaster.addItem(new Produto("Clean Code: A Handbook of Agile Software Craftsmanship", 202.71));

		Caixa caixaSmartphones = new Caixa(new ArrayList<Item>());
		caixaSmartphones.addItem(new Produto("Samsung Galaxy S21 Ultra 5G", 6191.10));
		caixaSmartphones.addItem(new Produto("Samsung Galaxy S20 FE", 2189));
		caixaSmartphones.addItem(new Produto("iPhone 13", 7599));
		caixaSmartphones.addItem(new Produto("iPhone 13 mini", 6599));
		caixaMaster.addItem(caixaSmartphones);

		Caixa caixaNotebooks = new Caixa(new ArrayList<Item>());
		caixaNotebooks.addItem(new Produto("Acer Nitro AN515-44-R5YZ", 5499));
		caixaNotebooks.addItem(new Produto("Dell G15", 5301));
		caixaMaster.addItem(caixaNotebooks);

		Caixa caixaFerramentas = new Caixa(new ArrayList<Item>());
		caixaFerramentas.addItem(new Produto("Martelo de Unha 25mm", 37.30));
		caixaFerramentas.addItem(new Produto("Trena 5m", 17.10));
		caixaFerramentas.addItem(new Produto("Alicate 7", 25));
		caixaFerramentas.addItem(new Produto("Chave de Fenda Ponta Cruzada 1/8x6 Polegadas", 5.90));
		caixaMaster.addItem(caixaFerramentas);

		System.out.println("VALOR TOTAL = " + caixaMaster.calcularPrecoFinal());
	}
}