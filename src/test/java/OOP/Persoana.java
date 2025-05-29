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

    //incapsulare = ascunderea detaliilor de implementare ale unei clase, expunand doar metodele necesare
    //facem variabilele/metodele din public in private, protejand astfel datele
    //private = access control care restrictoneaza accesul doar in clasa respectiva
    //ca sa extragem/modificam o valoare a unei vatiabile priivate ne folosim de metodele get/set

    //polimorfism = procesul prin care definim mai multe implementari pentru o metoda,
    // o metoda poate avea mai multe implementari, in functie de context
    //poate fi e doua feluri: overloading (suprasarcina) si overriding (suprascriere)
    //polimorfismul dinamic = intr-o ierarhie de clase obtinue prin mostenire, o metoda poate avea implemetari diferite

    //polimorfismul static = posibilitatea prin care o metoda are mai multe implementari prin diferentiarea numarului sau tipului de parametri
    // in aceeasi clasa, adica metoda are acelasi nume, dar diferente in parametri

    //ABSTRACTIZARE = reducerea unui element complex la un element mai simplu(reducerea completa a implementarii metodelor lasand doar numele functiilor, paramtrii si tipul returnat
    //Abstractizarea se poate obtine prin clase abstracte si sau interfete
    //clsele abstracte sunt utilizate pentru a declara caracteristici comune a unor subclase
    //o clasa abstracta nu poate fi instantiata
    //ea poate fi utilizata ca si superclasa pentru alte clase care extind clasa abstracta
    //clasa abstracta poate fi definita folosind modificatorul "abstract" in fata cuvantului "class"
    //o clasa abstracta poate contine atribute si metode pe langa clasa abstracta

    //interfata ofera raspuns lipsei mostenirii multiple
    //interfata creeaza un protocol pe care clasele trebuie sa il implementeze
    //interfata contine toate metodele abstracte(este o clasa pur abstracta)


    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    protected void infoPersoana() {
        System.out.println("Nume: " + nume);
        System.out.println("Prenume: " + prenume);
        System.out.println("Varsta: " + varsta);
    }

    //definim prima implementare pentru o metoda(polimorfism dinamic)
    public void mananca(){
        System.out.println("Persoana mananca atunci cand ii este foame");
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
