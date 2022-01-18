package State;

public class PrincipalState {

	public static void main(String[] args) {
		
		System.out.println("O padr�o de State permite que um objeto altere seu comportamento quando\r\n"
				+ "seu estado interno muda. O objeto parecer� mudar sua classe. Deve haver uma classe\r\n"
				+ "concreta separada para cada estado poss�vel de um objeto. O exemplo representa\r\n"
				+ "os poss�veis estados de uma TV ao pressionar os bot�es do controle remoto.\r\n"
				+ "Mas o estado da TV mudar� ou n�o, depende do estado atual da TV. Se a TV estiver �ligada�,\r\n"
				+ "podemos deslig�-la, silenciar ou alterar os aspectos e a fonte. Mas se a TV estiver desligada,\r\n"
				+ "nada acontecer� quando pressionamos os bot�es do controle remoto. Para uma TV desligada\r\n"
				+ "apenas o pr�ximo estado poss�vel pode ser �ligado�.\n");
		
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

	}

}
