/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Roberto
 */
public class Cola {
    private NodoDoble inicio;
	private NodoDoble fin;
	
	public NodoDoble getInicio() {
		return inicio;
	}

	public void setInicio(NodoDoble inicio) {
		this.inicio = inicio;
	}

	public NodoDoble getFin() {
		return fin;
	}

	public void setFin(NodoDoble fin) {
		this.fin = fin;
	}

	public Cola(){
		inicio=null;
		fin=null;
	}
	
	public void push(String d){
		NodoDoble nuevo=new NodoDoble(d);
		if(inicio==null){
			inicio=nuevo;
			fin=nuevo;
		}else{
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			inicio=nuevo;
		}
	}
	
	public String pop(){
		if(inicio!=fin){
			NodoDoble aux=fin;
			fin=fin.getAnterior();
			fin.setSiguiente(null);
			aux.setAnterior(null);
			String resultado=aux.getDato();
			aux=null;
			return resultado;
		}else{
			String resultado=inicio.getDato();
			inicio=null;
			fin=null;
			return resultado;
		}
	}
	
	public boolean isVacia(){
		return inicio==null;
	}
	
	public void recorrer(){
		NodoDoble aux=fin;
		while(aux!=null){
			System.out.print(aux.getDato()+" ");
			aux=aux.getAnterior();
		}
	}
	
    
}
