package clases;

public class Empleado {
	private String nombre;
	private int identificador;
	private double salarioBase;
	
	public Empleado(String nombre, int identificador, double salarioBase) {
		this.nombre = nombre;
		this.identificador = identificador;
		this.salarioBase = salarioBase;
	}
	
	public double calcularSalarioTotal() {
		return salarioBase * 160;
	}
	
	public void mostrarInformacion() {
        System.out.println("Empleado: " + nombre);
        System.out.println("ID: " + identificador);
        System.out.println("Salario Base: " + salarioBase);
        System.out.println("Salario Total: " + calcularSalarioTotal());
    }
}
