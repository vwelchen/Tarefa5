package Mediator;

public class PrincipalMediator {
	public static void main(String[] args) {
		
		System.out.println("Mediator tem a inten��o de definir um objeto que encapsula a forma como um conjunto\r\n"
				+ "de objetos interagem. Promove o acoplamento fraco evitando que os objetos se refiram explicitamente\r\n"
				+ "uns aos outros e nos permite variar sua intera��o de forma independente. � utilizado para fornecer\r\n"
				+ "um meio de comunica��o centralizado entre diferentes objetos em um sistema, quando a l�gica de\r\n"
				+ "comunica��o entre objetos � complexa, possibilitando ter um ponto central de comunica��o que cuida\r\n"
				+ "da l�gica de comunica��o. No exemplo do Chat apresentado, h� um objeto central ou �rbitro mediador\r\n"
				+ "que est� interagindo com o resto de usu�rios de tal modo que todos os usu�rios que est�o nesta\r\n"
				+ " sala de chat, quando enviam uma mensagem para outro, eles fazem isso atrav�s do mediador,\r\n"
				+ "que � o �nico que gerencia essas mensagens e entrega ao destinat�rio.\n");
		
		IChatRoom chatroom = new ChatRoom();

		User user1 = new ChatUser(chatroom, "1", "Maria");
		User user2 = new ChatUser(chatroom, "2", "Jos�");
		User user3 = new ChatUser(chatroom, "3", "Jo�o");
		User user4 = new ChatUser(chatroom, "4", "Ana");

		chatroom.addUser(user1);
		chatroom.addUser(user2);
		chatroom.addUser(user3);
		chatroom.addUser(user4);

		user1.send("Hello brian", "2");
		user2.send("Hey buddy", "1");

	}
}