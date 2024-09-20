import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){

        for (Song song : songs){
            if (song.getTitle().equals(title)){
                return false;

            }

        }
        songs.add(new Song(title, duration));
        return true;
    }

    private Song findSong(String title){

        for (Song song : songs){
            if (song.getTitle().equals(title)){
                return song;

            }

        }
        return null;

    }

    public boolean addToPlayList(int track, LinkedList<Song> list){

        if (track >= 1) {
            list.add(songs.get(track - 1));
            return true;
        }
        return false;


    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {

        Song song = findSong(title);

        if (song == null) {

            return false;
        }
        playlist.add(song);

        return true;
    }
}
