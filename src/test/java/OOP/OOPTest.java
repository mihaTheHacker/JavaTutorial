package OOP;

import org.testng.annotations.Test;

public class OOPTest {
    @Test

    public void metodaTest() {

        Student Tim = new Student("Tim", "Pop", 20, "Info", "Anul 2", true);
        Tim.infoStudent();

        Angajat Andrei = new Angajat("Andrei", "Ion", 30, "Google", 5, 20);
        Andrei.infoAngajat();

        Andrei.promovare();
    }

}
