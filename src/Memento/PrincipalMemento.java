package Memento;

public class PrincipalMemento {
	public static void main(String[] args) {

		System.out.println("O Memento foi criado com o intuito de armazenar e recuperar os estados anteriores de um objeto,\r\n"
						+ "dessa forma, é produzido um ‘registro’ ou histórico dele. O padrão tem três principais conceitos, \r\n"
						+ "conforme o exemplo: um objeto ‘original’ cujo estado se deseja capturar/registrar (originator),\r\n"
						+ "o registro desse objeto (memento) e uma lista desses registros (history).\n");

		Originator originador = new Originator();
		History armazenador = new History();

		originador.setState("State #1");

		originador.setState("State #2");
		armazenador.saveState(originador.generateMemento());

		originador.setState("State #3");
		armazenador.saveState(originador.generateMemento());

		originador.setState("State #4");
		System.out.println("Current State: " + originador.getState());

		originador.setStateFromMemento(armazenador.getState(0));
		System.out.println("First saved State ----- " + originador.getState());

		originador.setStateFromMemento(armazenador.getState(1));
		System.out.println("Second saved State ----- " + originador.getState());
	}
}