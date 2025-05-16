package formasgeometricas;

public class trapezio {
	private double basemaior;
	private double basemenor;
	private double area;
	private double altura;
	
	
	public void receberbasemenor (double basemenor) {
		this.basemenor= basemenor;
	}
	public void reecbebasemaior(double basemaior) {
		this.basemaior=basemaior;

}
	public void receberaltura(double altura) {
		this.altura = altura;
	}
	public void calcArea() {
		area =(basemenor*basemaior)*altura/2;
	}
	public void mostraarea() {
		System.out.println("a area do trapezio e"+ area);
		
	}
	public double mostarareacomretorno() {
		System.out.println(area);
		return area;
	

}
}
