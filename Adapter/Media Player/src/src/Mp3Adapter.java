package src;
import Interfaces.ReprodutorMidia;
import Entities.ReprodutorMp3;

public class Mp3Adapter extends ReprodutorMp3 implements ReprodutorMidia {

	@Override
	public void reproduzir(String nomeArquivo) {
		playMp3(nomeArquivo);
	}

}
