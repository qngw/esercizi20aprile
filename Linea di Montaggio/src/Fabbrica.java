public class Fabbrica {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nprodotto " + i);

            Thread t1 = new Thread(new BraccioMeccanico("saldatura", 3));
            Thread t2 = new Thread(new BraccioMeccanico("verniciatura", 2));
            Thread t3 = new Thread(new BraccioMeccanico("controllo", 1));

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        }
    }
}
