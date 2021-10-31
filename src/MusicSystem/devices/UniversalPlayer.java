package MusicSystem.devices;

import MusicSystem.carriers.CD;
import MusicSystem.carriers.Carrier;
import MusicSystem.carriers.FlashDrive;
import MusicSystem.carriers.Plate;

/**
 * Дочерний класс "Универсальный проигрыватель" - класса "Звуковоспроизводящее устройство"
 * Может воспроизводитель музыку с любого носителя (флешка, сд, пластинка).
 */
public class UniversalPlayer extends SoundReproducingDevices{

    public UniversalPlayer(String name) {
        super(name);
    }

    /**
     * Функция для проверки типа носителя - здесь может быть только CD-диск.
     * @return true - тип носителя может быть проигран (это CD)
     *         false - тип носителя НЕ может быть проигран (это не CD)
     */
    public String readCarrier(Carrier carrier){
        String resultOfReadingCarrier = "";
        if ( (carrier instanceof CD ) || (carrier instanceof FlashDrive) || (carrier instanceof Plate) ){
            super.carrier = carrier; // носитель можно считать. далее можно будет его проиграть.
            resultOfReadingCarrier = super.playMusic(); // проигрываем музыку с устройства
        } else {
            resultOfReadingCarrier = "\nПроигрыватель \"" + name +
                    "\" не может считать музыку с устройства " + carrier.getName() + '\"';
        }

        return resultOfReadingCarrier;
    }

    @Override
    public String toString() {
        return "Универсальный плеер " + super.toString();
    }
}
