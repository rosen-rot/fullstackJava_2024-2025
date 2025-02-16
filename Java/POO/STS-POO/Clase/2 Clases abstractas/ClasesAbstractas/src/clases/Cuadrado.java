package clases;

public class Cuadrado extends Figura {
	
	private double longitud;

	public Cuadrado(double longitud) {
		super();
		this.longitud = longitud;
	}

	@Override
	public double area() {
		return longitud*longitud;
	}
	
	

}
