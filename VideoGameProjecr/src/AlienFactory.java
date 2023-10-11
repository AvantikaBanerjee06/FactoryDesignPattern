
import java.util.Random;
public class AlienFactory {

    private enum AlienType {SquidAlien, MonkeyAlien, TigerAlien, RatAlien};

    ;
    private static Random r = new Random();

    public   Alien getAlien() {
        int rNum = r.nextInt(AlienType.values().length);
        AlienType a = AlienType.values()[rNum];
        Alien ans = null;

        switch (a) {
            case SquidAlien:
                ans = new SquidAlien();
                break;
            case MonkeyAlien:
                ans = new MonkeyAlien();
                break;
            case TigerAlien:
                ans = new TigerAlien();
                break;
            case RatAlien:
                ans = new RatAlien();
                break;
            default:
                System.out.println("Unknown alien type");
                System.exit(1);
                break;
        }
        return ans;

    }
}