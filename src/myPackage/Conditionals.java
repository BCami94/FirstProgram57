package myPackage;
public class Conditionals {
    public static void main(String[] args) {
      //  workWithConditionals();
        //mergeLegal("autostrada", 110);
        //boolean b = verifica(2, 2);
          //      System.out.println(b);
        workWithSwitch("ploua");
        findDayoftheWeek(2);

    }

    public static void workWithConditionals() {
        //if (conditie) {instructiuni} else if (conditie) {instructiuni} else {instructiuni}
        int x = 22;
        int y = 33;
        int z = 44;
        char b = 'A';
        if (x == y) {
            System.out.println("Egal");
        } else if (x > y && b == 'A') {
            System.out.println("Mai mare");
        } else if (x < y) {
            System.out.println("Mai mic");
        } else {
            System.out.println("Nimic");
        }

    }

    // o metoda:
// avem ca parametri tipul drumului si viteza pe care ar merge o masina
// vreau sa printeze "E legal" sau "E ilegal" in fuctie de :
// tipul drumului: Judetean, natonal, european, autostrada.
    public static void mergeLegal(String tipDrum, int viteza) {
        if (tipDrum.equals("judetean") && viteza > 60) {
            System.out.println("Merge ilegal");
        } else if (tipDrum.equals("national") && viteza > 90) {
            System.out.println("Merge ilegal");
        } else if (tipDrum.equals("european") && viteza > 100) {
            System.out.println("Merge ilegal");
        } else if (tipDrum.equals("autostrada") && viteza > 130) {
            System.out.println("Merge ilegal");
        } else {
            System.out.println("Merge legal");
        }
    }
    //o metoda care primeste 2 inturi ca parametri si returneaza true sau false daca suma lor este egala cu produsul lor
    // daca e true, atunci printam "da", altfel "nu"
    // ternary operator: conditie ? {instructiune daca e true} : {instructiune daca e false}
    public static boolean verifica (int a, int b){
        int sum = a +b;
        int prod = a * b;
        boolean rezultat = false;

        boolean rez = sum == prod ? true : false;
        if (sum == prod){
            rez = true;
        }
        else {
            rez = false;
        }
        if (sum == prod){
            System.out.println("da");
            rezultat = true;
        }else {
            System.out.println("nu");
            rezultat = false;
        }
        return rezultat;
    }

    public static void workWithSwitch(String fenomen){
        //char, byte, short, int, Character, Byte, Short, Integer, String
        switch (fenomen) {
            case "ploua" :
                System.out.println("Nu ies din casa");
                break;
            case "ninge" :
                System.out.println("Ies sa ma dau cu sania");
                break;
            case "soare" :
                System.out.println("Ies din casa");
                break;
            default:
                System.out.println("Nu fac nimic");
                break;
        }
    }
    /// zilele saptamanii 1-7, Luni.. Duminica
    // se da ca param un int 1-7 si se printeza
    public static void findDayoftheWeek(int nr){
        switch (nr){
            case 1 :
                System.out.println("Luni");
                break;
            case 2 :
                System.out.println("Marti");
                break;
            case 3 :
                System.out.println("Miercuri");
                break;
            case 4 :
                System.out.println("Joi");
                break;
            case 5 :
                System.out.println("Vineri");
                break;
            case 6 :
                System.out.println("Sambata");
                break;
            case 7 :
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Nu e o zi a saptamanii");
                break;
        }
    }
}