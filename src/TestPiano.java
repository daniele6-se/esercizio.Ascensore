public class TestPiano {
    public static void main(String[] args) {
        Ascensore ascensore = new Ascensore(5);
        Piano[] piani = new Piano[10];
        for (int i = 0; i < 10; i++) {
            piani[i] = new Piano(i + 10);
            for (int j = 0; j < 3; j++) {
                piani[i].aggiungiPersonaCoda(new Persona(j + 1, i + 1));
            }
        }

        for (int t = 0; t < 100; t++) {
            System.out.println(ascensore);
            ascensore.apriPorte();
            ascensore.rimuoviPersoneArrivate();

            while (!piani[ascensore.getPianoCorrente() - 1].codaPersone.isEmpty()) {
                Persona p = piani[ascensore.getPianoCorrente() - 1].rimuoviPersonaCoda();
                if (p != null) {
                    p.saliSuAscensore(ascensore);
                }
            }

            ascensore.chiudiPorte();
            if (t % 2 == 0) {
                ascensore.salita();
            } else {
                ascensore.discesa();
            }
        }
    }
}

