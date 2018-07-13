package pl.infoshare.structures._2_lists._1_array;

import pl.infoshare.structures._1_pojo.Person;

import java.util.Arrays;

public class ArrayWrapper {

    private Person[] people = new Person[0];

    public void add(Person person) {
        people = increaseSize(people);
        people[people.length - 1] = person;
    }

    public void remove(int index) {
        people[index] = null;
        people = getRidOfNulls(people);
    }

    public void remove(Person person) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals(person)) {
                remove(i);
            }
        }
    }

    public Person get(int index) {
        return people[index];
    }

    public boolean isEmpty() {
        return people.length == 0;
    }

    public int size() {
        return people.length;
    }

    private Person[] getRidOfNulls(Person[] people) {
        Person[] arrayWithoutNulls = new Person[people.length - 1];
        int currentIndex = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                arrayWithoutNulls[currentIndex] = people[i];
                currentIndex++;
            }
        }

        return arrayWithoutNulls;
    }

    private Person[] increaseSize(Person[] array) {
        Person[] increasedArray = new Person[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            increasedArray[i] = array[i];
        }

        return increasedArray;
    }

    @Override
    public String toString() {
        return "ArrayWrapper{" +
                "people=" + Arrays.toString(people) +
                '}';
    }
}
