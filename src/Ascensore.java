import java.util.*;



public class Ascensore {
    private int pianoCorrente;
    private int capienzaMassima;
    private List<Persona> personeDentro;
    private boolean porteAperte;

    public Ascensore(int capienzaMassima) {
        this.pianoCorrente = 1;
        this.capienzaMassima = capienzaMassima;
        this.personeDentro = new ArrayList<>();
        this.porteAperte = false;
    }

    public void apriPorte() {
        porteAperte = true;
    }

    public void chiudiPorte() {
        porteAperte = false;
    }

    public void aggiungiPersona(Persona p) {
        if (porteAperte && personeDentro.size() < capienzaMassima) {
            personeDentro.add(p);
            System.out.println(p + " è salita sull'ascensore.");
        }
    }

    public void rimuoviPersoneArrivate() {
        if (porteAperte) {
            personeDentro.removeIf(p -> p.getPianoDestinazione() == pianoCorrente);
        }
    }

    public void salita() {
        if (pianoCorrente < 10) pianoCorrente++;
    }

    public void discesa() {
        if (pianoCorrente > 1) pianoCorrente--;
    }

    public int getPianoCorrente() {
        return pianoCorrente;
    }

    @Override
    public String toString() {
        return "Ascensore al piano " + pianoCorrente + " con " + personeDentro.size() + " persone a bordo.";
    }
}



