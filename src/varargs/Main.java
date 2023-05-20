package varargs;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
     int[] nr = new int[]{1,2};
        sumNumere(nr);
        sumNumere(1,2,3);
    }

    //varargs

    public static void sumNumere(int...numere){
        for (int i = 0; i < numere.length; i++){
            System.out.println(numere[i]);
        }
    }
}
