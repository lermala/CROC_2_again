import MusicSystem.carriers.CD;
import MusicSystem.carriers.Carrier;
import MusicSystem.Song;
import MusicSystem.carriers.FlashDrive;
import MusicSystem.carriers.Plate;
import MusicSystem.devices.CDplayer;
import MusicSystem.devices.SoundReproducingDevices;
import MusicSystem.devices.UniversalPlayer;
import MusicSystem.devices.VinylTurntable;

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

        // Создаем носители
        CD cd = new CD("СуперДиск 2000");
        Plate plate = new Plate("Лучшая пластинка");
        FlashDrive flashDrive = new FlashDrive("Флешка №1");

        // создаем список песен
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Исполнитель1", "НазваниеПесни1"));
        songs.add(new Song("Исполнитель2", "НазваниеПесни2"));

        // заполняем носители песнями
        cd.setSongs(songs);
        plate.setSongs(songs);
        flashDrive.setSongs(songs);

        // Создаем вопроизводящие устройства
        CDplayer cdPlayer = new CDplayer("Воспроизводитель дисков №1");
        VinylTurntable vinylTurntable = new VinylTurntable("ПластинкоПроигрыватель");
        UniversalPlayer universalPlayer = new UniversalPlayer("Универсальный плеер Universe");

        // пытаемся проиграть музыку:
        // сначала пытаемся проиграть музыку с диска для каждого носителя:
        System.out.println(cdPlayer.readCarrier(cd)); // все ок
        System.out.println(vinylTurntable.readCarrier(cd)); // ошибка
        System.out.println(universalPlayer.readCarrier(cd)); // все ок

        // пытаемся проиграть музыку с пластинки для каждого носителя:
        System.out.println(cdPlayer.readCarrier(plate)); // ошибка
        System.out.println(vinylTurntable.readCarrier(plate)); // все ок
        System.out.println(universalPlayer.readCarrier(plate)); // все ок

        // пытаемся проиграть музыку с флешки для каждого носителя:
        System.out.println(cdPlayer.readCarrier(flashDrive)); // ошибка
        System.out.println(vinylTurntable.readCarrier(flashDrive)); // ошибка
        System.out.println(universalPlayer.readCarrier(flashDrive)); // все ок


        // пытаемся проиграть носитель, который не имеет песен:
        FlashDrive flashDrive2 = new FlashDrive("Пустая флешка");
        System.out.println(universalPlayer.readCarrier(flashDrive2));



//        // Создаем пустой носитель без песен
//        Carrier carrier1 = new Carrier("СуперНоситель 2000", Carrier.TypeOfCarrier.record);
//
//        // Создаем вопроизводящее устройство
//        SoundReproducingDevices sd1 = new SoundReproducingDevices("Воспроизводитель №1",
//                                                                    SoundReproducingDevices.TypeOfDevice.vinylTurntable,
//                                                                    carrier1);
//
//        System.out.println(sd1.toString()); // // выводим информацию о носителе
//        System.out.println(sd1.playMusic()); // пытаемся воспроизвести музыку
//
//
//        // создаем список песен
//        ArrayList<Song> songs = new ArrayList<>();
//        songs.add(new Song("Исполнитель1", "НазваниеПесни1"));
//        songs.add(new Song("Исполнитель2", "НазваниеПесни2"));
//        songs.add(new Song("Исполнитель3", "НазваниеПесни3"));
//        songs.add(new Song("Исполнитель4", "НазваниеПесни4"));
//
//        // Создаем носитель с песенями
//        Carrier carrier2 = new Carrier("СуперНоситель 2000", Carrier.TypeOfCarrier.flashDrive, songs);
//
//        // Создаем вопроизводящее устройство
//        SoundReproducingDevices sd2 = new SoundReproducingDevices("Воспроизводитель №2",
//                                                                    SoundReproducingDevices.TypeOfDevice.universalPlayer,
//                                                                    carrier2);
//
//        System.out.println("\nСмотрим следующий проигрыватель:");
//        System.out.println(sd2.toString()); // // выводим информацию о носителе
//        System.out.println(sd2.playMusic()); // пытаемся воспроизвести музыку
    }
}
