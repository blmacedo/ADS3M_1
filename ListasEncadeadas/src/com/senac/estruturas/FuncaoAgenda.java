package com.senac.estruturas;

import static java.lang.System.out;

import java.io.IOException;

public class FuncaoAgenda {
	private LerEscrever file;
	
	public FuncaoAgenda() {
		file = new LerEscrever();
	}
	
	public static void main(String[] args) throws IOException {		
		(new FuncaoAgenda()).run(args);
	} 
	public void run(String[] args) throws IOException {
	ListaEncadeada<String> lista = new ListaEncadeada<String>();
	file = new LerEscrever();

	Contato c = new Contato("Adamastor", "123 456 789 10");
	Contato b = new Contato("teste", "123 456 789 101");
	//out.println(c.getNome() + c.getTelefone());
	file.salvar(c);
	
	//Nodo node = new Nodo(c);
	//Nodo nodeb = new Nodo(b);
	//lista.insert(node);
	//lista.insert(nodeb);
	
	
	
	
	
	
	//Nodo nodeRes = lista.ge;
	//Contato r = (Contato) nodeRes.getData();
	
	
  //  lista.print();
	
	
	
    //lista.addFirst(node);

	//out.println(node.getData + Contato.getTelefone());
		
		
		//lista.insert(new Nodo<String>("Tiago"), lista.getHead());
	//	lista.append(new Nodo<String>("Mauro"));
		//lista.insert(new Nodo<String>("Carlos"));
		
		//lista.print();
	}
	 public void printLista() {
	    
	    }

}
	//public void addContato(Contato pessoa){

	//lista.insert();
	
	//file.salvar(pessoa);
//}

