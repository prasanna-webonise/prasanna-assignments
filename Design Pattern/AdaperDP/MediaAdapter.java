/**
 * 
 */
package AdaperDP;

/**
 * @author webonise
 *
 */
public class MediaAdapter implements MediaplayerImpl {

	/* (non-Javadoc)
	 * @see AdaperDP.MediaplayerImpl#name(java.lang.String, java.lang.String)
	 */

	AdvanceMediaPlayerImpl advancePlayer;
	public MediaAdapter(String audioType){
		if(audioType.equals("vlc")){
			advancePlayer= new VLCPlayer();
		}
		else if (audioType.equals("mp4")) {
			advancePlayer= new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		System.out.println("In MediaAdapter");
		
		if(audioType.equals("vlc")){
			advancePlayer.playVlc(fileName);
		}
		else if (audioType.equals("mp4")) {
			advancePlayer.playMp4(fileName);
		}
		
	}
	

}
