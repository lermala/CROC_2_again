package MusicSystem.devices;

import MusicSystem.carriers.CD;
import MusicSystem.carriers.Carrier;

/**
 * Дочерний класс "CD-проигрыватель" - класса "Звуковоспроизводящее устройство"
 * Может воспроизводитель музыку только с носителя CD-диск
 */
public class CDplayer extends SoundReproducingDevices {

    public CDplayer(String name) {
        super(name);
    }

    /**
     * Функция для проверки типа носителя - здесь может быть только CD-диск.
     * @return true - тип носителя может быть проигран (это CD)
     *         false - тип носителя НЕ может быть проигран (это не CD)
     */
    public String readCarrier(Carrier carrier){
        String resultOfReadingCarrier = "";

        // смотрим тип носителя
        if (carrier instanceof CD){
            super.carrier = carrier; // носитель можно считать. далее можно будет его проиграть.
            resultOfReadingCarrier = super.playMusic(); // проигрываем музыку с устройства
        } else {
            resultOfReadingCarrier = "\nПроигрыватель \"" + name +
                    "\" не может считать музыку с устройства \"" + carrier.getName() + '\"';
        }

        return resultOfReadingCarrier;
    }

    @Override
    public String toString() {
        return "CD-проигрываиель " + super.toString();
    }
}
