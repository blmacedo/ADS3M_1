package Controle;

import java.util.Scanner;

import Model.Jogador;
import Model.Mapa;
import Model.Navio;

public class Principal {
	public Scanner sc = new Scanner(System.in); 
	public String opcaoColuna = "";
	public int opcaoLinha;
	public Navio barco = new Navio(5);
	//public ConverteColuna convCol=new ConverteColuna();
	

	/*public static void main(String[] args) {
		Jogador jogador1 = new Jogador();
		jogador1.criaMapa();
		System.out.println(jogador1);
		do{
		System.out.println();
		System.out.println("Em qual coluna voce deseja atirar?");
		opcaoColuna = sc.next();
		System.out.println("Em qual linha voce deseja atirar?");
		opcaoLinha = sc.nextInt();


		jogador1.atira(convCol.getColuna(opcaoColuna),opcaoLinha);

		System.out.println(jogador1);
		}while(vida!=0);

	} */
	public static void main(String[] args) throws Exception {		
		(new Principal()).run(args);
	} 
	public void run(String[] args) throws Exception {
		int[][] tabuleiro = new int[10][10];
		Mapa mapa;
		mapa = new Mapa();
		
		mapa.inicializaTabuleiro(tabuleiro);
		mapa.mostraTabuleiro(tabuleiro);
	}
}
