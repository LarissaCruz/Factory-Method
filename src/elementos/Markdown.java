package elementos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.Rodape;

public class Markdown implements Documento{
	Cabecalho cabecalho ;
	Corpo corpo;
	Rodape rodape;
	
	public Markdown(Cabecalho cabecalho, Corpo corpo, Rodape Rodape) {
		this.cabecalho = cabecalho;
		this.corpo = corpo;
		this.rodape = Rodape;
	}
	
	@Override
	public String getDocumento() {
		return getCabecalho()+"\n"+getCorpo()+"\n"+getRodape(); 
		
	}
	@Override
	public String getCorpo() {
		return corpo.getTexto() + "\n\n";
		
	}
	@Override
	public String getCabecalho() {
		
		return "# " + cabecalho.getTitulo() + "\n\n" +
		"## " + cabecalho.getEmpresa() + "\n\n";
	}
	@Override
	public String getRodape() {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return "------------------------------\n\n" + df.format(rodape.getData()) + "\n";
	}
}
