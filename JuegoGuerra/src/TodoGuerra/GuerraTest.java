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
		Guerra soldado =new Soldado();
		assertTrue(soldado.estaVivo());//esta vivo
		soldado.recibirDisparo();//recibe el disparo
		assertFalse(soldado.estaVivo());//muere
		
	}
	@Test
	void muerte_tanque() {
		Guerra tanque =new Tanque();
		assertTrue(tanque.estaVivo());//esta vivo
		tanque.recibirDisparo();//recibe el disparo
		assertTrue(tanque.estaVivo());
		tanque.recibirDisparo();
		assertFalse(tanque.estaVivo());//muere


		
	}
	@Test
	void muerte_bunque() {
		Guerra buque =new Buque();
		assertTrue(buque.estaVivo());//esta vivo
		buque.recibirDisparo();//recibe el disparo
		assertTrue(buque.estaVivo());
		buque.recibirDisparo();
		assertTrue(buque.estaVivo());
		buque.recibirDisparo();
		assertFalse(buque.estaVivo());//muere


		
	}
	
	

}
