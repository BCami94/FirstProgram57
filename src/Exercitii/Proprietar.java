package Exercitii;

public class Proprietar {
    private String nume;
    private Calculator calculator;

    public Proprietar (String nume){
        this.nume = nume;
    }

    public Proprietar (String nume, Calculator calculator){
        this(nume);
        this.calculator = calculator;
    }

    public String getNume(){
        return this.nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Calculator getCalculator(){
        return this.calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public String toString() {
        return "Proprietar{" +
                "nume='" + nume + '\'' +
                ", calculator=" + calculator +
                '}';
    }

    //metoda getprocesor from proprietar
      public String getProcesorFromProprietar(){
        Calculator c = this.getCalculator();
        //this.getCalculator().getProcesor();
        return c.getProcesor();
      }
}
