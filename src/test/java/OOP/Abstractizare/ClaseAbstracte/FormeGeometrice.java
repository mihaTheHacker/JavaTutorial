package OOP.Abstractizare.ClaseAbstracte;

public abstract class FormeGeometrice {

    public String culoare;

    public abstract void calculareAria();


    public void deseneaza() {
        System.out.println("Deseneaza o forma geometrica");
    }


}
