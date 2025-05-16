package formasgeometricas;

public class quadrado {
	private double lado;
	private double area;
	
	
	public void receberlado (double lado) {
		this.lado = lado;
	}


	public void calcquadrado() {
		area =(lado*lado);
	}
	public void mostraarea() {
		System.out.println("a area do quadrado e"+ area);
		
	}
	public double mostarareacomretorno() {
		System.out.println(area);
		return area;
	}

}
