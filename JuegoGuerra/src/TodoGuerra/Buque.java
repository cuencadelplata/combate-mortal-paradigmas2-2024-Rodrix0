package TodoGuerra;

public class Buque implements Guerra {
	private int disparosRecibidos;
	private boolean vivo;
	int escudo;
	public Buque() {
		this.vivo=true;//comienza vivo
		this.disparosRecibidos=0;
		this.escudo=1;
	}
	public Buque(int escudo) {
		this.vivo=true;
		this.disparosRecibidos=0;
		this.escudo=escudo;
	}
	public int getDisparo() {
		return 1;
	}

	public void setDisparo(int disparo) {
		this.disparo = disparo;
	}
	@Override
	public int getEscudo() {

		return escudo;
	}

	public void recibirDisparo() {
		if(escudo>0) {
			escudo--;
		}else {
			disparosRecibidos++;
		}
		if(disparosRecibidos>=3) {
				this.vivo=false;
		}
		
	}
	@Override
    public boolean estaVivo() {
        return vivo;
    }
}
