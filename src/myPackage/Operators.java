package myPackage;
public class Operators {
    public static void main(String[] args) {
        workWithOperators();
        int sum = Exercitii.sum(1,2);
        System.out.println(sum);
        System.out.println(Masina.merge("Autostrada A1", 130));

    }
    public static void workWithOperators(){
        int x = 22;
        int xy;
        xy = 22;

        xy += 20; // (xy devine xy)
        System.out.println(xy);
        xy -= 20;
        System.out.println(xy);
        xy *= 2;
        System.out.println(xy);
        xy /= 2;
        System.out.println(xy);

        int p = xy % 3;
        System.out.println(p);
        // restul impartirii lui xy la 3


        //incredementare/decrementare
        x++; //(x = x + 1 sau x += 1)
        x--; // (x = x - 1)

        //---->preincrementare/ predecrementare
        int var = 0;
        System.out.println(var++);// 0
        System.out.println(var); // 1
        System.out.println(++var); //2

        //relational: <, >, <=, <=
        int u1 = 242;
        int u2 = 242;
        boolean b = u1 >= u2;
        boolean bb = u1 != u2;
        boolean cc = u1 == u2;
        System.out.println(b);
        System.out.println(cc);

        //Opeatiori logici: &&, ||, ! -> booleans se apllica
        char pp = 'p';

        boolean verificaSi = !(u1 == u2) && pp == 'p' && var == 2;
        //&& intorace true daca toate partile experiei se intorc true
        boolean verifiacSau = u1 == u2 || u1 != u2;
        // || intoarce true daca minim una dintre expressile din sau e true
        boolean negate = !verificaSi;
        System.out.println(verificaSi);
        System.out.println(negate);

        System.out.println(u1);
        float ff = u1;
        int u3 = (int) ff;
        System.out.println(ff);
        System.out.println(u3);

        double db = 35.99d;
        long m = Math.round(db);
        double n = Math.floor(db); // - returneaza cel mai mic nr intreg mai mic decat elementul dat ca parametru
        double z = Math.ceil(db); // - returneaza cel mai mic nr intreg mai mare decat elementul dat ca paratmetru
        System.out.println(m);
        System.out.println(n);
        System.out.println(z);

    }
}
