import java.io.*;
import sun.audio.*;

public class MoerseSoundplayer {

    public static void main(String[] args) 
    throws Exception
    {
      // open the sound file as a Java input stream
      String gongFile = "/Users/al/DevDaily/Projects/MeditationApp/resources/gong.au";
      InputStream in = new FileInputStream(gongFile);
  
      // create an audiostream from the inputstream
      AudioStream audioStream = new AudioStream(in);
  
      // play the audio clip with the audioplayer class
      AudioPlayer.player.start(audioStream);
    }
    
}
