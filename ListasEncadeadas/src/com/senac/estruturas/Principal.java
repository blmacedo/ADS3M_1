package com.senac.estruturas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public Scanner sc = new Scanner(System.in);
	private LerEscrever file;
	ListaOrdenada<String> lista = new ListaOrdenada<String>();
	ListaOrdenada<String> lista2 = new ListaOrdenada<String>();
	
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
		file = new LerEscrever();
		file.salvar(c);
	}
	public void recuperar(String arquivoSelecionado) throws IOException{
		
		BufferedReader in = new BufferedReader(new FileReader("C:/Users/Christian/Desktop\\Agenda.txt"));
		String str;
		
		try {
		while (in.ready()) {
		str = in.readLine();
		//process(str);
		String f = str;
		String [] s = f.split("     ");
		//System.out.println(s[0] + s[1]);
		Contato c = new Contato(s[0] , s[1]);
		lista2.insert(new Nodo(c));
		
		//System.out.println(str);
		}
		in.close();
} catch (IOException e) {

}

}	
	
	public static int funcao=0;
	
	public static void main(String[] args) throws Exception {		
		(new Principal()).run(args);
	} 
	public void run(String[] args) throws Exception {
		
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
				recuperar("C:/Users/Christian/Desktop\\Agenda.txt");
				lista2.print();
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
