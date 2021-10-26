import MusicSystem.Carrier;
import MusicSystem.Song;
import MusicSystem.SoundReproducingDevices;

import java.util.ArrayList;

/**
 *  Необходимо разработать музыкальную систему.
 *  существуют несколько звуковоспроизводящих устройств (виниловая вертушка, сд, универсальный плеер и т.д.)
 *  существует несколько носителей музыкальных композиций (пластинка, сд, флешка и т.д)
 *  существуют несколько песен, у которых есть имя исполнителя (группы) и название
 *  Звуковоспроизводящее устройство должно выводить в консоль информацию о том, что за устройство воспроизводит песню,
 *  ее исполнителя и название.
 *  В случае, если устройство не может воспроизвести музыку с требуемого носителя выводить соответствующее сообщение
 */
public class Main {

    public static void main(String[] args) {

        // Создаем пустой носитель без песен
        Carrier carrier1 = new Carrier("СуперНоситель 2000", Carrier.TypeOfCarrier.record);

        // Создаем вопроизводящее устройство
        SoundReproducingDevices sd1 = new SoundReproducingDevices("Воспроизводитель №1",
                                                                    SoundReproducingDevices.TypeOfDevice.vinylTurntable,
                                                                    carrier1);

        System.out.println(sd1.toString()); // // выводим информацию о носителе
        System.out.println(sd1.playMusic()); // пытаемся воспроизвести музыку


        // создаем список песен
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Исполнитель1", "НазваниеПесни1"));
        songs.add(new Song("Исполнитель2", "НазваниеПесни2"));
        songs.add(new Song("Исполнитель3", "НазваниеПесни3"));
        songs.add(new Song("Исполнитель4", "НазваниеПесни4"));

        // Создаем носитель с песенями
        Carrier carrier2 = new Carrier("СуперНоситель 2000", Carrier.TypeOfCarrier.flashDrive, songs);

        // Создаем вопроизводящее устройство
        SoundReproducingDevices sd2 = new SoundReproducingDevices("Воспроизводитель №2",
                                                                    SoundReproducingDevices.TypeOfDevice.universalPlayer,
                                                                    carrier2);

        System.out.println("\nСмотрим следующий проигрыватель:");
        System.out.println(sd2.toString()); // // выводим информацию о носителе
        System.out.println(sd2.playMusic()); // пытаемся воспроизвести музыку
    }
}
