package adapterpattern;

public class PlayerAdater implements MediaPlayer {

    private AdvancePlayer advancePlayer;

    public PlayerAdater(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancePlayer=new VlcPlayer();
        }
        if(audioType.equalsIgnoreCase("mp4")){
            advancePlayer=new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
     if(audioType.equalsIgnoreCase("vlc")){
         advancePlayer.playVlc(fileName);
     }
     if(audioType.equalsIgnoreCase("mp4")){
         advancePlayer.playMp4(fileName);
     }
    }
}
