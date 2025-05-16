package formasgeometricas;

public class paralelepipedo {
	private double base;
	private double area;
	private double altura;
	
	
	public void receberbase (double base) {
		this.base= base;
	}

	public void receberaltura(double altura) {
		this.altura = altura;
	}
	public void calcArea() {
		area =(base*altura);
	}
	public void mostraarea() {
		System.out.println("a area do paralelepipedo"+ area);
		
	}
	public double mostarareacomretorno() {
		System.out.println(area);
		return area;
	}

}
