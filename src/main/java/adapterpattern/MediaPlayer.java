package adapterpattern;

public interface MediaPlayer {
    /**
    *    播放视频
    * @param audioType 播放类型
     * @param fileName 文件名字
     */
   void  play(String audioType,String fileName);
}
