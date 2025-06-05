package OOP.Session20.NonAccessModifier.valueVsReferenceType;

public class ReferenceType {

    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
//        String str2 = str1;

        int intreg1 = 10;
        int intreg2 = 10;

        if (intreg1 == intreg2) {
            System.out.println("valorile sunt la fel");
        } else {
            System.out.println("valorile sunt diferite");
        }

        System.out.println("..........................");

        if (str1 == str2) {

            System.out.println("valorile sunt la fel");
        } else {
            System.out.println("valorile sunt diferite");
        }
    }
}
