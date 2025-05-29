package OOP;

import OOP.Abstractizare.StudentInt;

public class Student extends Persoana implements StudentInt {

    private String facultate;
    private String an;
    private Boolean bursa;


    public Student(String nume, String prenume, Integer varsta, String facultate, String an, Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa = bursa;

    }


    public void infoStudent() {
        infoPersoana();
        System.out.println("Facultatea este: " + facultate);
        System.out.println("Anul este" + an);
        System.out.println("Ia studentul bursa? " + bursa);
    }

    public void absolvire(){
        System.out.println("Studentul " + getNume() + " si prenumele " + getPrenume() + " a absolvit facultatea " + facultate + " in anul " + an);
    }

    public void mananca(){
        System.out.println("Studentul mananca atunci cand doreste");
        super.mananca();
    }

    public String getFacultate() {
        return facultate;
    }

    public String getAn() {
        return an;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }

    public void setAn(String an) {
        this.an = an;
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul merge la cursuri.");

    }

    @Override
    public void sustineExamen() {
        System.out.println("Studentul sustine examen.");

    }

    @Override
    public void mergeLaCafea() {
        System.out.println("Studentul merge la cafea.");

    }
}
