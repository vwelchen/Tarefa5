package Flyweight;

import java.util.Random;

//Game CounterStrike

public class PrincipalFlyweight {
	private static String[] playerType = { "Terrorist", "CounterTerrorist" };
	private static String[] weapons = { "AK-47", "AWP", "Knife", "Desert Eagle" };

	public static void main(String args[]) {

		System.out.println("O Flyweight � um padr�o que busca otimizar o uso\n"
				+ "de mem�ria atrav�s do reaproveitamento de objetos que compartilham de\n"
				+ "caracter�sticas em comum. A mem�ria do computador � um recurso finito,\n"
				+ "sendo assim, podemos separar a informa��o repetida dos objetos daquelas\n"
				+ "que sofrem altera��es. Para o exemplo de c�digo, foi utilizado o jogo Counter\n"
				+ "Strike. No jogo h� dois times, terroristas (T) e contra\n"
				+ "terroristas (CT). Caso o padr�o Flyweight n�o fosse empregado,\n"
				+ "ter�amos um novo objeto para cada novo jogador. Mas usando o\n"
				+ "padr�o, podemos criar uma interface para jogador e uma classe\n"
				+ "para T e outra para CT, ambas derivadas da interface jogador. Com isso,\n"
				+ "podemos criar apenas dois objetos e reaproveitar seus estados intr�nsecos.\n");

		for (int i = 0; i < 4; i++) {
			Player player = PlayerFactory.getPlayer(getRandomPlayerType());

			player.assignWeapon(getRandomWeapon());

			player.mission();
		}
	}

	public static String getRandomPlayerType() {
		Random random = new Random();
		int randInt = random.nextInt(playerType.length);
		return playerType[randInt];
	}

	public static String getRandomWeapon() {
		Random random = new Random();
		int randInt = random.nextInt(weapons.length);
		return weapons[randInt];
	}
}
