package arrays;

import oop.Person;

public class Main {
    public static void main(String[] args) {
        // int [] arr = new int[10];
        int [] arr = new int[]{1213, 22323, 3232};
        //     arr[2] = 3;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        Person[] persons = new Person[3];
        Person p = new Person ("p1", (char) 22);
        persons [0] = p;
        persons [1] = new Person ("p2", "cnp2" , 'F');
        persons [2] = new Person ("p3", "cnp3" , 'F');

        for (int i = 0; i < persons.length; i++){
            System.out.println(persons[i]);
        }


    int [] input = new int[]{1,2,3,4,5,6,7,8,9};
    for (int i = 0; i < input.length; i++){
        input[i] = i;
    }

    //face suma elementelor pare din array
    //  public static int sum (int[] param){
}

    //Array de persoane si vreau sa intorc un array care contien CNP-urile persoanelor date
    public static String[] exCnp(Person[] param) {
        String[] cnps = new String[param.length];
        for (int i = 0; i <param.length; i++) {
            cnps[i] = param[i].getCnp();
        }

        return cnps;
    }


}


