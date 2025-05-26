package OOP.Abstractizare.ClaseAbstracte;

public class Patrat extends FormeGeometrice {

   private int latura;

    @Override
    public void calculareAria() {
        System.out.println("Aria patratului este: " + (latura * latura));

    }

    public int getLatura() {
        return latura;
    }

    public void setLatura(int latura) {
        this.latura = latura;
    }
}
