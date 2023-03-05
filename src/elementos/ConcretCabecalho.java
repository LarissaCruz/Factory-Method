package elementos;

import interfaces.Cabecalho;

public class ConcretCabecalho implements Cabecalho {
	String titulo;
	String empresa;
	
	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		
		return titulo;
	}

	@Override
	public String getEmpresa() {
		// TODO Auto-generated method stub
		return empresa;
	}

	@Override
	public void setEmpresa(String empresa) {
		// TODO Auto-generated method stub
		this.empresa = empresa;
	}

	@Override
	public void setTitulo(String titulo) {
		// TODO Auto-generated method stub
		this.titulo = titulo;
	}

}
