//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package oop;

import java.util.Objects;

public class Person {
    private String name;
    private String address;
    private String cnp;
    private int age;
    private char gender;

    public Person(String nume1, String cnp1) {
    }

    public Person(String name, String cnp, char gender, int age, String address) {
        this(name, cnp, gender);
        this.address = address;
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, String cnp, char gender) {
        this.name = name;
        this.cnp = cnp;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCnp() {
        return this.cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void gateste() {
        System.out.println(this.name + " gateste");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            Person person = (Person)o;
            return this.age == person.age && this.gender == person.gender && Objects.equals(this.name, person.name) && Objects.equals(this.address, person.address) && Objects.equals(this.cnp, person.cnp);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.name, this.address, this.cnp, this.age, this.gender});
    }

    public static void respira() {
    }
}
