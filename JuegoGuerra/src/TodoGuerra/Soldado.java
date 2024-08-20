package TodoGuerra;

public class Soldado implements Guerra {
	int disparo;
	private boolean vivo;
	int escudo;
	private int disparosRecibidos;

	public int getDisparo() {
		return 1;
	}

	public void setDisparo(int disparo) {
		this.disparo = disparo;
	}
	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}
	public int getEscudo() {
		return escudo;
	}
	public Soldado() {
		this.vivo=true;//comienza vivo
		this.disparosRecibidos=0;
		this.escudo=1;
	}
	public Soldado(int escudo) {
		this.vivo=true;
		this.disparosRecibidos=0;
		this.escudo=escudo;
	}
	public void recibirDisparo() {
		if(escudo>0) {
			escudo--;
		}else {
			disparosRecibidos++;
			if(disparosRecibidos>=1) {
				this.vivo=false;//

		}
		}
	}
	public boolean estaVivo() {
		return vivo;
	}

	@Override
	public int escudo() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void dispararA(Guerra objetivo) {
		objetivo.recibirDisparo();
	}

}
