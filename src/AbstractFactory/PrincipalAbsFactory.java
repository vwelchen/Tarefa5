package AbstractFactory;

public class PrincipalAbsFactory {

	public static void main(String[] args) {

		System.out.println("O Abstract Factory pode ser interpretado como um passo além do Factory\n"
				+ "Method, uma vez que também atua com Factories, mas com uma classe\n"
				+ "abstrata fazendo o 'meio campo' entre o cliente (aplicação) e as factories.\n"
				+ "Nesse exemplo a classe abstrata 'veiculo' serve para as quatro classes de veículos:\n"
				+ "Xstreet, Xoffroad, Ystreet e Yoffroad.\n");

		AbstractFactory offRoadFactory = FactoryProducer.getFactory("OffRoad");

		Veiculo carro1 = offRoadFactory.getVeiculo("X");
		carro1.method();

		Veiculo carro2 = offRoadFactory.getVeiculo("Y");
		carro2.method();

		AbstractFactory streetFactory = FactoryProducer.getFactory("Street");

		Veiculo carro3 = streetFactory.getVeiculo("X");
		carro3.method();

		Veiculo carro4 = streetFactory.getVeiculo("Y");
		carro4.method();
	}
}
