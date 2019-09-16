package z_18_11_2425;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class zapisDoPliku {
    public static void main(String[] args) {

        try {
            File file = new File("plik.txt");
            System.out.println(file.exists());
            FileWriter fw = new FileWriter(file, false); //jesli true to dopisuje do pliku ciagle nowe wartosci
            fw.append("testRownosci\n");
            fw.append("2 \n");
            fw.append("4 \n");
            fw.flush();
            fw.close();
//            flush() flushes content of buffer to destination.
//            And you can write something again into the stream.

//            This is used when there needs to be synchronous sending
//            For example you have a duplex (2-way) connection and you just
//            sent a message and now need to wait for the reply on it,
//            without flush a buffered outputstream might hold it until the
//            buffer fills up (deadlock).

//            close() flushes content to destination and closes the stream.
//            After close() you can't write anything anymore.
//            close() closes the stream permanently. If you want to write some data further,
//            then you have to reopen the stream again and append the data with the existing ones.
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
