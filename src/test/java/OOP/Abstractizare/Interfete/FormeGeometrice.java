package OOP.Abstractizare.Interfete;

public interface FormeGeometrice {

    public static final String culoare = "Albastru"; // constantă - permite doar constante nu si felduri sau proprietati care nu sunt initializate
    //toate metodele declarate sunt by default abstracte

    void calculareAria();

    void deseneaza();

}
