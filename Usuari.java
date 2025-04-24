import java.util.ArrayList;
import java.util.List;

public class Usuari {
    private String nom;
    private List<Llibre> llibresPrestats;

    public Usuari(String nom) {
        this.nom = nom;
        this.llibresPrestats = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public List<Llibre> getLlibresPrestats() {
        return llibresPrestats;
    }

    public void afegirLlibre(Llibre llibre) {
        llibresPrestats.add(llibre);
    }

    public void retornarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    // Afegir mètodes per gestionar usuaris
    public void modificarNom(String nouNom) {
        this.nom = nouNom;
    }

    // Aquest mètode és només un exemple de com eliminar un llibre prestat
    public void eliminarLlibre(Llibre llibre) {
        llibresPrestats.remove(llibre);
    }

    // Mètode per llistar tots els llibres prestats per l'usuari
    public void llistarLlibresPrestats() {
        System.out.println("Llibres prestats per " + nom + ":");
        for (Llibre llibre : llibresPrestats) {
            System.out.println(llibre.getTitol());
        }
    }

    // Mètode per cercar un llibre prestat específic
    public boolean cercarLlibre(Llibre llibre) {
        return llibresPrestats.contains(llibre);
    }
}
