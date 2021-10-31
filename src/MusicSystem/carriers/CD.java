package MusicSystem.carriers;

/**
 * Дочерний класс CD класса-носителя Carrier
 */
public class CD extends Carrier{

    public CD(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "CD-диск " + super.toString();
    }
}
