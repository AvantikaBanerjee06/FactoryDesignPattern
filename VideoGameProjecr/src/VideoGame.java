
import java.util.Random;

public class VideoGame {
    public void play() {
        Alien[] aliens = new Alien[10];
        for (int i = 0; i < 10; i++) {
            AlienFactory alienFactory = new AlienFactory();
            aliens[i] = alienFactory.getAlien();
        }

        for (Alien a : aliens) {
            System.out.println(a);
        }
    }
}
