/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Roberto
 */
public class Nodo {
    private String dato;
	private Float dato1;
	private Nodo siguiente;
	
	public Float getDato1() {
		return dato1;
	}
	public void setDato1(Float dato1) {
		this.dato1 = dato1;
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	public Nodo(String d){
		dato=d;
		siguiente=null;
	}
	
	public Nodo(Float d){
		dato1=d;
		siguiente=null;
	}

    
}

