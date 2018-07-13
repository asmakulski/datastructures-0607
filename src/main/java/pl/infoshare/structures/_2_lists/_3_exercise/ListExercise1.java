package pl.infoshare.structures._2_lists._3_exercise;

import pl.infoshare.structures._1_pojo.Person;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;

public class ListExercise1 {

    // TODO: Ćwiczenie 1 - API list
    // TODO: 1. Utwórz nową LinkedList przechowującą typy Person
    // TODO: 2. Utwórz cztery instancje klasy Person, dodaj je do listy
    // TODO: 3. Usuń drugi element listy
    // TODO: 4. Zamień miejscami pierwszy i ostatni element
    // TODO: 5. Wypisz wszystkie pełnoletnie osoby
    public static void main(String[] args) {

        //dobra praktyka
        //tworzymy ogolna Liste zamiast LinkedList, bo pozniej latwiej o refaktoryzacje w raie zmiany implementacji
        List<Person> people = new LinkedList<>();
        Person person1 = new Person("Adam", "Smakulski", 41);
        Person person2 = new Person("Adam", "Glowicki", 15);
        Person person3 = new Person("Ela", "Dolna", 28);
        Person person4 = new Person("Maciej", "Niewiem", 18);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        System.out.println(people.toString());

        people.remove(1);

        System.out.println(people.toString());

        System.out.println("Przed");
        System.out.println(people.get(0));
        System.out.println(people.size()-1);

        // dobra praktyka
        // uzywamy tylko metod dostepnych w List np. people.get(people.size()-1), a nie w LinkedList np. getLast()
        Person tempPerson1 = people.get(0);
        Person tempPerson2 = people.get(people.size()-1);

        people.set(people.size()-1,tempPerson1);
        people.set(0,tempPerson2);

        System.out.println("Po");
        System.out.println(people.get(0));
        System.out.println(people.get(1));
        System.out.println(people.get(people.size()-1));
    }

    public void printAdults(LinkedList people){


    }

}
