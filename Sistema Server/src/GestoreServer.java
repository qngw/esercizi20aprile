public class GestoreServer {
    public static void main(String[] args) throws InterruptedException {

        String[] server = {"server A", "server B", "server C"};

        for (int i = 0; i < server.length; i++) {
            System.out.println("\n" + server[i]);

            Thread t1 = new Thread(new OperazioneServer("backup dati", 4));
            Thread t2 = new Thread(new OperazioneServer("antivirus", 2));
            Thread t3 = new Thread(new OperazioneServer("ottimizzazione", 1));

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        }
    }
}