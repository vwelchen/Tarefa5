package Menu;

import java.util.Scanner;

import AbstractFactory.PrincipalAbsFactory;
import Bridge.PrincipalBridge;
import ChainsOfResponsibility.PrincipalChainsOfResponsibility;
import Composite.PrincipalComposite;
import Facade.PrincipalFacade;
import Flyweight.PrincipalFlyweight;
import Mediator.PrincipalMediator;
import Visitor.PrincipalVisitor;

public class Menu {

	private Scanner leitura;

	public Menu() {
		leitura = new Scanner(System.in);
		controle();
	}

	public void menu() {
		System.out.println("\n>>>DESIGN PATTERNS<<<");
		System.out.println("1 - Abstract Factory");
		System.out.println("2 - Bridge");
		System.out.println("3 - Builder");
		System.out.println("4 - Chain of Responsibility");
		System.out.println("5 - Composite");
		System.out.println("6 - Facade");
		System.out.println("7 - Flyweight");
		System.out.println("8 - Mediator");
		System.out.println("9 - Memento");
		System.out.println("10 - Prototype");
		System.out.println("11 - Proxy");
		System.out.println("12 - State");
		System.out.println("13 - Visitor");
		System.out.println("0 - Sair");
	}

	public void controle() {
		int opcao;
		menu();
		System.out.println("\nINFORME SUA OPÇÃO: ");
		opcao = leitura.nextInt();
		while (opcao != 0) {
			switch (opcao) {
			case 1:
				PrincipalAbsFactory.main(null);
				break;

			case 2:
				PrincipalBridge.main(null);
				break;
				
			case 3:

				break;

			case 4:
				PrincipalChainsOfResponsibility.main(null);
				break;

			case 5:
				PrincipalComposite.main(null);
				break;
				
			case 6:
				PrincipalFacade.main(null);
				break;

			case 7:
				PrincipalFlyweight.main(null);
				break;

			case 8:
				PrincipalMediator.main(null);
				break;

			case 9:

				break;

			case 10:

				break;

			case 11:

				break;

			case 12:

				break;

			case 13:
				// printar a explicação do design e como o exemplo explica o projeto
				PrincipalVisitor.main(null);
				break;

			default:
				System.out.println("Opção inválida!");
			}
			menu();
			System.out.println("\nINFORME SUA OPÇÃO: ");
			opcao = leitura.nextInt();

		}
	}

	public static void main(String[] args) {
		Menu menu = new Menu();
	}
}