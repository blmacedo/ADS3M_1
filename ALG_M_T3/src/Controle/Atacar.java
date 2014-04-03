package Controle;

public class Atacar {
	private int opcaoLinha;
	private int opcaoColuna;
	
	public void AtacarTiro(int opcaoLinha, int opcaoColuna) {
		this.opcaoLinha = opcaoLinha;
		this.opcaoColuna = opcaoColuna;
	}
	
	public int getopcaoLinha() {
		return opcaoLinha;
	}
	
	public void setTamanho(int opcaoLinha) {
		this.opcaoLinha = opcaoLinha;
	}
	public int getopcaoColuna() {
		return opcaoColuna;
	}
	
	public void setopcaoColuna(int opcaoColuna) {
		this.opcaoColuna = opcaoColuna;
	}

}
