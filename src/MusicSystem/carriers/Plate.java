package MusicSystem.carriers;

/**
 * Дочерний класс ПЛАСТИНКА класса-носителя Carrier
 */
public class Plate extends Carrier{
    public Plate(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Пластинка" + super.toString();
    }
}
