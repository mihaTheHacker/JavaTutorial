package Multimi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;

public class Multimi {
    //multimi: array, list, map

    @Test
    public void metodaTest() {
//        colegiCurs();
//        colegiCursLista();
//        categoriiObiecte();
        tariOrase();

    }

    //exemplu array

    public void colegiCurs() {
        String[] colegi = new String[6];
        colegi[0] = "Andreea";
        colegi[1] = "Mihai";
        colegi[2] = "Cristina";
        colegi[3] = "Alex";
        colegi[4] = "Ioana";
        colegi[5] = "Andrei";
        for (int index = 0; index < colegi.length; index++) {
            System.out.println("Colegul de la indexul " + index + " este: " + colegi[index]);
        }


    }

    //exemplu list
    public void colegiCursLista() {
        List<String> colegi = new ArrayList<>();
        colegi.add("Andreea");
        colegi.add("Mihai");
        colegi.add("Cristina");
        colegi.add("Alex");
        colegi.add("Ioana");
        colegi.add("Andrei");

        int index = 0;
        while (index < colegi.size()) {
            System.out.println("Colegul de la indexul " + index + " este: " + colegi.get(index));
            index++;
        }
    }

    //exemplu map
    //map -> key=value
    public void categoriiObiecte() {
        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct", "mar");
        obiecte.put("floare", "trandafir");
        for (String key : obiecte.keySet()) {
            System.out.println("Cheia este: " + key +","+ "Valoarea este: " + obiecte.get(key));
        }

    }
    public void tariOrase(){
        HashMap<String, List<String>> clasificare = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Cluj");
        oraseRomania.add("Timisoara");

        List<String> oraseFranta = new ArrayList<>();
        oraseFranta.add("Paris");
        oraseFranta.add("Marseille");
        oraseFranta.add("Lyon");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");
        oraseSpania.add("Valencia");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Franta", oraseFranta);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String key : clasificare.keySet()) {
            System.out.println("Tara este: " + key + " si orasele sunt: " + clasificare.get(key));
        }

    }

}
