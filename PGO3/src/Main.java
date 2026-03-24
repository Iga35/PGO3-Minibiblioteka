public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1= new Ksiazka("Psi Dom", "Marek Kowalski", 500, false);
        Ksiazka ksiazka2= new Ksiazka("Podręcznik", "Agnieszka Kwiatek", 120, true);
        Ksiazka ksiazka3= new Ksiazka("Anatomia Żółwi", "Antoni Żółw", 890,true);

        ksiazka1.wypiszInfo();
        ksiazka1.wypozycz();
        ksiazka1.zwroc();

        ksiazka2.wypiszInfo();
        ksiazka2.wypozycz();
        ksiazka2.zwroc();

        ksiazka3.wypiszInfo();
        ksiazka3.wypozycz();
        ksiazka3.zwroc();

        Czytelnik c1= new Czytelnik("Agata", "Nowak", "ko9037", 2);
        Czytelnik c2= new Czytelnik("Maciej", "Kowalski", "ncu2313", 0);

        c1.wypiszDane();
        c1.zwiekszLiczbeWypozyczen();
        c1.zmniejszLiczbeWypozyczen();

        c2.wypiszDane();
        c2.zwiekszLiczbeWypozyczen();
        c2.zmniejszLiczbeWypozyczen();

        Biblioteka b1= new Biblioteka(4);
        b1.dodajKsiazke(new Ksiazka("Psi Dom", "Marek Kowalski", 500, false));
        b1.dodajKsiazke(new Ksiazka("Podręcznik", "Agnieszka Kwiatek", 120, true));
        b1.dodajKsiazke(new Ksiazka("Anatomia Żółwi", "Antoni Żółw", 890,true));

        b1.wypiszDostepneKsiazki();
        b1.znajdzKsiazkePoTytule("Psi Dom");
        b1.znajdzKsiazkePoTytule("Podręcznik");

        System.out.println("Liczba książeke: "+b1.policzDostepneKsiazki());

    }
}