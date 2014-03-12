package com.senac.estruturas;

public class Nodo<T extends Comparable<T>> implements Comparable<Nodo<T>> {

	private T chave;
	private T numero;
	private Nodo<T> next;
	
	public Nodo()
	{
		this.chave = null;
		this.numero = null;
		this.next = null;
	}
	
	public Nodo(T valor, T valor1)
	{
		
		this.chave = valor;
		this.numero = valor1;
		this.next = null;
	}
	
	public T getData()
	{
		return chave;
	}
	
 	private void setData(T chave)
 
	{
		this.chave = chave;
	}
 	
	public T getNumero()
	{
		return numero;
	}
	
 	private void setNumero(T numero)
 
	{
		this.numero = numero;
	}

	
	public Nodo<T> getNext()
	{
		return next;
	}
	
	public void setNext(Nodo<T> next)
	{
		this.next = next;
	}

	@Override
	public int compareTo(Nodo<T> nodo) {
		return chave.compareTo(nodo.getData());
	}

}
