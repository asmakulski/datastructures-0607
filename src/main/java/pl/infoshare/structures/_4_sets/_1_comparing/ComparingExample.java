package pl.infoshare.structures._4_sets._1_comparing;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingExample {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Adam", "Smakulski", 25));
        persons.add(new Person("Ela", "Dolna", 21));
        persons.add(new Person("Ela", "Niewiem", 21));
        persons.add(new Person("Adam", "Glowicki", 49));

        Collections.sort(persons);
        System.out.println(persons);
        Collections.sort(persons, new PersonNameComparator());
        System.out.println(persons);

    }



}
