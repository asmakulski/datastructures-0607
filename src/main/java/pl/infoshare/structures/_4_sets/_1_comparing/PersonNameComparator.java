package pl.infoshare.structures._4_sets._1_comparing;

import pl.infoshare.structures._1_pojo.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {


    @Override
    public int compare(Person firstPerson, Person secondPerson) {
        String firstPersonName = firstPerson.getName();
        String secondPersonName = secondPerson.getName();

        return firstPersonName.compareTo(secondPersonName);
    }
}
