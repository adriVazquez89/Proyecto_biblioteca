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

    public void prestar() { prestat = true; }

    public void retornar() { prestat = false; }

    @Override
    public String toString() {
        return titol + " de " + autor + (prestat ? " (En préstec)" : " (Disponible)");
    }
}
