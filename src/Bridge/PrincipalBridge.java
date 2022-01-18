package Bridge;

public class PrincipalBridge {
	public static void main(String[] args) {

		System.out.println("Bridge (ou ponte) é um padrão baseado na ideia da\n"
				+ "separação de uma classe em duas frentes: a implementação e a abstração. Dessa\n"
				+ "forma, se monta uma hierarquia baseada em duas ou mais classes distintas, cada\n"
				+ "parte especializada em uma abordagem, mas ligadas por uma composição. Essa\n"
				+ "composição que liga as duas pontas representaria a 'ponte' de comunicação entre\n"
				+ "as entidades. O exemplo desse código exibe dados de veículos e suas funções.\n"
				+ "Existem dois elementos base: a classe abstrata Veículo e a interface Transporte.\n"
				+ "A composição que há entre elas é a ponte que faz o padrão funcionar.\n");

		System.out.println(" ---------------------------------------- ");

		Veiculo caminhao = new Caminhao("Randon", new Cargas());
		caminhao.realizarAtividade();

		System.out.println(" ---------------------------------------- ");

		Veiculo onibus = new Onibus("Marcopolo", new Pessoas());
		onibus.realizarAtividade();

		System.out.println(" ---------------------------------------- ");
	}
}