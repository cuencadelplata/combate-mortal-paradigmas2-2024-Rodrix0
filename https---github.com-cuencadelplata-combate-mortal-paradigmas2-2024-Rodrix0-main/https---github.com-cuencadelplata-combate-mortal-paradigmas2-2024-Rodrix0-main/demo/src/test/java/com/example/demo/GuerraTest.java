package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuerraTest {

    @Test
    void soldado_disparo() {
        Guerra soldado = new Soldado();
        assertEquals(1, soldado.getDisparo()); // soldado disparo
    }

    @Test
    void tanque_dispara() {
        Guerra tanque = new Tanque();
        assertEquals(1, tanque.getDisparo()); // tanque disparo
    }

    @Test
    void buque_disparo() {
        Guerra buque = new Buque();
        assertEquals(1, buque.getDisparo()); // buque disparo
    }

    @Test
    void muerte_soldado() {
        Guerra soldado = new Soldado();
        assertTrue(soldado.estaVivo()); // está vivo
        soldado.recibirDisparo(); // recibe el disparo
        assertFalse(soldado.estaVivo()); // muere
    }

    @Test
    void muerte_tanque() {
        Guerra tanque = new Tanque();
        assertTrue(tanque.estaVivo()); // está vivo
        tanque.recibirDisparo(); // recibe el disparo
        assertTrue(tanque.estaVivo()); // sobrevive
        tanque.recibirDisparo(); // recibe otro disparo
        assertFalse(tanque.estaVivo()); // muere
    }

    @Test
    void muerte_buque() {
        Guerra buque = new Buque();
        assertTrue(buque.estaVivo()); // está vivo
        buque.recibirDisparo(); // recibe el disparo
        assertTrue(buque.estaVivo()); // sobrevive
        buque.recibirDisparo(); // recibe otro disparo
        assertTrue(buque.estaVivo()); // sobrevive
        buque.recibirDisparo(); // recibe otro disparo
        assertFalse(buque.estaVivo()); // muere
    }

    @Test
    void escudo_soldado() {
        Soldado soldado = new Soldado();
        soldado.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        assertTrue(soldado.estaVivo()); // está vivo
        soldado.recibirDisparo(); // recibe la bala
        assertFalse(soldado.estaVivo()); // vive por el escudo
        soldado.recibirDisparo(); // recibe otra bala
        assertFalse(soldado.estaVivo()); // muere
    }

    @Test
    void escudo_tanque() {
        Tanque tanque = new Tanque();
        tanque.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        assertTrue(tanque.estaVivo()); // está vivo
        tanque.recibirDisparo(); // recibe la bala
        assertTrue(tanque.estaVivo()); // vive por el escudo
        tanque.recibirDisparo(); // recibe otra bala
        assertFalse(tanque.estaVivo()); // sigue vivo
        tanque.recibirDisparo(); // recibe otra bala
        assertFalse(tanque.estaVivo()); // muere
    }

    @Test
    void escudo_buque() {
        Guerra buque = new Buque();
        buque.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        assertNotNull(buque.getEscudo()); // verifica que el escudo esté activo
        assertTrue(buque.estaVivo()); // está vivo
        buque.recibirDisparo(); // recibe el disparo
        assertTrue(buque.estaVivo()); // vive por el escudo
        buque.recibirDisparo(); // recibe otro disparo
        assertTrue(buque.estaVivo()); // sigue vivo
        buque.recibirDisparo(); // recibe otro disparo
        assertFalse(buque.estaVivo()); // muere
    }

    @Test
    void tanque_dispara_soldado() {
        Guerra soldado = new Soldado();
        Guerra tanque = new Tanque();
        assertTrue(soldado.estaVivo()); // soldado vivo
        tanque.dispararA(soldado); // tanque ataca a soldado
        assertFalse(soldado.estaVivo()); // soldado vive por el escudo
        tanque.dispararA(soldado); // tanque ataca a soldado
        assertFalse(soldado.estaVivo()); // muere
    }

    @Test
    void tanque_dispara_buque() {
        Guerra buque = new Buque();
        buque.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        Guerra tanque = new Tanque();
        assertTrue(buque.estaVivo()); // buque vivo
        tanque.dispararA(buque); // tanque ataca a buque
        assertTrue(buque.estaVivo()); // buque vive por el escudo
        tanque.dispararA(buque); // tanque ataca a buque
        assertTrue(buque.estaVivo()); // sigue vivo
        tanque.dispararA(buque); // otro disparo
        assertFalse(buque.estaVivo()); // sigue vivo
        tanque.dispararA(buque); // otro disparo
        assertFalse(buque.estaVivo()); // muere
    }

    @Test
    void soldado_dispara_buque() {
        Guerra buque = new Buque();
        buque.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        Guerra soldado = new Soldado();
        assertTrue(buque.estaVivo()); // buque vivo
        soldado.dispararA(buque); // soldado ataca a buque
        assertTrue(buque.estaVivo()); // buque vive por el escudo
        soldado.dispararA(buque); // soldado ataca a buque
        assertTrue(buque.estaVivo()); // sigue vivo
        soldado.dispararA(buque); // otro disparo
        assertFalse(buque.estaVivo()); // sigue vivo
        soldado.dispararA(buque); // otro disparo
        assertFalse(buque.estaVivo()); // muere
    }

    @Test
    void soldado_dispara_tanque() {
        Guerra tanque = new Tanque();
        tanque.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        Guerra soldado = new Soldado();
        assertTrue(tanque.estaVivo()); // tanque vivo
        soldado.dispararA(tanque); // soldado ataca a tanque
        assertTrue(tanque.estaVivo()); // tanque vive por el escudo
        soldado.dispararA(tanque); // soldado ataca a tanque
        assertFalse(tanque.estaVivo()); // sigue vivo
        soldado.dispararA(tanque); // otro disparo
        assertFalse(tanque.estaVivo()); // muere
    }

    @Test
    void buque_dispara_tanque() {
        Guerra tanque = new Tanque();
        tanque.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        Guerra buque = new Buque();
        assertTrue(tanque.estaVivo()); // tanque vivo
        buque.dispararA(tanque); // buque ataca a tanque
        assertTrue(tanque.estaVivo()); // tanque vive por el escudo
        buque.dispararA(tanque); // buque ataca a tanque
        assertFalse(tanque.estaVivo()); // sigue vivo
        buque.dispararA(tanque); // otro disparo
        assertFalse(tanque.estaVivo()); // muere
    }

    @Test
    void buque_dispara_soldado() {
        Guerra soldado = new Soldado();
        soldado.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        Guerra buque = new Buque();
        assertTrue(soldado.estaVivo()); // soldado vivo
        buque.dispararA(soldado); // buque ataca a soldado
        assertFalse(soldado.estaVivo()); // soldado vive por el escudo
        buque.dispararA(soldado); // buque ataca a soldado
        assertFalse(soldado.estaVivo()); // sigue vivo
        buque.dispararA(soldado); // otro disparo
        assertFalse(soldado.estaVivo()); // muere
    }

    @Test
    void escudo_chuckNorris() {
        ChuckNorris chuckNorris = new ChuckNorris();
        chuckNorris.setEscudo(new Escudo(0.5)); // escudo que reduce el damage 50%
        assertTrue(chuckNorris.estaVivo()); // está vivo
        chuckNorris.recibirDisparo(); // recibe la bala
        assertTrue(chuckNorris.estaVivo()); // vive por el escudo
        chuckNorris.recibirDisparo(); // recibe otra bala
        assertTrue(chuckNorris.estaVivo()); // muere
    }
}