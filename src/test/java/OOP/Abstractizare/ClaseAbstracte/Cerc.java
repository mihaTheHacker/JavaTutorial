package OOP.Abstractizare.ClaseAbstracte;

public class Cerc extends FormeGeometrice {

    private int raza;

    @Override
    public void calculareAria() {
        System.out.println("Aria cercului este: " + (Math.PI * Math.pow(raza, 2)));

    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
