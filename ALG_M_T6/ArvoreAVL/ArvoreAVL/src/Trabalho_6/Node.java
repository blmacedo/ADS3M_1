package Trabalho_6;


public class Node {

	public int info;//atributo que guarda a informação do no
	public Node dir;//atributo que aponta para o no esquerdo
	public Node esq;//atributo que aponta para o no direito
	public Node pai;//atributo que aponta para o pai do no
	public int balanco; //atributo utilizado apenas na arvore avl. 
						// balanco = altura(arvore a esq) - altura(arvore a dir)
	

	public Node(int x){
		this.info = x;
		this.dir = null;
		this.esq = null;
		this.pai = null;
		this.balanco = 0;
	}

	public Node(){}

	public Node(int x,Node esq,Node dir){
		this.info = x;
		this.dir = dir;
		this.esq = esq;
		this.pai = null;
		this.dir.pai = this;
		this.esq.pai =this;

	}

	//Metodo que retorna o elemento
	public Node elemento(){
		return this;	
	}
}
