package fabrica;

import interfaces.Cabecalho;
import interfaces.Corpo;
import interfaces.Documento;
import interfaces.FabricaDocumento;
import interfaces.Rodape;
import elementos.HTML;

public class FabricaDocumentoHTML implements FabricaDocumento {
	
	@Override
	public Documento CriarDocumento(Cabecalho cabecalho, Corpo corpo, Rodape rodape) {
		// TODO Auto-generated method stub
		return new HTML(cabecalho, corpo, rodape);
	}
}
