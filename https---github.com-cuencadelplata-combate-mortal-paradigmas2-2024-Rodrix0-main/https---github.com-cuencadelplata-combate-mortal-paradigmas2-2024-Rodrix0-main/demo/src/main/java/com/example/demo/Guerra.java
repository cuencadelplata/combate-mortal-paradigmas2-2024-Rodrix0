package com.example.demo;

public interface Guerra {
    int getDisparo();
    void recibirDisparo();
    boolean estaVivo();
    Escudo getEscudo();
    void setEscudo(Escudo escudo);
    void dispararA(Guerra objetivo); 
}