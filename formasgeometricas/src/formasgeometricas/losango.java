package formasgeometricas;

public class losango {
	private double diagonalmaior;
	private double diagonalmenor;
	private double area;
	
	
	
	public void receberdiagonalmenor (double diagonalmenor) {
		this.diagonalmenor= diagonalmenor;
	}
	public void receberdiagonalmaior(double diagonalmaior) {
		this.diagonalmaior=diagonalmaior;

}
	
	public void calcArea() {
		area =(diagonalmenor*diagonalmaior)/2;
	}
	public void mostraarea() {
		System.out.println("a area do losango e"+ area);
		
	}
	public double mostraareacomretorno() {
		System.out.println(area);
		return area;
	}

}
