package com.senac.estruturas;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public Scanner sc = new Scanner(System.in);
	public int funcao=0;
	private LerEscrever file;
	ListaOrdenada<String> lista = new ListaOrdenada<String>();
	//ListaOrdenada<String> lista2 = new ListaOrdenada<String>();
	
	
	public void Ler() throws IOException{
		String nome;
		String telefone;
		System.out.println("Digite o nome a ser inserido:");
		nome = sc.next();
		System.out.println("Digite o numero a ser inserido:");
		telefone = sc.next();
		Contato c = new Contato(nome, telefone);
		insereContatos(c);
	}
	
	public void insereContatos(Contato c) throws IOException{
		lista.insert(new Nodo(c));
		file.salvar(c);
	}
	
	public static void main(String[] args) throws Exception {		
		(new Principal()).run(args);
	} 
	public void run(String[] args) throws Exception {
		file = new LerEscrever();
		Boolean teste = true;
		while(teste){
			System.out.println("Agenda:\n");
			System.out.println("O que você deseja fazer?" +
					"\n1 - Inserir" +
					"\n2 - Remover" +
					"\n3 - Pesquisar" +
					"\n4 - Mostrar" +
					"\n5 - Sair");
			funcao = sc.nextInt();
			switch(funcao){
			case 1 :
				Ler();
				break;
			case 2 :
				//removeContatos();
				break;
			case 3 :
				//pesquisaContatos();
				break;
			case 4 :
				System.out.println("Agenda:\n");
				file.recuperar();
				break;
			case 5 :
				teste = false;
				break;
			default :
				System.out.println("Opcao Invalida!");
			}

		}
		
	}

}
