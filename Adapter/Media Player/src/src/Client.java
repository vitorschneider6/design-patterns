package src;
import Interfaces.ReprodutorMidia;

public class Client {

	public static void main(String[] args) {
		ReprodutorMidia mp3 = new Mp3Adapter();
		ReprodutorMidia mp4 = new Mp4Adapter();
		
		mp3.reproduzir("Teste");
		mp4.reproduzir("Teste2");
	}

}
