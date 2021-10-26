package MusicSystem;

import java.util.ArrayList;

/**
 * Класс - Звуковоспроизводящее устройство
 * 
 * существуют несколько звуковоспроизводящих устройств (виниловая вертушка, сд, универсальный плеер и т.д.)
 *  Звуковоспроизводящее устройство должно выводить в консоль информацию о том, что за устройство воспроизводит песню,
 *  ее исполнителя и название.
 *  В случае, если устройство не может воспроизвести музыку с требуемого носителя выводить соответствующее сообщение
 */
public class SoundReproducingDevices {

    private String name; // название звуковоспроизводящего устройства

    public enum TypeOfDevice {vinylTurntable, universalPlayer, CD};
    private TypeOfDevice typeOfDevice; // тип звуковоспроизводящего устройства (виниловая вертушка, сд, универсальный плеер и т.д.)

    private Carrier carrier; // носитель музыкальных композиций

    public SoundReproducingDevices(String name, TypeOfDevice typeOfDevice, Carrier carrier) {
        this.name = name;
        this.typeOfDevice = typeOfDevice;
        this.carrier = carrier;
    }

    @Override
    public String toString() {
        // переводим тип устройства в строковое значение
        String typeString = "";
        switch (this.typeOfDevice)
        {
            case vinylTurntable:
                typeString = "виниловая вертушка";
                break;
            case universalPlayer:
                typeString = "универсальный плеер";
                break;
            case CD:
                typeString = "сд";
                break;
        }

        return  name +
                ", тип устройства=" + typeString +
                ", носитель={" + carrier +
                '}';
    }

    /**
     * Функция воспроизводит музыку, которая имеется на текущем устройстве.
     * @return если песен нет, то выводится "Ошибка. Устройство не может воспроизвести музыку."
     *         если песни есть, то они выводятся по порядку.
     */
    public String playMusic(){
        ArrayList<Song> songs = carrier.getSongs(); // все песни, которые есть на носителе

        String songsString = ""; // строка, которая содержит результат воспроизвдения

        // проверяем, есть ли песни на устройстве. Если нет, то выводм сообщение об ошибке.
        // Если есть, то выводим список песен
        if (songs.size() == 0){
            songsString = "Ошибка. Устройство не может воспроизвести музыку.";
        } else {
            // каждую песню добавляем в строку
            songsString += "\nВоспроизводим:";
            for (Song s:
                    songs) {
                songsString += "\nСледующая песня: ";
                songsString += s.toString();
            }
        }

        return songsString;
    }
}
