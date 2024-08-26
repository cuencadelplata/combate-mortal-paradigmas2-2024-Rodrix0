package com.example.demo;

public class ChuckNorris implements Guerra {
    int disparo;
    private Escudo escudo;
    public ChuckNorris() {
        this.escudo = null;
    }

    public int getDisparo() {
        return 1;
    }

    public void recibirDisparo() {
        // Chuck Norris no recibe daño, su vida no se reduce
    }

    public boolean estaVivo() {
        return true;  // Siempre está vivo
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

    public void dispararA(Guerra objetivo) {
        objetivo.recibirDisparo();
    }
}