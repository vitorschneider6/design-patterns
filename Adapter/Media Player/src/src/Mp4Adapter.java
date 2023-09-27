package src;
import Interfaces.ReprodutorMidia;
import Entities.ReprodutorMp4;
public class Mp4Adapter extends ReprodutorMp4 implements ReprodutorMidia{

	@Override
	public void reproduzir(String nomeArquivo) {
		playMp4(nomeArquivo);
	}

}
