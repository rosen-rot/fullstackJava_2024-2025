package clases;

public class Gerente extends Empleado{
	
	private double bono;

	public Gerente(String nombre, int identificador, double salarioBase, double bono) {
		super(nombre, identificador, salarioBase);
		this.bono = bono;
	}

	@Override
	public double calcularSalarioTotal() {
		return super.calcularSalarioTotal() + bono;
	}

	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
		System.out.println("Bono: " + bono);
	}
	
	
	
	
}
