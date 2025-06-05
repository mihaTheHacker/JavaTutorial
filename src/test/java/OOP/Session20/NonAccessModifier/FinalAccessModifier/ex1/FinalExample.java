package OOP.Session20.NonAccessModifier.FinalAccessModifier.ex1;

public class FinalExample {

    //'final' keyword poate fi aplicat pentru outer class, inner class, variabile/field si metode
    //nu poate fi aplicata la interfete, constructori, block-uri de initializare si enum-uri
    //o clasa finala nu poate fi extinsa,
    //o metoda finala nu poate fi suprascrisa,
    //o variabila declarata si initializata nu poate fi modificata dupa initializare

    static int a = 10; // constant, cannot be changed
    static final int ROTI_MASINA = 4; // constant for the number of wheels in a car

    public static void main(String[] args) {
        System.out.println("Value of a: " + a);
        a++; // This line will cause a compilation error because 'a' is final and cannot be modified

      //  ROTI_MASINA = 5; // This line will also cause a compilation error because ROTI_MASINA is declared as final and cannot be changed
    }
}
