class BraccioMeccanico implements Runnable {
    String fase;
    int tempo;

    public BraccioMeccanico(String fase, int tempo) {
        this.fase= fase;
        this.tempo= tempo;
    }

    public void run() {
        try {
            System.out.println("inizio: "+ fase);
            Thread.sleep(tempo * 1000);
            System.out.println(fase + " COMPLETATA");
        } catch (InterruptedException e) {
            System.out.println("ERRORE");
        }
    }
}