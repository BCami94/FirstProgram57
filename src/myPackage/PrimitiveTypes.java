package myPackage;

public class PrimitiveTypes {
    public static void main(String[] args) {
        workWithDataTypes();
    }

    //metoda: signaturaua (declaratia metodei) -> access modifier, alte keyworkds
    // return type al metodei (adica ce returneaz metdoda), numele metodei + paramentri intre paratenteze
    // metoda se apoeleaza: clasa. metoda, sa
    public static void workWithDataTypes() {
        Masina m = new Masina();

        //8 primitive in Java
           //1. byte -> 1 byte
            byte b = 12;
            System.out.println(b);
        //    byte bb;
          //  System.out.println(bb);
        short s = 3000;
        System.out.println(s);
        int i = 1111111111;
        System.out.println(i);
        long l = 2222222222222L;
        System.out.println(l);
        boolean boo = false;
        System.out.println(boo);
        System.out.println(m.anFabricatie);
        float f = 12.232222222222222f;
        System.out.println(f);
        double d = 12.2322222d;
        System.out.println(d);
        char c = 91;
        System.out.println(c);
    }
}
