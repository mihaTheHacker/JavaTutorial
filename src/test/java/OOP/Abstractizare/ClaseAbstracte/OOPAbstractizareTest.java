package OOP.Abstractizare.ClaseAbstracte;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {

    @Test

    public void metodaTest() {

        Cerc cerc = new Cerc();
        cerc.setRaza(5);
        cerc.calculareAria();

        Patrat patrat = new Patrat();
        patrat.setLatura(10);
        patrat.calculareAria();
    }
}
