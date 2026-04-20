public class CentroControllo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= 2; i++) {
            if (i == 1)
                System.out.println("\nmissione alpha");
            else
                System.out.println("\nmissione beta");

            Thread t1 = new Thread(new FaseLancio("controllo sistemi", 3));
            Thread t2 = new Thread(new FaseLancio("rifornimento sarburante", 4));
            Thread t3 = new Thread(new FaseLancio("accensione motori", 2));

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

            System.out.println("DECOLLO AVVENUTO");
        }
    }
}
