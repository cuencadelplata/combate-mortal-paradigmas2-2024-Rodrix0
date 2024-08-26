package com.example.demo;

public class Escudo {
    private double porcentajeReduccion;
    public Escudo(double porcentajeReduccion){

        this.porcentajeReduccion=porcentajeReduccion;
    }
    public int reducirDamage(int damage){
       return(int)Math.ceil(damage*(1-porcentajeReduccion));
    }
    public double getPorcentajeReduccion(){
        return porcentajeReduccion;
    }
    
}
