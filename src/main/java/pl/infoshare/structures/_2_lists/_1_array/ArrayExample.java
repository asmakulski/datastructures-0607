package pl.infoshare.structures._2_lists._1_array;

import pl.infoshare.structures._1_pojo.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExample {

    public static void main(String[] args) {
        Person firstPerson = new Person("Maciej", "Koziara", 25);
        Person secondPerson = new Person("Mikołaj", "Koziara", 22);

        ArrayWrapper arrayWrapper = new ArrayWrapper();
        arrayWrapper.add(firstPerson);
        arrayWrapper.add(secondPerson);
        System.out.println(arrayWrapper);

        System.out.println(arrayWrapper.get(1));
        System.out.println(arrayWrapper.isEmpty());
        System.out.println(arrayWrapper.size());

        Person newFirstPerson = new Person("Maciej", "Koziara", 25);
        arrayWrapper.remove(newFirstPerson);
        System.out.println(arrayWrapper.size());
        System.out.println(arrayWrapper);

    }
}
