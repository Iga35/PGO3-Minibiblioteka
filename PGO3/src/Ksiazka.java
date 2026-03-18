public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;
    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {

        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
    }
    void wypiszInfo(){
        System.out.println("Tytuł: "+ tytul +" Autor: "+ autor +" Stron: "+ liczbaStron+" Dostępna: "+dostepna);
    }
    void wypozycz(){
        if(dostepna){
            dostepna=false;
            System.out.println("Księżka "+tytul + " Została wypożyczona");
        }
        else {
            System.out.println("Księżka "+tytul + "Jest niedostępna");
        }

    }
    void zwroc(){
        dostepna=true;
        System.out.println("Kaiążka "+tytul +" została zwrócona");
    }

}

