package clases;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int ano;
	
	public Vehiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public String despliegaInformacion() {
		return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + ano;
	}
}
