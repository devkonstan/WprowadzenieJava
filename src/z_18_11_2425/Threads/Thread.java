package z_18_11_2425.Threads;

import java.util.concurrent.TimeUnit;

public class Thread {
    public static void main(String[] args) {
        Task[] zadania = new Task[5];
        zadania[0] = new Task("Pracownik A");
        zadania[1] = new Task("Pracownik B");
        zadania[2] = new Task("Pracownik C");
        zadania[3] = new Task("Pracownik D");
        zadania[4] = new Task("Pracownik E");

        for (Task task : zadania) {
            new java.lang.Thread(task).start();
        }

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (Task task : zadania) {
            task.wylacz();
        }
    }

}

class Task implements Runnable {

    private String nazwa;
    private boolean aktywny = true; //flaga

    public Task(String nazwa) {

        this.nazwa = nazwa;
    }

    public void wylacz() {
        System.out.println(this.nazwa + " : 16:00 - idę do domu!");
        this.aktywny = false;
    }

    @Override
    public void run() {
        while (this.aktywny) { //domyslnie true
            System.out.println(this.nazwa + " : pracuje!");
            try {
                java.lang.Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}

