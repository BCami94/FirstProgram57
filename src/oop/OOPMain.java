package oop;

public class OOPMain {
    public static void main(String[] args){
        int x;
        Person p = new Person("Nume1", "Cnp1");
        Person q = new Person ("Nume2", "12");

        Person qq = new Person("Nume4", 'M');

       // qq.setAge(44);
        System.out.println(q.getName());

        //instanta de pe care a fost apelata metoda
        p.gateste();
    }
}
