package MusicSystem;

import java.util.ArrayList;

/**
 * Класс - носитель музыкальных композиций (пластинка, сд, флешка и т.д)
 * Содержит название носителя, тип носителя и список песен на носителе (если есть).
 */
public class Carrier {

    private String name; // название носителя

    public enum TypeOfCarrier {record, microSD, flashDrive, diskette, CD};
    private TypeOfCarrier typeOfCarrier; // тип носителя

    private ArrayList<Song> songs = new ArrayList<>(); // песни, которые есть на этом носителе

    public Carrier(String name, TypeOfCarrier typeOfCarrier, ArrayList<Song> songs) {
        this.name = name;
        this.typeOfCarrier = typeOfCarrier;
        this.songs = songs;
    }

    public Carrier(String name, TypeOfCarrier typeOfCarrier) {
        this.name = name;
        this.typeOfCarrier = typeOfCarrier;
    }

    @Override
    public String toString() {
        // переводим тип носителя в строковое значение
        String typeString = "";
        switch (this.typeOfCarrier)
        {
            case record:
                typeString = "пластинка";
                break;
            case microSD:
                typeString = "microSD";
                break;
            case flashDrive:
                typeString = "флешка";
                break;
            case diskette:
                typeString = "дискета";
                break;
            case CD:
                typeString = "CD диск";
                break;
        }

        // переводим песни в строку
        String songsString = "";
        for (Song s:
                songs) {
            songsString += "\n";
            songsString += s.toString();
        }

        return "название=" + name +
                ", тип=" + typeString +
                ", песни:" + songsString;
    }

    public String getName() {
        return name;
    }

    public TypeOfCarrier getTypeOfCarrier() {
        return typeOfCarrier;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOfCarrier(TypeOfCarrier typeOfCarrier) {
        this.typeOfCarrier = typeOfCarrier;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
}
