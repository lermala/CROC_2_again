package MusicSystem.devices;

import MusicSystem.carriers.Carrier;
import MusicSystem.carriers.Plate;

/**
 * Дочерний класс "Виниловая вертушка" - класса "Звуковоспроизводящее устройство"
 * Может воспроизводить музыку только с пластинки (Plate)
 */
public class VinylTurntable extends SoundReproducingDevices {

    public VinylTurntable(String name) {
        super(name);
    }

    /**
     * Функция для проверки типа носителя - здесь может быть только Пластинка
     * @return true - тип носителя может быть проигран (это Пластинка)
     *         false - тип носителя НЕ может быть проигран (это не Пластинка)
     */
    public String readCarrier(Carrier carrier){
        String resultOfReadingCarrier = "";
        if (carrier instanceof Plate){
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
        return "виниловая вертушка " + super.toString();
    }

}
