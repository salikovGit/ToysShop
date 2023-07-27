import java.util.Comparator;
import java.util.Random;

public class Toy {
    private final int id;
    private final String name;
    private int frequency;
    private static final Random random = new Random();

    /**
     * Java class Toy constructor
     * @param id Toy's ID
     * @param name Toy's name
     */
    public Toy(int id, String name) {
        this.id = id;
        this.name = name;

        this.frequency = random.nextInt(1, 101);
    }

    /**
     * Java class Toy method
     * @return Toy's ID
     */
    public int getId() {
        return id;
    }

    /**
     * Java class Toy method
     * @return Toy's name
     */
    public String getName() {
        return name;
    }

    /**
     * Java class Toy method
     * @return Chance to get this toy
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Java class Toy method. Sets chance to get this toy
     * @param frequency Chance to get this toy
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "You've got " + name;
    }
}
