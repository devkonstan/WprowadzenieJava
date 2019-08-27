package z_18_11_2425.Threads;

import java.io.FileWriter;
import java.io.IOException;

public class ZadanieNaPliku implements Runnable {
    @Override
    public void run() {
        try {
            FileWriter fw = new FileWriter("MetodaZMetoda.txt", false); //false nadpisuje dane
            fw.append("testRownosci\n");
            fw.append("test3\n");
            fw.append("testRownosci\n");
            fw.append("test5\n");
            fw.flush(); //oczyszcza bufor
            fw.close(); //zamyka stream
        } catch (IOException io) {
            System.out.println("in out exc");
            io.printStackTrace();
        }
    }
}
