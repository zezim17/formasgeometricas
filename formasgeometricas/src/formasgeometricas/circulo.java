package formasgeometricas;

public class circulo {
	private double pi;
	private double area;
	private double raio;
	
	
	public void recebertt (double tt) {
		this.pi = Math.PI;
	}
	public void receberraio(double raio) {
		this.raio = raio;
	}


	public void calcarea() {
		area =(pi*raio);
	}
	public void mostrararea() {
		System.out.println("a area do circulo e"+ area);
		
	}
	public double mostrarareacomretorno() {
		System.out.println(area);
		return area;
	}


}
