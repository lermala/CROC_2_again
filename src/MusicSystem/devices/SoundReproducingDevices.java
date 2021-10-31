package MusicSystem.devices;

import MusicSystem.Song;
import MusicSystem.carriers.Carrier;

import java.util.ArrayList;

/**
 * Класс - Звуковоспроизводящее устройство
 *
 * существуют несколько звуковоспроизводящих устройств (виниловая вертушка, сд, универсальный плеер и т.д.)
 *  Звуковоспроизводящее устройство должно выводить в консоль информацию о том, что за устройство воспроизводит песню,
 *  ее исполнителя и название.
 *  В случае, если устройство не может воспроизвести музыку с требуемого носителя выводить соответствующее сообщение
 */
public abstract class SoundReproducingDevices {

    protected String name; // название звуковоспроизводящего устройства

    protected Carrier carrier; // носитель музыкальных композиций

    public SoundReproducingDevices(String name) { // создаем проигрыватель без носителя. Затем вставляем носитель.
        this.name = name;
    }

    /**
     * Функция для проверки типа носителя - подходит ли носитель этому проигрывателю.
     * @return true - тип носителя может быть проигран
     *         false - тип носителя НЕ может быть проигран
     */
    public abstract String readCarrier(Carrier carrier) ;

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    /**
     * Функция воспроизводит музыку, которая имеется на текущем устройстве.
     * @return если песен нет, то выводится "Ошибка. Устройство не может воспроизвести музыку."
     *         если песни есть, то они выводятся по порядку.
     */
    protected String playMusic(){
        ArrayList<Song> songs = carrier.getSongs(); // все песни, которые есть на носителе

        String songsString = ""; // строка, которая содержит результат воспроизвдения

        // проверяем, есть ли песни на устройстве. Если нет, то выводм сообщение об ошибке.
        // Если есть, то выводим список песен
        if (songs.size() == 0){
            songsString = "\nНевозможно произвести музыку. Устройство \"" +
                    carrier.getName() + "\" не имеет песен.";
        } else {
            // каждую песню добавляем в строку
            songsString += '\n' + name + ": воспроизводим музыку с устройства \"" +
                    carrier.getName() + '\"';
            for (Song s:
                    songs) {
                songsString += "\nСледующая песня: ";
                songsString += s.toString();
            }
        }

        return songsString;
    }

    @Override
    public String toString() {
        return "SoundReproducingDevices{" +
                "carrier=" + carrier +
                '}';
    }
}
