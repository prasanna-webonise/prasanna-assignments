/**
 * 
 */
package AdaperDP;

/**
 * @author webonise
 *
 */
public class AudioPlayer implements MediaplayerImpl {

	/* (non-Javadoc)
	 * @see AdaperDP.MediaplayerImpl#play(java.lang.String, java.lang.String)
	 */
	
	MediaplayerImpl mediaAdapter; 
	
	@Override
	public void play(String audioType, String fileName) {
		 if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: " + fileName);			
	      } 
	      
	      else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      
	      else{
	         System.out.println("Invalid media. " + audioType + " format not supported");
	      }
	}

}
