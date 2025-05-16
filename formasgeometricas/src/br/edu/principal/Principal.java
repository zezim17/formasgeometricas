package br.edu.principal;
import formasgeometricas.*;
public class Principal {

	public static void main(String[] args) {
		triangulo fg1 = new triangulo();
		fg1.receberaltura(7);
		fg1.reecbebase(10);
		fg1.calcArea();
		fg1.mostraarea();
		fg1.mostarareacomretorno();
		
		trapezio fg2 = new trapezio();
		fg2.receberbasemenor(4);
		fg2.reecbebasemaior(4);
		fg2.receberaltura(4);
		fg2.calcArea();
		fg2.mostarareacomretorno();
		
		quadrado fg3 = new quadrado();
		fg3.receberlado(4);
		fg3.calcquadrado();
		fg3.mostraarea();
		fg3.mostarareacomretorno();
		
		pentagano fg4 = new pentagano();
		fg4.receberperimetro(4);
		fg4.reecberapotema(10);
		fg4.mostraarea();
		fg4.mostarareacomretorno();
		
		losango fg5 = new losango();
		fg5.receberdiagonalmaior(4);
		fg5.receberdiagonalmenor(4);
		fg5.calcArea();
		fg5.mostraarea();
		fg5.mostraareacomretorno();
		
		hexagono fg6 = new hexagono();
		fg6.receberlado(4);
		fg6.calcArea();
		fg6.mostraarea();
		fg6.mostrarareacomretorno();
		
		circulo fg7 = new circulo();
		fg7.receberraio(4);
		fg7.calcarea();
		fg7.mostrararea();
		fg7.mostrarareacomretorno();

	}
}
