package Controle;

import java.util.Scanner;

import Model.Jogador;
import View.Mapa;

public class Principal {
	public Scanner sc = new Scanner(System.in);
	public int opcaoColuna;
	public int opcaoLinha;

	public void map() {
		Mapa mapa;
		mapa = new Mapa();
		mapa.inicializaTabuleiro();
		mapa.criarFrota();
		mapa.mostraTabuleiro();
	}

	public static void main(String[] args) throws Exception {
		(new Principal()).run(args);
	}

	public void run(String[] args) throws Exception {
		Jogador jogador = new Jogador("Bruno");
		Atacar tiro = new Atacar();
		map();
		do {
			System.out.println("Em qual coluna voce deseja atirar?");
			opcaoColuna = sc.nextInt();

			System.out.println("Em qual linha voce deseja atirar?");
			opcaoLinha = sc.nextInt();
			
			Mapa.AtacarTir(opcaoLinha, opcaoColuna);
			Mapa.mostraTabuleiro();

		} while (jogador.getPontuacaoInicial() != 0);
	}
}
