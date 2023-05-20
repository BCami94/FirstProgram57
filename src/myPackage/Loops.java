package myPackage;

public class Loops {

    public static void main(String[] args){
        // for (pas inceput; conditie de mers mai departe; pasul miscarii (din cat in cat sa mearga))
        for (int i = 0; i < 10; i++){
        //    System.out.println(i);
            if (i == 3){
                break;
            }

        }
       // System.out.println(sum4());
        // while {conditie} {instructiune}
        // do{instructiuni} while (conditie}
       // workWithWhile();prod(1,2);


       // System.out.print(prod(2, 4));
    }
    //suma primelor n de numere naturale
    // suma numerelor pare de la 0 la 20: if, modificam pasul foruluim continue


    public static boolean sum (int n){
        int sum = 0;
        for (int i =0; i<=n; i++){
            sum = sum + i;
        }
        return sum%3 == 0 ? true : false;
    }

    public static int sum2(){
        int s = 0;
        for (int i = 0; i <= 20; i++){
            System.out.println(i);
            if (i % 2 == 0){
                s = s + i;
            }
        }return s;
    }
    public static int sum3(){
        int s = 0;
        for (int i = 0; i <= 20; i+=2){
                s = s + i;
            }return s;
        }
    public static int sum4(){
        int s = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
             s = s + i;
        }return s;
}

     public static void workWithWhile(){
        int k = 0;
        while (k < 10){
            System.out.println(k);
            k++;
        }
     }
    //while - prima data se verifica conditia, dupa care se executa instructiunile din while daca aceasta este true
    // produsul nr de la n la m, inclusiv n si m
    public static int prod(int n, int m){
        int k = n;
        int p = 1;
        while (k <= m){
            p *= k;
            k++;
        }
            return p;
     }

    // int i = 1;
     //do {
       // System.out.println(i);
       // i--;
    //} while (i >2);
}
