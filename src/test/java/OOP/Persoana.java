package OOP;

public class Persoana {

    //OOP = programare orientata obiect
    //4 principii: mostenire, incapsulare, polimorfism, abstractizare
    //mostenire = o clasa mosteneste atributele si metodele unei alte clase
    //ex: clasa Student mosteneste atributele si metodele clasei Persoana
    //In Java putem mostrni o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul clasei parinte
    //in momentul in care se aplica mostenirea, copilul are vizibilitate asupra variabilelor/metodelor din parinte
    //Constructorul din parinte se apeleaza cu super()

    public String nume;
    public String prenume;
    public Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public void infoPersoana() {
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("Varsta: " + varsta);
    }
}
