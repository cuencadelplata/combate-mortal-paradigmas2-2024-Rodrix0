package TodoGuerra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuerraTest {
	

	@Test
	void soldado_disparo() {
		Guerra soldado=new Soldado();
		assertEquals(1,soldado.getDisparo());//soldado disparo
		
	}
	@Test
	void tanque_dispara() {
		 Guerra tanque =new Tanque();
		assertEquals(1,tanque.getDisparo());//tanque disparo
		
	}
	@Test
	void buque_disparo() {
		Guerra buque=new Buque();
		assertEquals(1,buque.getDisparo());//buque disparo
		
	}
	@Test
	void muerte_soldado() {
		Guerra soldado =new Soldado(0);
		assertTrue(soldado.estaVivo());//esta vivo
		soldado.recibirDisparo();//recibe el disparo
		assertFalse(soldado.estaVivo());//muere
		
	}
	@Test
	void muerte_tanque() {
		Guerra tanque =new Tanque(0);
		assertTrue(tanque.estaVivo());//esta vivo
		tanque.recibirDisparo();//recibe el disparo
		assertTrue(tanque.estaVivo());
		tanque.recibirDisparo();
		assertFalse(tanque.estaVivo());//muere


		
	}
	@Test
	void muerte_bunque() {
		Guerra buque =new Buque(0);
		assertTrue(buque.estaVivo());//esta vivo
		buque.recibirDisparo();//recibe el disparo
		assertTrue(buque.estaVivo());
		buque.recibirDisparo();
		assertTrue(buque.estaVivo());
		buque.recibirDisparo();
		assertFalse(buque.estaVivo());//muere


		
	}
	@Test
	void escudo_soldado() {
		Guerra soldado=new Soldado();
		assertEquals(1,soldado.getEscudo());//escudo activo
		assertTrue(soldado.estaVivo());//esta vivo
		soldado.recibirDisparo();//recibe el disparo
		assertTrue(soldado.estaVivo());//vive por el escudo
		soldado.recibirDisparo();//recibe el disparo
		assertFalse(soldado.estaVivo());//muere

	}
	@Test
	void escudo_tanque() {
		Guerra tanque=new Tanque();
		assertEquals(1,tanque.getEscudo());//escudo activo
		assertTrue(tanque.estaVivo());//esta vivo
		tanque.recibirDisparo();//recibe el disparo
		assertTrue(tanque.estaVivo());//vive por el escudo
		tanque.recibirDisparo();//recibe el disparo
		assertTrue(tanque.estaVivo());//50%
		tanque.recibirDisparo();//recibe el disparo
		assertFalse(tanque.estaVivo());//muere
	}
	@Test
	void escudo_buque() {
		Guerra buque=new Buque();
		assertEquals(1,buque.getEscudo());//escudo activo
		assertTrue(buque.estaVivo());//esta vivo
		buque.recibirDisparo();//recibe el disparo
		assertTrue(buque.estaVivo());//vive por el escudo
		buque.recibirDisparo();//recibe el disparo
		assertTrue(buque.estaVivo());//50%
		buque.recibirDisparo();//recibe el disparo
		assertTrue(buque.estaVivo());
		buque.recibirDisparo();//recibe el disparo
		assertFalse(buque.estaVivo());//muere
	}
	
	
	

}
