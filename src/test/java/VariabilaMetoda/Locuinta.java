package VariabilaMetoda;

import org.testng.annotations.Test;

public class Locuinta {
    public String TipLocuinta;
    public Integer NumarCamere;
    public Integer NumarBai;
    public Integer Suprafata;
    public Integer Etaj;
    public Integer AnConstructie;

    @Test
    public void prezentareLocuinta() {
        TipLocuinta = "apartament";
        NumarCamere = 3;
        NumarBai = 2;
        Suprafata = 70;
        Etaj = 2;
        AnConstructie = 2010;

        System.out.println("Tipul locuintei este: " + TipLocuinta);
        System.out.println("Numarul de camere este: " + NumarCamere);
        System.out.println("Numarul de bai este: " + NumarBai);
        System.out.println("Suprafata locuintei este: " + Suprafata);
        System.out.println("Locuinta se afla la etajul: " + Etaj);
        System.out.println("Anul constructiei este: " + AnConstructie);
    }

}
