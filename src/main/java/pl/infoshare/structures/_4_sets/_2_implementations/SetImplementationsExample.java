package pl.infoshare.structures._4_sets._2_implementations;

import pl.infoshare.structures._1_pojo.Person;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImplementationsExample {
    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();
        people.add(new Person("Adam", "Smakulski", 41));
        people.add(new Person("Ela", "Dolna", 54));
        people.add(new Person("Adam", "Glowicki", 21));

        for (Person person: people){
            System.out.println(person);
        }
        System.out.println();

        Set<Person> peopleLink = new LinkedHashSet<>();
        peopleLink.add(new Person("Adam", "Smakulski", 41));
        peopleLink.add(new Person("Ela", "Dolna", 54));
        peopleLink.add(new Person("Adam", "Glowicki", 21));

        for (Person person: people){
            System.out.println(person);
        }
        System.out.println();

        Set<Person> peopleTree = new TreeSet<>();
        peopleTree.add(new Person("Adam", "Smakulski", 41));
        peopleTree.add(new Person("Ela", "Dolna", 54));
        peopleTree.add(new Person("Adam", "Glowicki", 21));

        for (Person person: people){
            System.out.println(person);
        }

    }


}
