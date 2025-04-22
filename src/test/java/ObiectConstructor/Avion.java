package ObiectConstructor;

public class Avion {

    //Constructor = Are ca rol sa initializeze variabelele unei Clase
    //Constructorul are acelasi nume ca si clasa
    //Intr-o clasa putem avea n constructori care se diferentiaza prin numarul sau tipul de parametri
    //Exista 2 tipuri de constructori: cu parametri si fara parametri
    //Intr-o clasa avem tot timpul un constructor default (fara parametri)
    //constructorul trebuie sa fie public
    //Obiect = Instanta unei clase
    //Dintr-o clasa putem face mai multe obiecte
    //Ca sa initializam un obect ne folosim de cuvantul "new"
    //Cand se initializeaza un obiect se apeleaza constructorul clasei

    public String tip;
    public String model;
    public String marca;
    public Integer capacitatePasageri;
    public String tipCombustibil;
    public Integer numarBagaje;

    public Avion(String tip, String model, String marca, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.model = model;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
    }

    public Avion(String tip, String model, String marca, Integer capacitatePasageri, String tipCombustibil, Integer numarBagaje) {
        this.tip = tip;
        this.model = model;
        this.marca = marca;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBagaje = numarBagaje;
    }

    public void prezentareAvion() {
        System.out.println("Tipul avionului este: " + tip);
        System.out.println("Modelul avionului este: " + model);
        System.out.println("Marca avionului este: " + marca);
        System.out.println("Capacitatea pasagerilor este: " + capacitatePasageri);
        System.out.println("Tipul de combustibil este: " + tipCombustibil);
        if (numarBagaje != null) {
            System.out.println("Numarul de bagaje este: " + numarBagaje);
        } else {
            System.out.println("Numarul de bagaje nu este specificat");
        }
    }


}
