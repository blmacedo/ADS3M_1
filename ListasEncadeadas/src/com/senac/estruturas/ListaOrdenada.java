package com.senac.estruturas;

public class ListaOrdenada<T extends Comparable<T>> extends ListaEncadeada<T> {

	private Nodo<T> findBefore(Nodo<T> novo) {
		Nodo<T> atual = getHead();
		Nodo<T> anterior = null;
		
		while (atual != null) {
			int comp = atual.compareTo(novo);
			if (comp < 0) {
				anterior = atual;
				atual = atual.getNext();
			}
			if (comp == 0)
				return atual;
			if (comp > 0)
				return anterior;
		}
		
		return anterior;
	}
	
	@Override
	public void insert(Nodo<T> novo)
	{
		Nodo<T> anterior = findBefore(novo);
		if (anterior == null) {
			super.insert(novo);
		} else {
			super.insert(novo, anterior);
		}
	}


	@Override
	public void insert(Nodo<T> novo, Nodo<T> anterior)
	{
		insert(novo);
	}
	
	@Override
	public void append(Nodo<T> novo)
	{
		insert(novo);
	}
	
	
	public static void main(String[] args) {
		ListaOrdenada<String> lista = new ListaOrdenada<String>();
		
		lista.insert(new Nodo<String>("Rafael", "123456"));
		lista.insert(new Nodo<String>("Tiago", "123456"), lista.getHead());
		lista.append(new Nodo<String>("Mauro", "123456"));
		lista.insert(new Nodo<String>("Carlos", "123456"));
		lista.insert(new Nodo<String>("Raffael", "123456"));
		lista.insert(new Nodo<String>("Rafael", "123456"));
		lista.insert(new Nodo<String>("Raphael", "123456"));
		
		lista.print();
	}

}
