import java.time.LocalDate;
public class Prestec {
    
    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;
    private int llibresPrestats = 3; //Llibres màxims que es poden agafar simultàniament

    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2);
    }

    public Usuari getUsuari() { return usuari; }
    public Llibre getLlibre() { return llibre; }
    public LocalDate getDataRetorn() { return dataRetorn; }
    public LocalDate getDataPrestec() { return dataPrestec; }
    public int getLlibresPrestats() { return llibresPrestats; }

    //Quan es demani un llibre es restarà del màxim que es poden agafar
    public void demanarLlibre (int llibresPrestats)
    {
        if (llibresPrestats > 0)
        {
            llibresPrestats--;
        }
        else 
        {
            System.out.println("No pots agafar més llibres");
        }
    }

    //Quan es torni un llibre es sumarà del màxim que es poden agafar (fins a 3)
    public void tornarLlibre (int llibresPrestats)
    {
        if (llibresPrestats < 3)
        {
            llibresPrestats++;
        }
        else 
        {
            System.out.println("No pots tornar més llibres");
        }
    }


}import java.time.LocalDate;

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

    // ---------- Mètodes desenvolupats (obtenir...) ----------

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

    // ---------- Getters clàssics (get...) ----------

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

    // ---------- Lògica de préstecs ----------

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
