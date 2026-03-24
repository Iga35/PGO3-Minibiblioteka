public class Czytelnik {
    private String imie;
    private String nazwisko;
    private String numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, String numerKarty, int liczbaWypozyczen) {

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }
    public void wypiszDane(){
        System.out.println("imię: "+ imie +", Nazwisko: "+ nazwisko +", Numer Karty: "+ numerKarty+", Liczba wypożyczonych książek: "+liczbaWypozyczen);
    }

    public void zwiekszLiczbeWypozyczen(){
        liczbaWypozyczen++;
        System.out.println("Zwiększona liczba wypożyczeń: " +liczbaWypozyczen);
    }

    public void zmniejszLiczbeWypozyczen(){
        if (liczbaWypozyczen>0){
            liczbaWypozyczen--;
            System.out.println("Zmniejszona liczba wypożyczeń: "+ liczbaWypozyczen);
        }
        else{
            System.out.println("Brak książek do oddania");
        }
    }
}
