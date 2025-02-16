package clases;

public class TrianguloEq extends Figura{

	private double base;
	private double altura;
	
	public TrianguloEq(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return (base*altura)/2;
	}
	
	
}
