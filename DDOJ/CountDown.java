package boldnessexp;

/**
 *
 * @author kyler_000
 */
public class CountDown implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 100; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(100);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
        System.out.println("Blastoff!");
    }

}
