package OOP.Abstractizare.ClaseAbstracteAnimale;

public class Lup extends Animale {

    private String rasa;
    private String culoare;
    private int varsta;

    @Override
    public void getSunetAnimal() {
        System.out.println("Lupul din rasa " + rasa + " urla.");
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public void checkCuloareAnimal() {
        System.out.println("Lupul este de culoare: " + culoare);

    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    @Override
    public void checkVarstaAnimal() {
        System.out.println("Varsta lupului este de: " + varsta + " ani.");
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    public void umblaInHaita() {
        System.out.println("Lupul umbla in haita.");
    }
}
