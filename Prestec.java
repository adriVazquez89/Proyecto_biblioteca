import java.time.LocalDate;

/**
 * Classe que representa un préstec de llibre fet per un usuari.
 */
public class Prestec {

    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;
    private int llibresPrestats; // Nombre actual de llibres prestats per l'usuari
    private static final int MAX_LLIBRES = 3; // Màxim de llibres que un usuari pot tenir prestats

    /**
     * Constructor per crear un nou préstec.
     * @param usuari L'usuari que fa el préstec.
     * @param llibre El llibre prestat.
     * @param dataPrestec La data del préstec.
     */
    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2); // Per defecte, el retorn és a dues setmanes
        this.llibresPrestats = 1; // Al crear-se el préstec, ja hi ha 1 llibre prestat
    }


    public Usuari obtenirUsuariDelPrestec() {
        return this.usuari;
    }

    public Llibre obtenirLlibrePrestat() {
        return this.llibre;
    }

    public LocalDate obtenirDataDePrestec() {
        return this.dataPrestec;
    }

    public LocalDate obtenirDataDeRetorn() {
        return this.dataRetorn;
    }

    public int obtenirNombreDeLlibresPrestats() {
        return this.llibresPrestats;
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public LocalDate getDataPrestec() {
        return dataPrestec;
    }

    public LocalDate getDataRetorn() {
        return dataRetorn;
    }

    public int getLlibresPrestats() {
        return llibresPrestats;
    }

    /**
     * Incrementa en 1 el nombre de llibres prestats, si no s'ha arribat al màxim.
     */
    public void demanarLlibre() {
        if (llibresPrestats < MAX_LLIBRES) {
            llibresPrestats++;
        } else {
            System.out.println("No pots agafar més llibres.");
        }
    }

    /**
     * Decrementa en 1 el nombre de llibres prestats, si n'hi ha almenys un.
     */
    public void tornarLlibre() {
        if (llibresPrestats > 0) {
            llibresPrestats--;
        } else {
            System.out.println("No tens llibres per tornar.");
        }
    }
}
