package Facade;

public class ComputadorFacade {

	public HardDrive harddrive;
	public Memoria memoria;
	public Processador processador;

	public ComputadorFacade() {

		this.harddrive = new HardDrive();
		this.memoria = new Memoria();
		this.processador = new Processador();

	}

	public void Executar() {
		harddrive.leDado();
		memoria.CarregaDado();
		processador.ProcessaDado();

	}

}