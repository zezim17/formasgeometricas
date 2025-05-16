package formasgeometricas;

public class hexagono {
	private double lado;
	private double area;
	
	
	public void receberlado (double lado) {
		this.lado = lado;
	}

	public void calcArea() {
		area =(3*Math.sqrt(3)*lado*lado)/2;
	}
	public void mostraarea() {
		System.out.println("a area do hexagono e"+ area);
		
	}
	public double mostrarareacomretorno() {
		System.out.println(area);
		return area;
	}

}
