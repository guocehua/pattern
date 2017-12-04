package adapterpattern;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
           System.out.println("playing mp3");
        } else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc")){
            new PlayerAdater(audioType).play(audioType, fileName);
        }else{
            System.out.println("unsupported");
        }

    }
}
