package elementos;
import java.util.Date;

import interfaces.Rodape;

public class ConcretRodape implements Rodape{
	Date data;

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
