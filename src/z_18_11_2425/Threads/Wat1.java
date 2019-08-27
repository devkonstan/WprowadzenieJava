package z_18_11_2425.Threads;

public class Wat1 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("czekam 2 sek i jestem watkiem nr 1");

    }

}
