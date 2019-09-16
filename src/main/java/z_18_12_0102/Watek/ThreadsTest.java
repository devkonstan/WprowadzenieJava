package z_18_12_0102.Watek;

public class ThreadsTest {
    public static void main(String[] args) {

//        Watki.Wat1 wat1=new Watki.Wat1();
//        Watki.Wat2 wat2=new Watki.Wat2();

        new Watek1().run();
        new Watek2().run();

        System.out.println("********");

        Thread t1 = new Thread(new Watek1());
        Thread t2 = new Thread(new Watek2());
        t1.start();
        t2.start();
    }
}
