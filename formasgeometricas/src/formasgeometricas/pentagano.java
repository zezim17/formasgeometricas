package formasgeometricas;

public class pentagano {
	private double perimetro;
	private double apotema;
	private double area;
	
	
	public void receberperimetro (double perimetro) {
		this.perimetro = perimetro;
	}
	public void reecberapotema(double apotema) {
		this.apotema = apotema;

}
	public void calcArea() {
		area =(1/2*apotema*perimetro);
	}
	public void mostraarea() {
		System.out.println("a area do pentágono e"+ area);
		
	}
	public double mostarareacomretorno() {
		System.out.println(area);
		return area;
	}


}
