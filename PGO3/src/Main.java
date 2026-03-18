//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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



    }
}