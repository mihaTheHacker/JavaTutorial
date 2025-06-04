package OOP.Session20.NonAccessModifier.staticEx1;

public class StaticAccessModifier {

    //STATIC
    //La nivel de static, un modificator static poate fi aplicat la nivel de variabila, metoda, bloc de initializare, la inner class sau la inner interface.
    // Variabilele si metodele statice apartin clasei, nu obiectului.
    //o proptietate/metoda statica se poate apela prin numele clasei de exemplu NumeClasa.numeProprietate sau NumeClasa.numeMetoda()
    //eficientizarea memoriei, deoarece nu se creeaza o copie a variabilei/metodei pentru fiecare obiect creat din clasa respectiva

    static String name = "Endava";

    public static void printMessage() {
        System.out.println("Printeaza metoda");
    }

}
