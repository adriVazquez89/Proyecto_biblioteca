import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorBiblioteca {
    private List<Prestec> prestecs;

    public GestorBiblioteca() {
        this.prestecs = new ArrayList<>();
    }

    // Prestar llibre
    public void prestarLlibre(Usuari usuari, Llibre llibre) {
        if (!llibre.esPrestat()) {
            llibre.prestar();
            Prestec prestec = new Prestec(usuari, llibre, LocalDate.now());
            prestecs.add(prestec);
            usuari.afegirLlibre(llibre);
            System.out.println(usuari.getNom() + " ha agafat el llibre: " + llibre.getTitol());
        } else {
            System.out.println("No hi ha còpies disponibles del llibre: " + llibre.getTitol());
        }
    }

    // Retornar llibre
    public void retornarLlibre(Usuari usuari, Llibre llibre) {
        if (usuari.getLlibresPrestats().contains(llibre)) {
            usuari.retornarLlibre(llibre);
            llibre.retornar();
            System.out.println(usuari.getNom() + " ha retornat el llibre: " + llibre.getTitol());
        } else {
            System.out.println("Aquest usuari no té aquest llibre en préstec.");
        }
    }

    // Mostrar préstecs actuals
    public void mostrarPrestecs() {
        System.out.println("Préstecs actuals:");
        for (Prestec p : prestecs) {
            System.out.println("- " + p.getUsuari().getNom() + " té el llibre: " + p.getLlibre().getTitol() + " des de " + p.getDataPrestec() + " fins a " + p.getDataRetorn());
        }
    }
}
