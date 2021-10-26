package MusicSystem;

/**
 * Класс - песня.
 * есть имя исполнителя (группы) и название
 */
public class Song {

    private String singer; // имя исполнителя (группы)
    private String nameOfSong; // название

    public Song(String singer, String nameOfSong) {
        this.singer = singer;
        this.nameOfSong = nameOfSong;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    @Override
    public String toString() {
        return "MusicSystem.Song{" +
                "singer='" + singer + '\'' +
                ", nameOfSong='" + nameOfSong + '\'' +
                '}';
    }


}
