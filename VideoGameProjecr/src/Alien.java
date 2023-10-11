import java.util.Random;

public class Alien {

    private final String NAME;
    private static Random r = new Random();
    //static, initialized in static area because its a static var, don't want this to keep changing

    public Alien(String type) {
        this.NAME = type + r.nextInt(100);
        // generate a number 0-99
    }

    public String getNAME() {
        return this.NAME;
    }

    @Override
    public String toString() {
        return this.NAME;
    }
}
