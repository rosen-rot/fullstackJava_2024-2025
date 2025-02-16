package clases;

public class Director extends Gerente {

	private double acciones;
	
	public Director(String nombre, int identificador, double salarioBase, double bono, double acciones) {
		super(nombre, identificador, salarioBase, bono);
		this.acciones = acciones;
	}

	@Override
    public double calcularSalarioTotal() {
        return super.calcularSalarioTotal() + acciones;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Acciones: " + acciones);
    }
}
