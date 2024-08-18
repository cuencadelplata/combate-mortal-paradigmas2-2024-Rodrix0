package TodoGuerra;

public class Buque implements Guerra {
	int disparo;
	private int disparosRecibidos;
	private boolean vivo;

	public int getDisparo() {
		return 1;
	}

	public void setDisparo(int disparo) {
		this.disparo = disparo;
	}
	public Buque() {
		this.vivo=true;//comienza vivo
		this.disparosRecibidos=0;
	}
	public void recibirDisparo() {
		disparosRecibidos++;
		if(disparosRecibidos>=3) {
			this.vivo=false;//muere despues de dos disparos
		}else {
			this.vivo=true;
		}
		
	}
	public boolean estaVivo() {
		return vivo;
	}
	

}
