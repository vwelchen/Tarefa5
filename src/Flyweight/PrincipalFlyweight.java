package Flyweight;

import java.util.Random;

//Game CounterStrike

public class PrincipalFlyweight {
	private static String[] playerType = { "Terrorist", "CounterTerrorist" };
	private static String[] weapons = { "AK-47", "AWP", "Knife", "Desert Eagle" };

	public static void main(String args[]) {

		System.out.println("O Flyweight é um padrão que busca otimizar o uso\n"
				+ "de memória através do reaproveitamento de objetos que compartilham de\n"
				+ "características em comum. A memória do computador é um recurso finito,\n"
				+ "sendo assim, podemos separar a informação repetida dos objetos daquelas\n"
				+ "que sofrem alterações. Para o exemplo de código, foi utilizado o jogo Counter\n"
				+ "Strike. No jogo há dois times, terroristas (T) e contra\n"
				+ "terroristas (CT). Caso o padrão Flyweight não fosse empregado,\n"
				+ "teríamos um novo objeto para cada novo jogador. Mas usando o\n"
				+ "padrão, podemos criar uma interface para jogador e uma classe\n"
				+ "para T e outra para CT, ambas derivadas da interface jogador. Com isso,\n"
				+ "podemos criar apenas dois objetos e reaproveitar seus estados intrínsecos.\n");

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
