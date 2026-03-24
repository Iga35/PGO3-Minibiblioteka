public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;

    public Biblioteka(int pojemnosc) {
        this.ksiazki = new Ksiazka[pojemnosc];
        this.liczbaKsiazek = 0;
    }

    public void dodajKsiazke(Ksiazka ksiazka) {
        if (liczbaKsiazek < ksiazki.length) {
            ksiazki[liczbaKsiazek] = ksiazka;
            liczbaKsiazek++;
        }
        else {
            System.out.println("Biblioteka jest pełna, nie można dodać książki");
        }
    }

    public void wypiszDostepneKsiazki(){
        System.out.println("Dostępne książki: ");
        for(int i=0; i< liczbaKsiazek; i++){
            ksiazki[i].wypiszInfo();
        }
    }

    public void znajdzKsiazkePoTytule(String tytul){
        boolean znaleziona = false;
        for (int i=0; i<liczbaKsiazek; i++){
            if(ksiazki[i].getTytul().equals(tytul)) {
                System.out.println("Książka znaleziona: ");
                ksiazki[i].wypiszInfo();
                znaleziona=true;
                break;
            }
            else {
                System.out.println("Książka nie znaleziona");

            }
        }
    }

    public int policzDostepneKsiazki(){
        int ilosc=0;
        for(int i=0; i<liczbaKsiazek; i++){
            ilosc++;
        }
        return ilosc;
    }


}