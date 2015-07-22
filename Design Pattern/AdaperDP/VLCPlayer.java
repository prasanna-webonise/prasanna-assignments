package AdaperDP;


public class VLCPlayer implements AdvanceMediaPlayerImpl {


	@Override
	public void playVlc(String fileName) {
		System.out.println("playing file VLC : "+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		//nothing to play
	}


}
