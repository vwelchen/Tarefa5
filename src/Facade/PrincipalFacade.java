package Facade;

public class PrincipalFacade {

	public static void main(String[] args) {
		
		System.out.println("O Padr�o Facade (ou Fachada) � usado quando um sistema � muito complexo\r\n"
				+ "ou dif�cil de entender, j� que possui um grande n�mero de classes independentes tornando\r\n"
				+ "a interface simples e entend�vel para o cliente final usu�rio do sistema.\r\n"
				+ "No exemplo foram criadas tr�s classes com m�todos fict�cios que ser�o agrupados\r\n"
				+ "na classe ComputadorFacade.\n");
		
		ComputadorFacade facade = new ComputadorFacade();
		facade.Executar();
	}

}
