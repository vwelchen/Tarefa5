package Bridge;

public class PrincipalBridge {
	public static void main(String[] args) {

		System.out.println("Bridge (ou ponte) � um padr�o baseado na ideia da\n"
				+ "separa��o de uma classe em duas frentes: a implementa��o e a abstra��o. Dessa\n"
				+ "forma, se monta uma hierarquia baseada em duas ou mais classes distintas, cada\n"
				+ "parte especializada em uma abordagem, mas ligadas por uma composi��o. Essa\n"
				+ "composi��o que liga as duas pontas representaria a 'ponte' de comunica��o entre\n"
				+ "as entidades. O exemplo desse c�digo exibe dados de ve�culos e suas fun��es.\n"
				+ "Existem dois elementos base: a classe abstrata Ve�culo e a interface Transporte.\n"
				+ "A composi��o que h� entre elas � a ponte que faz o padr�o funcionar.\n");

		System.out.println(" ---------------------------------------- ");

		Veiculo caminhao = new Caminhao("Randon", new Cargas());
		caminhao.realizarAtividade();

		System.out.println(" ---------------------------------------- ");

		Veiculo onibus = new Onibus("Marcopolo", new Pessoas());
		onibus.realizarAtividade();

		System.out.println(" ---------------------------------------- ");
	}
}