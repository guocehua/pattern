package adapterpattern;

public class VlcPlayer implements AdvancePlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing by vlc");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
