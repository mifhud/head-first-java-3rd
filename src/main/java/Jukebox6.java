import java.util.*;
public class Jukebox6 {
    ArrayList<SongV3> songList = new ArrayList<SongV3>();
    MockSongV3File mockFile = new MockSongV3File();

    public static void main(String[] args) {
        new Jukebox6().go();
    }

    public void go() {
        songList = mockFile.getSongsV3();
        System.out.println(songList);
        songList.sort((one, two) -> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);
    }
}
