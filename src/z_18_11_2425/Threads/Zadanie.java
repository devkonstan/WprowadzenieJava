package z_18_11_2425.Threads;

public class Zadanie implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" iteracja nr "+i);
            System.out.println(Thread.currentThread().getState());
            System.out.println(Thread.currentThread().getClass());
        }
    }
}
