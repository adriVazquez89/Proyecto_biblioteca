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


}