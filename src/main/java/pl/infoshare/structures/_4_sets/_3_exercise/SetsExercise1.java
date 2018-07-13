package pl.infoshare.structures._4_sets._3_exercise;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsExercise1 {

    // TODO: Ćwiczenie 5 - Sets API
    // TODO: 1. Utwórz nowy HashSet przechowujący Integery. Dodaj do niego liczby 2, 7, 3, 1, 1
    // TODO: 2. Sprawdź rozmiar seta
    // TODO: 3. Utwórz nowy LinkedHashSet przechowujący Integery. Dodaj do niego te same liczby.
    // TODO: 4. Wypisz po kolei wszystkie obu utworzonych setów
    public static void main(String[] args) {

        Set<Integer> integers = new HashSet<>();
        integers.add(2);
        integers.add(7);
        integers.add(3);
        integers.add(1);
        integers.add(1);

        System.out.println(integers.size());


        // TODO: Ćwiczenie 5 - Sets API
        // TODO: 1. Utwórz nowy HashSet przechowujący klase City (nazwa miasta i populacja).
        // TODO: 2. Dodaj do niego 4 misata. Dodaj jedno miasto dwa razy
        // TODO: 3. Sprawdz rozmiar seta
        // TODO: 4. Utworz treeSet i posortuj miasta w kolejnowsci od najwiekszego do najmniejszego

        Set<City> cities = new HashSet<>();
        cities.add(new City("Gdansk", 500));
        cities.add(new City("Sopot", 100));
        cities.add(new City("Gdynia", 150));
        cities.add(new City("Gdynia", 150));
        cities.add(new City("Warszawa", 800));

        System.out.println(cities);
        System.out.println(cities.size());

        Set<City> citiesTree = new TreeSet<>();
        citiesTree.add(new City("Gdansk", 500));
        citiesTree.add(new City("Sopot", 100));
        citiesTree.add(new City("Gdynia", 150));
        citiesTree.add(new City("Gdynia", 150));
        citiesTree.add(new City("Warszawa", 800));

        System.out.println(citiesTree);
        System.out.println(citiesTree.size());

    }
}
