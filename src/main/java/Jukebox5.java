import java.util.*;
public class Jukebox5 {
    ArrayList<SongV3> songList = new ArrayList<SongV3>();
    MockSongV2File mockFile = new MockSongV2File();

    public static void main(String[] args) {
        new Jukebox5().go();
    }
    // TODO: why doesn't this use songlist.sort?
    public void go() {
        songList = mockFile.getSongsV3();
        System.out.println(songList);
        TitleCompare  titleCompare = new TitleCompare();
        ArtistCompare artistCompare = new ArtistCompare();

        Collections.sort(songList, titleCompare);
        System.out.println(songList);

        Collections.sort(songList, artistCompare);
        System.out.println(songList);
    }

    class TitleCompare implements Comparator<SongV3> {
        public int compare(SongV3 one, SongV3 two) {
            return one.getTitle().compareTo(two.getTitle());
        }
    }
    class ArtistCompare implements Comparator<SongV3> {
        public int compare(SongV3 one, SongV3 two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }
}
