package com.example.demo;

public class Buque implements Guerra {
    private boolean vivo;
    private Escudo escudo;
    private int vida;

    public Buque() {//comieza vivo,resiste 3 disp,y no tiene escudo
        this.vivo = true;
        this.vida = 3;
        this.escudo = null;
    }

    @Override
    public int getDisparo() {//buque dispara
        return 1;
    }

    @Override
    public void recibirDisparo() {
        int damage = 1;
        if (escudo != null) {//si tiene escudo
            damage = escudo.reducirDamage(damage);//se reduce el damage
        }
        vida -= damage;//descuento lo que se reduce
        if (vida <= 0) {//hasta que llegue a 0
            this.vivo = false;//muere
        }
    }

    @Override
    public boolean estaVivo() {//1 vivo, 0 muere
        return vivo;
    }

    @Override
    public Escudo getEscudo() {
        return escudo;
    }

    @Override
    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    @Override
    public void dispararA(Guerra objetivo) {//dispara a alguien
        objetivo.recibirDisparo();
    }
}