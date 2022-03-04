package com.codingdojo;

public class TestMurcielago {
	public static void main( String args[]) {
		Murcielago murcielago = new Murcielago(300);	
		
		murcielago.volar();
		murcielago.volar();
		murcielago.volar();
		murcielago.comerHumanos();
		murcielago.comerHumanos();
		murcielago.atacarPueblo();
		murcielago.atacarPueblo();
		
		System.out.println(murcielago.mostrarEnergia());
	}
}
	

