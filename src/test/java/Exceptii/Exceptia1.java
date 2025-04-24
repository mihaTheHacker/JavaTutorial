package Exceptii;

public class Exceptia1 {
    //exceptiile reprezinta situatiile care apar in timpul executiei unui program care determina oprirea acestuia;
    //exceptiile sunt erori care apar in timpul executiei unui program
    //ofera un mecanism eficient de identificare si tratare a erorilor
    //sunt modelate sub forma de clase: clasa error, clasa exception, runtime exception, clase personalizate;
    //exceptile sunt gestionate folosind cuvinte predefinite: try, catch si finally;
    //sunt 2 tipuri mari de exceptii: checked si unchecked;
    //erorile checked sunt exceptii de compilare (nu se poate buldui sau rula programul);
    // Exemple erori checked: SQL exception, IOException, ClassNotFoundException;
    //erorile unchecked sunt exceptii de runtime, sunt ignorate in timpul compilarii (se pot buldui si rula programul);
    // Exemple erori unchecked: NullPointerException, ArrayIndexOutOfBoundsException, ClassCastException, ArithmeticException;
    //throw este un cuvand cheie care arunca exceptia in mod explicit de la o metoda sau un bloc de cod;
    //throws este un cuvand cheie care se foloseste odata cu metoda care poate arunca un tip sau mai multe de exceptii;

    public static void main(String[] args) throws ExceptieCustom {

//        try {
//            System.out.println(12 / 0);
//        } catch (ArithmeticException e) {
//            System.out.println("Error Arithmetic exception thrown" + e.getMessage());
//        }

        try {
            int[] numbers = new int[10];
            numbers[11] = 5; // ArrayIndexOutOfBoundsException
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e) {
            throw new ExceptieCustom("Eroare personalizata!");

//            System.out.println("Error ArrayIndexOutOfBoundsException thrown" + e.getMessage());
        } finally {
            System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa!");

        }

    }
}