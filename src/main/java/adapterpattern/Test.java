package adapterpattern;

public class Test {
    public static void main(String[] args) {
        AudioPlayer audioPlayer =new AudioPlayer();
        audioPlayer.play("mp3","youyou");
        audioPlayer.play("mp4","ff");
        audioPlayer.play("vlc","fd");
    }
}
