package com.codingdojo;


public class Murcielago extends Mamifero{


	public Murcielago(int nivelDeEnergia) {
		super(nivelDeEnergia);
		// TODO Auto-generated constructor stub
	}
	
	public void volar() {
		System.out.println("woooww");
		setNivelDeEnergia(getNivelDeEnergia() - 50);
	}
	
	public void comerHumanos() {
		System.out.println("jum jum  ");
		setNivelDeEnergia(getNivelDeEnergia() + 25);
	}
	
	public void atacarPueblo() {
		System.out.println("fuego ");
		setNivelDeEnergia(getNivelDeEnergia() - 100);
	}
}