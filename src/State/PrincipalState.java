package State;

public class PrincipalState {

	public static void main(String[] args) {
		
		System.out.println("O padrão de State permite que um objeto altere seu comportamento quando\r\n"
				+ "seu estado interno muda. O objeto parecerá mudar sua classe. Deve haver uma classe\r\n"
				+ "concreta separada para cada estado possível de um objeto. O exemplo representa\r\n"
				+ "os possíveis estados de uma TV ao pressionar os botões do controle remoto.\r\n"
				+ "Mas o estado da TV mudará ou não, depende do estado atual da TV. Se a TV estiver ‘ligada’,\r\n"
				+ "podemos desligá-la, silenciar ou alterar os aspectos e a fonte. Mas se a TV estiver desligada,\r\n"
				+ "nada acontecerá quando pressionamos os botões do controle remoto. Para uma TV desligada\r\n"
				+ "apenas o próximo estado possível pode ser ‘ligado’.\n");
		
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();

		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

	}

}
