package com.example.demo;

public class Soldado implements Guerra {
	int disparo;
	private boolean vivo;
	private Escudo escudo;
	private int vida;

	public Soldado(){//vive,resiste un disp y no tiene escudo
		this.vivo=true;
		this.vida=1;
		this.escudo=null;
	}
	public int getDisparo() {//dispara
		return 1;
	}
	public void recibirDisparo() {
		int damage=1;
		if(escudo!=null){//si tene escudo reduce el damage
			damage=escudo.reducirDamage(damage);
		}
		vida-=damage;
		if(vida<=0){
			this.vivo=false;//muere
		}
	}
	public boolean estaVivo() {
		return vivo;
	}
	
	public Escudo getEscudo() {

	
		return escudo;
	}
	public void setEscudo(Escudo escudo){
		this.escudo=escudo;
	}
	public void dispararA(Guerra objetivo) {
		objetivo.recibirDisparo();
	}

}
