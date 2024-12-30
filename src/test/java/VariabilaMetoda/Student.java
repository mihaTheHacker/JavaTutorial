package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //clasa= sablon care defineste proprietatile si comportamentul unei entitati specifice

    //intr-un fisier java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa ai mai multe clase cu acelasi nume)

    //intr-o clasa putem defini proprietatile si actiunile entitatii

    //variabila = proprietatea unei clase

    //variabilele pot fi de doua feluri: global si local

    //variabilele globale = sunt vizibile peste tot in proiect

    //variabilele locale = sunt vizibile doar in locul in care sunt declarate

    //ca sa definim o variabila globala: accesscontrol(public), tip variabila, nume variabila

    //cand definim o variabila nu este obligatoriu sa ii atribuim o valoare

    //metoda = actiunea unei clase

    //exista doua tipuri de metode: void si return (return = metoda care returneaza o valoare)


    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;


    @Test
    public void prezentareStudent() {
        Nume = "Popescu";
        Prenume = "Ioana";
        Varsta = 20;
        Adresa = "Strada Florilor, nr. 10";
        Inaltime = 1.80;
        Greutate = 60.00f;
        Sex = 'F';
        AreDiploma = true;

//        System.out.println
//                ("Numele studentului este: " + Nume + " " + Prenume + ", are varsta de " + Varsta + " ani, locuieste pe " + Adresa
//                        + ", are inaltimea de " + Inaltime + " m, greutatea de " + Greutate);

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Varsta studentului este: " + Varsta);
        System.out.println("Adresa studentului este: " + Adresa);
        System.out.println("Inaltimea studentului este: " + Inaltime);
        System.out.println("Greutatea studentului este: " + Greutate);
        System.out.println("Sexul studentului este: " + Sex);
        System.out.println("Are studentul diploma?: " + AreDiploma);

        calculMedie();

    }

    public void calculMedie() {
        Integer nota1 = 10;
        Integer nota2 = 9;
        Integer nota3 = 8;
        Integer medie = (nota1 + nota2 + nota3) / 3;
        System.out.println("Media studentului este: " + medie);

    }

}