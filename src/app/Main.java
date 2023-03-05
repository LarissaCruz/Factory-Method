package app;

import java.util.Date;

import elementos.ConcretCabecalho;
import elementos.ConcretCorpo;
import elementos.ConcretRodape;
import fabrica.FabricaDocumentoHTML;
import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.FabricaDocumento;
import interfaces.Rodape;

public class Main {
	public static void main(String[] args) {
		Cabecalho cabecalhoHTML =  new ConcretCabecalho();
		Corpo corpoHTML = new ConcretCorpo();
		Rodape rodapeHTML =  new ConcretRodape();
		
		cabecalhoHTML.setTitulo(null);
		cabecalhoHTML.setEmpresa(null);
		corpoHTML.setTexto("Digite o que está pensando");
		rodapeHTML.setData(new Date());
		
		FabricaDocumento fabricaHTML = new FabricaDocumentoHTML() ;
		
		Documento HTML= fabricaHTML.CriarDocumento(cabecalhoHTML,corpoHTML, rodapeHTML );
		
		System.out.println(HTML.getDocumento());
		
	}
}
