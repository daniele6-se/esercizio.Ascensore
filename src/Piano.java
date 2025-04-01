import java.util.ArrayList;
import java.util.List;

public class Piano {
    private int numeroPiano;
    protected List<Persona> codaPersone;

    public Piano(int numeroPiano) {
        this.numeroPiano = numeroPiano;
        this.codaPersone = new ArrayList<>();
    }

    public void aggiungiPersonaCoda(Persona p) {
        codaPersone.add(p);
    }

    public Persona rimuoviPersonaCoda() {
        return codaPersone.isEmpty() ? null : codaPersone.remove(0);
    }

    @Override
    public String toString() {
        return "Piano " + numeroPiano + " - In attesa: " + codaPersone.size();
    }
}

