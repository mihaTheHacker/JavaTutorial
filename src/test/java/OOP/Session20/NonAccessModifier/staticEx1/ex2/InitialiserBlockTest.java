package OOP.Session20.NonAccessModifier.staticEx1.ex2;

public class InitialiserBlockTest {
    private String name = "Ana";

    {
        System.out.println("Initialiser block executed");
        name = "Test";
    }

    public InitialiserBlockTest() {
        name = "Maria";
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        InitialiserBlockTest test = new InitialiserBlockTest();
        System.out.println(test.name);
    }
}

