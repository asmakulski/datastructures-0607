package pl.infoshare.structures._1_pojo;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public int compareTo(Person o) {
        if (this.age == o.age){
            int compareResult = this.surname.compareTo(o.surname);
            if(compareResult == 0) {
                return this.name.compareTo(o.name);
            }
        }
        if (this.age > o.age){
            return 1;
        }
        if (this.age < o.age){
            return -1;
        }
        return 0;
    }
}
