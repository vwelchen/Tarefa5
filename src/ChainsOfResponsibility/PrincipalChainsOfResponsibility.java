package ChainsOfResponsibility;

public class PrincipalChainsOfResponsibility {

	public static void main(String[] args) {
		
		System.out.println("O padrão Chain of Responsibility consiste em uma série de objetos receptores e de objetos\r\n"
				+ "de solicitação, onde cada objeto de solicitação possui uma lógica interna que separa quais são\r\n"
				+ "tipos de objetos receptores que podem ser manipulados e passa o restante para o próximo objeto de\r\n"
				+ "solicitação da cadeia. No exemplo vemos a implementação para lidar com a eventual criação de diferentes\r\n"
				+ "tipos de logs. No exemplo podemos ter logs dos tipos “info”, “warning” e “error”, ficando\r\n"
				+ "aberta e simples a possibilidade de tratar cada tipo desses logs de maneira diferente,\r\n"
				+ "caso seja desejado. Como um log só pode ser de um tipo, quando a corrente chega a\r\n"
				+ "este tipo, o log é tratado e a execução da corrente é parada.\n");
		
		//Instancio os Handlers
		LogInfoHandler logInfoHandler = new LogInfoHandler();
		LogWarningHandler logWarningHandler = new LogWarningHandler();
		LogErrorHandler logErrorHandler = new LogErrorHandler();

		logInfoHandler.next(logWarningHandler);
		logWarningHandler.next(logErrorHandler);

		String response = logInfoHandler.handle("error");
		System.out.println(response);
	}

}