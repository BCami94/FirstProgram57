package Exercitii;

public class Main {
    public static void main(String[] args) {
        //3 calculatoare + 3 proprietari -> 2 cu constructorul cu 6 parametri, si 1 cu cel cu un field
        // o metoda pe proprietar si una pe calculator
        Calculator c1 = new Calculator("id1", "Monitor1", "Procesor1", "PlacaVideo1", "PlacaBaza1", 2200);
        Calculator c2 = new Calculator ("id2", "Monitor2", "Procesor2", "PlacaVideo2", "PlacaBaza2", 2201);
        Calculator c3 = new Calculator("id3");

        c3.setAnFabricatie(2000);
        c3.setMonitor("Monitor3");
        c3.setProcesor("Procesor3");
        c3.setPlacaVideo("PlacaVideo3");
        c3.setPlacaBaza("PlacaBaza3");

        Proprietar p1 = new Proprietar("Nume1");
        p1.setCalculator(c3);
        System.out.println(p1.getProcesorFromProprietar());


    }
}
