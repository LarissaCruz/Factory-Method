package elementos;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.Rodape;

public class HTML implements Documento {
	Cabecalho cabecalho ;
	Corpo corpo;
	Rodape rodape;
	
	public HTML(Cabecalho cabecalho, Corpo corpo, Rodape Rodape) {
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
		return "<p>" + corpo.getTexto() + "</p>";
		
	}
	@Override
	public String getCabecalho() {
		return "<html><head><title>" + cabecalho.getTitulo() + "</title></head><body>\n" +
				"<h1>" + cabecalho.getTitulo() + "</h1>\n" +
				"<h2>" + cabecalho.getEmpresa() + "</h2>\n";
	}
	@Override
	public String getRodape() {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return "<hr/>" + df.format(rodape.getData()) +
				"</body></html>\n";
		
	}
	
	
}
