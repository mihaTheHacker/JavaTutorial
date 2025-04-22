package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test
    public void metodaTest() {
        Avion avion1 = new Avion("Pasageri", "B-127", "Boeing", 200, "kerosen");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("Cargo", "C-456", "Airbus", 150, "kerosen");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("Cargo", "C-789", "Airbus", 150, "kerosen",2222);
        avion3.prezentareAvion();

    }

}
