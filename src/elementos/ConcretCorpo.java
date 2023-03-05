package elementos;

import interfaces.Corpo;

public class ConcretCorpo implements Corpo  {
	String texto;
	String empresa;
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
}
