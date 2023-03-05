package fabrica;

import elementos.Markdown;
import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.FabricaDocumento;
import interfaces.Rodape;

public class FabricaDocumentoMarkdown implements FabricaDocumento{

	@Override
	public Documento CriarDocumento(  Cabecalho cabecalho, Corpo corpo, Rodape rodape) {
		// TODO Auto-generated method stub
		return new Markdown(cabecalho, corpo, rodape);
	}

}
