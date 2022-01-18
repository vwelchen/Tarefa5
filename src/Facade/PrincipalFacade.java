package Facade;

public class PrincipalFacade {

	public static void main(String[] args) {
		
		System.out.println("O Padrão Facade (ou Fachada) é usado quando um sistema é muito complexo\r\n"
				+ "ou difícil de entender, já que possui um grande número de classes independentes tornando\r\n"
				+ "a interface simples e entendível para o cliente final usuário do sistema.\r\n"
				+ "No exemplo foram criadas três classes com métodos fictícios que serão agrupados\r\n"
				+ "na classe ComputadorFacade.\n");
		
		ComputadorFacade facade = new ComputadorFacade();
		facade.Executar();
	}

}
