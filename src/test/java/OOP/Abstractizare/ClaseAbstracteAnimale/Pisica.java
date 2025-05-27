package OOP.Abstractizare.ClaseAbstracteAnimale;

public class Pisica extends Animale {

    private String rasa;
    private String culoare;
    private int varsta;

    @Override
    public void getSunetAnimal() {
        System.out.println("Pisica din rasa " + rasa + " miauna.");

    }
    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public void checkCuloareAnimal() {
        System.out.println("Pisica este de culoare: " + culoare);
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void checkVarstaAnimal() {
        System.out.println("Varsta pisicii este de: " + varsta + " ani.");
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
}
