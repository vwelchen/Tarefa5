package Visitor;

public class PrincipalVisitor {

	public static void main(String[] args) {
		
		System.out.println("O Visitor tem a intenção de representar uma operação a ser realizada sobre\r\n"
				+ "os elementos de uma estrutura de objeto. Esse padrão permite definir uma nova operação\r\n"
				+ "sem alterar as classes dos elementos em que opera.\n");
				
		ArvoreBinaria arvore = new ArvoreBinaria(7);

		arvore.inserir(45);
		arvore.inserir(30);
		arvore.inserir(15);
		arvore.inserir(6);
		arvore.inserir(3);
		arvore.inserir(60);

		System.out.println("ARVORE BINARIA EM ORDEM:");
		arvore.aceitarVisitante(new ExibirInOrderVisitor());
		
		System.out.println("ARVORE BINARIA EM PRE ORDEM:");
		arvore.aceitarVisitante(new ExibirPreOrdemVisitor());
		
		System.out.println("ARVORE BINARIA EM POS ORDEM:");
		arvore.aceitarVisitante(new ExibirPostOrderVisitor());

	}
}