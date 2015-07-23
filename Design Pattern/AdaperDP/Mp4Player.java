/**
 * 
 */
package AdaperDP;

/**
 * @author webonise
 *
 */
public class Mp4Player implements AdvanceMediaPlayerImpl {

	@Override
	public void playVlc(String fileName) {
		//nothing to paly
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("playing MP$ file : "+fileName);
	}

}
