package formasgeometricas;

public class triangulo {

	private double base;
	private double altura;
	private double area;
	
	
	public void receberaltura (double altura) {
		this.altura = altura;
	}
	public void reecbebase(double base) {
		this.base=base;

}
	public void calcArea() {
		area =(base*altura)/2;
	}
	public void mostraarea() {
		System.out.println("a area do triangulo e"+ area);
		
	}
	public double mostarareacomretorno() {
		System.out.println(area);
		return area;
	}

}
