import java.util.ArrayList;

public class Playlist {

    public static void main(String[] args) {
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
        desertIslandPlaylist.add("Song A");
        desertIslandPlaylist.add("Song B");
        desertIslandPlaylist.add("Song C");
        desertIslandPlaylist.add("Song D");
        desertIslandPlaylist.add("Song F");
        desertIslandPlaylist.add("Song G");
        desertIslandPlaylist.add("Song H");

        System.out.println(desertIslandPlaylist.toString());

        System.out.println(desertIslandPlaylist.size());

        desertIslandPlaylist.remove(0);
        desertIslandPlaylist.remove(0);

        System.out.println(desertIslandPlaylist.size());
        System.out.println(desertIslandPlaylist);

        int songCIndex = desertIslandPlaylist.indexOf("Song C");
        String oneSong = desertIslandPlaylist.get(songCIndex);


        int songHIndex = desertIslandPlaylist.indexOf("Song H");

        desertIslandPlaylist.set(songCIndex, desertIslandPlaylist.get(songHIndex));
        desertIslandPlaylist.set(songHIndex, oneSong);
        ;

        System.out.println(desertIslandPlaylist.toString());
    }

}