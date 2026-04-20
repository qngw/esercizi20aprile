class FaseLancio implements Runnable {
    String operazione;
    int tempo;

    public FaseLancio(String operazione, int tempo) {
        this.operazione= operazione;
        this.tempo= tempo;
    }

    public void run() {
        try {
            System.out.println("inizio: " + operazione);
            Thread.sleep(tempo * 1000);
            System.out.println(operazione + " COMPLETATA");
        } catch (InterruptedException e) {
            System.out.println("ERRORE");
        }
    }
}