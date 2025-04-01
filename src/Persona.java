import java.util.Random;

public class Persona {
    private int id;
    private int pianoDestinazione;

    public Persona(int id, int pianoAttuale) {
        this.id = id;
        Random rand = new Random();
        do {
            this.pianoDestinazione = rand.nextInt(10) + 1;
        } while (this.pianoDestinazione == pianoAttuale);
    }

    public int getPianoDestinazione() {
        return pianoDestinazione;
    }

    public void saliSuAscensore(Ascensore a) {
        a.aggiungiPersona(this);
    }

    public void scendiDaAscensore(Ascensore a) {
        a.rimuoviPersoneArrivate();
    }
}
