package OOP.Abstractizare.ClaseAbstracteAnimale;

public class Caine extends Animale {

    private String rasa;
    private String culoare;
    private int varsta;

    @Override
    public void getSunetAnimal() {
        System.out.println("Cainele din rasa " + rasa + " latra.");

    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;

    }

    @Override
    public void checkCuloareAnimal() {
        System.out.println("Cainele este de culoare: " + culoare);
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void checkVarstaAnimal() {
        System.out.println("Varsta cainelui este de: " + varsta + " ani.");
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void pazesteCasa() {
        System.out.println("Cainele din rasa " + rasa + " pazeste casa.");
    }
}
