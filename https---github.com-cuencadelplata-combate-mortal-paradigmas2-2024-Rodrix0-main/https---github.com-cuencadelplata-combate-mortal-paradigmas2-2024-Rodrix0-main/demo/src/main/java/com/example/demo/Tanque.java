package com.example.demo;

public class Tanque implements Guerra {
    private boolean vivo;
    private Escudo escudo;
    private int vida;

    public Tanque() {
        this.vivo = true;
        this.vida = 2;
        this.escudo = null;
    }

    @Override
    public int getDisparo() {
        return 1;
    }

    @Override
    public void recibirDisparo() {
        int damage = 1;
        if (escudo != null) {
            damage = escudo.reducirDamage(damage);
        }
        vida -= damage;
        if (vida <= 0) {
            this.vivo = false;
        }
    }

    @Override
    public boolean estaVivo() {
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
    public void dispararA(Guerra objetivo) {
        objetivo.recibirDisparo();
    }
}