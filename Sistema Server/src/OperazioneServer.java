class OperazioneServer implements Runnable {
    String nome;
    int tempo;

    public OperazioneServer(String nome, int tempo) {
        this.nome= nome;
        this.tempo= tempo;
    }

    public void run() {
        try {
            System.out.println("inizio: " + nome);
            Thread.sleep(tempo * 1000);
            System.out.println(nome + " COMPLETATA");
        } catch (InterruptedException e) {
            System.out.println("ERRORE");
        }
    }
}