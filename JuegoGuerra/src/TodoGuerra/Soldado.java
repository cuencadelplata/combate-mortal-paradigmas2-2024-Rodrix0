package TodoGuerra;

public class Soldado implements Guerra {
	int disparo;
	private boolean vivo;

	public int getDisparo() {
		return 1;
	}

	public void setDisparo(int disparo) {
		this.disparo = disparo;
	}
	public Soldado() {
		this.vivo=true;//comienza vivo
	}
	public void recibirDisparo() {
		this.vivo=false;//muere al recibir el disparo
	}
	public boolean estaVivo() {
		return vivo;
	}


}
