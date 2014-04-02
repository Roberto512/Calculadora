/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Roberto
 */
public class Pila {
    private Nodo inicio;
	
	public Pila(){
		inicio=null;
	}
	
	public Nodo getInicio() {
		return inicio;
	}



	public void setInicio(Nodo inicio) {
		this.inicio = inicio;
	}



	public void Push(String d){
		Nodo nuevo=new Nodo(d);
		if(inicio==null){
			inicio=nuevo;
		}else{
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
	}
	
	public void Push(Float d){
		Nodo nuevo=new Nodo(d);
		if(inicio==null){
			inicio=nuevo;
		}else{
			nuevo.setSiguiente(inicio);
			inicio=nuevo;
		}
	}
	
	public String pop(){
			Nodo aux=inicio;
			inicio=inicio.getSiguiente();
			aux.setSiguiente(null);
			String resultado=aux.getDato();
			aux=null;
			return resultado;
	}
	
	public Float popF(){
		Nodo aux=inicio;
		inicio=inicio.getSiguiente();
		aux.setSiguiente(null);
		Float resultado=aux.getDato1();
		aux=null;
		return resultado;
	}
	
	
	public boolean isVacia(){
		return inicio==null;
	}
	
	public void recorrer(){
		Nodo aux=inicio;
		while(aux!=null){
			System.out.print(aux.getDato()+" ");
			aux=aux.getSiguiente();
		}
	}
	
	public void recorrerF(){
		Nodo aux=inicio;
		while(aux!=null){
			System.out.print(aux.getDato1()+" ");
			aux=aux.getSiguiente();
		}
	}

    
}
