package TodoGuerra;

public class Tanque implements Guerra {
	int disparo;
	private boolean vivo;
	private int disparosRecibidos;

	public int getDisparo() {
		return 1;
	}

	public void setDisparo(int disparo) {
		this.disparo = disparo;
	}

	public Tanque() {
		this.vivo=true;//comienza vivo
		this.disparosRecibidos=0;
	}
	public void recibirDisparo() {
		disparosRecibidos++;
		if(disparosRecibidos>=2) {
			this.vivo=false;//muere despues de dos disparos
		}
		
	}
	public boolean estaVivo() {
		return vivo;
	}
	

}
