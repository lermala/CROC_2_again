package MusicSystem.carriers;

/**
 * Дочерний класс ФЛЕШКА класса-носителя Carrier
 */
public class FlashDrive extends Carrier{
    public FlashDrive(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Флешка " + super.toString();
    }
}
