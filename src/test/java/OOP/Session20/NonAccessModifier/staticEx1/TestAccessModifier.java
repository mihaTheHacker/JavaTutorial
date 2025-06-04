package OOP.Session20.NonAccessModifier.staticEx1;

public class TestAccessModifier {

    public static void main(String[] args) {
        StaticAccessModifier staticAccessModifier = new StaticAccessModifier();
//        System.out.println(staticAccessModifier.name);
//        staticAccessModifier.printMessage();
        staticAccessModifier.name = "Endava Romania";
        System.out.println(staticAccessModifier.name);
        StaticAccessModifier.printMessage();

        StaticAccessModifier staticAccessModifiers2 = new StaticAccessModifier();
        System.out.println(staticAccessModifiers2.name);
        staticAccessModifiers2.name = "New Endava Romania";
        System.out.println(staticAccessModifier.name);
    }




}
