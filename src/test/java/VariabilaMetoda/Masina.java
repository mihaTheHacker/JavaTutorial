package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {

    public String Marca;
    public String Model;
    public Integer AnFabricatie;

    @Test
    public void metodaTest(){
        dateMasina("Audi", "A4", 2010);
        dateMasina("BMW", "X5", 2015);
        dateMasina("Mercedes", "E200", 2018);

        calculMedie(5.0, 7.0);
        calculMedie(10.0, 15.0);
    }
    public void dateMasina(String param1, String param2, Integer param3) {
        Marca = param1;
        Model = param2;
        AnFabricatie = param3;

        System.out.println("Masina este marca: " + Marca);
        System.out.println("Modelul masinii este: " + Model);
        System.out.println("Anul fabricatiei este: " + AnFabricatie);
        System.out.println("Masina este marca: " + Marca + ", modelul masinii este: " + Model + ", anul fabricatiei este: " + AnFabricatie);
    }

    //calculam media la 2 numere
    public void calculMedie(Double numar1, Double numar2) {
        Double medie = (numar1 + numar2) / 2;
        System.out.println("Media numerelor " + numar1 + " si " + numar2 + " este: " + medie);
    }

}
