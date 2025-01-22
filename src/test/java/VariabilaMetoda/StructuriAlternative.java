package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative=if-then-else; switch-case
    @Test
    public void metodaTest() {
        metodaVerificareNumar(7);
        metodaVerificareNumar(3);
        metodaVerificareNumar(5);
        metodaVerificareNumarParPozitiv(7);
        metodaVerificareNumarParPozitiv(-7);

    }

    //verifica un numar mai mare decat 5
    public void metodaVerificareNumar(int numar) {
        if (numar > 5) {
            System.out.println("Numarul " + numar + " este mai mare decat 5");
        } else if (numar < 5) {
            System.out.println("Numarul " + numar + " nu este mai mare decat 5");
        } else {
            System.out.println("Numarul " + numar + " este egal cu 5");
        }
    }

    //verificam daca un numar este par pozitiv sau par negativ
    public void metodaVerificareNumarParPozitiv(int valoare) {
        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + valoare + " este impar pozitiv");
            }
        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par negativ");
            } else {
                System.out.println("Numarul " + valoare + " este impar negativ");
            }
        } else {
            System.out.println("Numarul este 0");
        }

    }

}
