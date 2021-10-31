package MusicSystem.carriers;

import MusicSystem.Song;

import java.util.ArrayList;

/**
 * Класс - носитель музыкальных композиций (пластинка, сд, флешка и т.д)
 * Содержит название носителя, тип носителя и список песен на носителе (если есть).
 */
public abstract class Carrier {

    protected String name; // название носителя

    private ArrayList<Song> songs = new ArrayList<>(); // песни, которые есть на этом носителе

    public Carrier(String name) {
        this.name = name;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    @Override
    public String toString() {
        // переводим песни в строку
        String songsString = "";
        for (Song s:
                songs) {
            songsString += "\n";
            songsString += s.toString();
        }

        return "название=" + name +
                ", песни:" + songsString;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public String getName() {
        return name;
    }

}
