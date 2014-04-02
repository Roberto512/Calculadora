/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Roberto
 */

public class Calculadora {
    public Integer comparar(String a, String b) {
		Integer resultado = null;
		Integer resultado2 = null;
		switch (a) {
		case "-":
		case "+":
			resultado = 0;
			break;
		case "/":
		case "*":
			resultado = 1;
			break;
		case "^":
			resultado = 2;
			break;
		case "C":
		case "S":
		case "T":
			resultado = 3;
			break;
		}

		switch (b) {
		case "-":
		case "+":
			resultado2 = 0;
			break;
		case "/":
		case "*":
			resultado2 = 1;
			break;
		case "^":
			resultado2 = 2;
			break;
		case "C":
		case "S":
		case "T":
			resultado2 = 3;
			break;
		}

		if (resultado >= resultado2) {
			return 0;
		} else {
			return 1;
		}

	}

	public Cola calcular(String a) {
		Cola c1 = new Cola();
		Pila p1 = new Pila();
		Pila p2 = new Pila();
		Pila auxi = new Pila();
		Pila aux2 = new Pila();
		Cola c2 = new Cola();
		boolean paren = false;
		for (int i = 0; i < a.length(); i++) {
			String conca = "";
			switch (a.charAt(i)) {
			case '(':
				paren = true;
				break;
			case ')':
				paren = false;

				while (!c2.isVacia()) {
					conca = conca + c2.pop();
				}

				if (conca != "") {
					c1.push(conca);
				}
				if (!p2.isVacia()) {
					c1.push(p2.pop());
				}
				break;
			case 'C':
				i = i + 3;
				aux2.Push("C");
				break;
			case 'S':
				i = i + 3;
				aux2.Push("S");
				break;
			case 'T':
				i = i + 3;
				aux2.Push("T");
				break;
			case '+':
			case '-':
			case '*':
			case '/':
			case '^':
				if (!paren) {
					while (!c2.isVacia()) {
						String co = c2.pop();
						conca = conca + co;
					}
					if (conca != "") {
						c1.push(conca);
					}
					if (!aux2.isVacia()) {
						String d = aux2.pop();
						p1.Push(d);
						auxi.Push(d);
					}
					if (p1.isVacia()) {
						p1.Push(a.charAt(i) + "");
						auxi.Push(a.charAt(i) + "");
					} else {// empieza else 1
						String a1 = auxi.pop();
						boolean bandera = false;
						while (!bandera) { // empieza while
							if (this.comparar(a1, a.charAt(i) + "") == 0) {
								if (auxi.getInicio() == null) {
									c1.push(a1);
									auxi.Push(a.charAt(i) + "");
									bandera = true;
								} else {

									c1.push(a1);
									a1 = auxi.pop();
								}

							} else {
								p1.Push(a1);
								p1.Push(a.charAt(i) + "");
								auxi.Push(a1);
								auxi.Push(a.charAt(i) + "");
								bandera = true;
							}

						} // termina while
					}// termina else 1
				} else {

					while (!c2.isVacia()) {
						String co = c2.pop();
						conca = conca + co;
					}

					if (conca != "") {
						c1.push(conca);
					}

					if (p2.isVacia()) {
						p2.Push(a.charAt(i) + "");
					} else {
						String dat = p2.pop();
						if (this.comparar(dat, a.charAt(i) + "") == 0) {
							c1.push(dat);
							p2.Push(a.charAt(i) + "");
						} else {
							p2.Push(dat);
							p2.Push(a.charAt(i) + "");
						}
					}
				}
				break;
			case '.':
				c2.push(a.charAt(i) + "");
				break;
			default:
				c2.push(a.charAt(i) + "");
				break;
			}
		}// termina el while

		String conc2 = "";
		Boolean bandera = false;
		while (!c2.isVacia()) {
			conc2 += c2.pop();
			bandera = true;
		}

		if (bandera) {
			c1.push(conc2);
		}

		
		if(!aux2.isVacia()){ c1.push(aux2.pop()); }

		while (!auxi.isVacia()) {
			c1.push(auxi.pop());
		}

		return c1;
	}

	public String operacion(Cola a) {
		Float aux = null, aux1 = (float) 0;
		Pila p1 = new Pila();
		Float seg = null;
		Float pri = null;
		while (a.getFin() != a.getInicio()) {
			String a1 = a.pop();
			switch (a1) {
			case "+":
				aux1 = p1.popF() + p1.popF();
				System.out.println(aux1);
				p1.Push(aux1);
				break;
			case "-":
				seg = p1.popF();
				pri = (float) 0;
				if (p1.isVacia()) {
					aux1 = pri - seg;
					p1.Push(aux1);
				} else {
					pri = p1.popF();
					aux1 = pri - seg;
					p1.Push(aux1);
				}

				break;
			case "*":
				seg = p1.popF();
				pri = p1.popF();
				aux1 = seg * pri;
				p1.Push(aux1);
				break;
			case "/":
				seg = p1.popF();
				pri = p1.popF();
				aux1 = pri / seg;
				p1.Push(aux1);
				break;
			case "^":
				seg = p1.popF();
				pri = p1.popF();
				aux1 = (float) Math.pow(pri, seg);
				p1.Push(aux1);
				break;
			case "T":
				pri=p1.popF();
				aux1=(float) Math.tan(pri);
				p1.Push(aux1);
				break;
			case "S":
				aux1=p1.popF();
				aux1=(float) Math.sin(aux1);
				p1.Push(aux1);
				break;
			case "C":
				aux1=p1.popF();
				aux1=(float) Math.cos(aux1);
				p1.Push(aux1);
				break;
			default:
				aux = aux.parseFloat(a1);
				p1.Push(aux);
				break;
			}
		}

		if (!a.isVacia()) {
			String a1 = a.pop();
			if ((a1 == "C")||(a1=="T")||(a1=="S")) {
				pri = p1.popF();
				switch(a1){
					case "C":
						aux1 = (float) Math.cos(pri);
						break;
					case "T":
						aux1 = (float) Math.tan(pri);
						break;
					case "S":
						aux1 = (float) Math.sin(pri);
						break;
				}
			} else {
				seg = p1.popF();
				pri = p1.popF();
				switch (a1.charAt(0)) {
				case '+':
					aux1 = pri + seg;
					break;
				case '-':
					aux1 = pri - seg;
					break;
				case '/':
					aux1 = pri / seg;
					break;
				case '*':
					aux1 = pri * seg;
					break;
				case '^':
					aux1 = (float) Math.pow(pri, seg);
					break;
				}
			}

		}
		String resul = aux1 + "";
		return resul;
	}

    
}
