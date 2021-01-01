package Music;

public class Test {

    public static void main(String[] args) {
        Music music = new RockMusic(); // нужно избежать
        System.out.println(music.getSong());

        MusicPlayer musicPlayer = new MusicPlayer(music); // и этого
        musicPlayer.playMusic();

    }

}
