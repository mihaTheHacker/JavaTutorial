package OOP.Abstractizare.ClaseAbstracteAnimale;

import org.testng.annotations.Test;

public class OOPAbstractizareTestAnimale {

    @Test
    public void metodaTestAnimale() {

        Caine caine = new Caine();
        caine.setRasa("Labrador");
        caine.setCuloare("Negru");
        caine.setVarsta(5);
        caine.checkVarstaAnimal();
        caine.getSunetAnimal();
        caine.checkCuloareAnimal();
        caine.pazesteCasa();

        Pisica pisica = new Pisica();
        pisica.setRasa("Persana");
        pisica.setCuloare("Alb");
        pisica.setVarsta(3);
        pisica.getSunetAnimal();
        pisica.checkCuloareAnimal();
        pisica.checkVarstaAnimal();
        pisica.prindeSoareci();

        Lup lup = new Lup();
        lup.setRasa("Euroasiatic");
        lup.setCuloare("Gri");
        lup.setVarsta(4);
        lup.getSunetAnimal();
        lup.checkCuloareAnimal();
        lup.checkVarstaAnimal();
        lup.umblaInHaita();

    }
}
