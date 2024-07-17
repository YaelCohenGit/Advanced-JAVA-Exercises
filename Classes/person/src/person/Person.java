/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author PC
 */
public class Person {

    private String person_name;
    private int height;
    private int weight;

    public Person(String person_name, int height, int weight) {
        this.person_name = person_name;
        this.height = height;
        this.weight = weight;
    }

    public String Get_person_name() {
        return this.person_name;
    }

    public void Set_person_name(String new_name) {
        this.person_name = new_name;
    }

    public int Get_height() {
        return this.height;
    }

    public void Set_height(int height) {
        this.height = height;
    }

    public int Get_weight() {
        return this.weight;
    }

    public void Set_weight(int weight) {
        this.weight = weight;
    }

    public void Print() {
        System.out.println("the name is " + this.person_name + "and the height is " + this.height);
    }

    public static int Averaged_weight(Person[] persons) {
        int totl_weight = 0;
        for (int i = 0; i < persons.length; i++) {
            totl_weight += persons[i].weight;
            System.out.println(persons[i].person_name);
            System.out.println(persons[i].height);
            System.out.println(persons[i].weight);
        }
        return totl_weight / persons.length;
    }

    public static void BMI(Person someone) {
        int bmi = 0;
        int x=someone.height * someone.height;
        bmi = (x / someone.weight);
        System.out.println(bmi);

    }

    public static void Diet(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            if (BMI(persons[i]) > 29) {
                System.out.println("התחל דיאטה");
            } else if (BMI(persons[i]) < 20) {
                System.out.println("אכול יותר");
            } else {
                System.out.println("משקלך תקין");
            }
        }

    }

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("sara", 170, 60);
        persons[1] = new Person("rivka", 160, 55);
        persons[2] = new Person("rachel", 150, 50);
//        int averaged_weight = Averaged_weight(persons);
//        System.out.println("averaged_weight: "+averaged_weight);
        BMI(persons[0]);
//        Diet(persons);

    }

}
