public class Llibre {
    
    private String titol;
    private String autor;
    private boolean prestat;

    public Llibre(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
        this.prestat = false;
    }

    public String getTitol() { return titol; }

    public String getAutor() { return autor; }

    public boolean esPrestat() { return prestat; }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrestat(boolean prestat) {
        this.prestat = prestat;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    // Funcion modificar el libro, lo modifica, y ya
    public void modificarLlibre (String titol, String autor, boolean prestat){
        this.autor = autor;
        this.titol = titol;
        this.prestat = prestat;

    }

    // Funcion eliminar, para elimnarlo realmente se haria desde el main pero bueno
    // yo hago el metodo por si acaso
    public void eliminarLlibre (){
        this.autor = null;
        this.titol = null;
        this.prestat = false;
    
    }

    public void prestar() { prestat = true; }

    public void retornar() { prestat = false; }

    @Override
    public String toString() {
        return titol + " de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
}
