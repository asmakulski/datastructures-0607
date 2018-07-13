package pl.infoshare.structures._3_maps._3_exercise;

import java.util.HashMap;
import java.util.Map;

public class MapsExercise1 {

    // TODO: Ćwiczenie 3 - Map API
    // TODO: 1. Utwórz nową HashMapę City od Integer (liczba mieszkańców)
    // TODO: 2. Dodaj do mapy trzy trójmiejskie miasta wraz z liczba ich mieszkancow
    // TODO: 3. Zaktualizuj liczbę mieszkańców Gdyni do 150
    // TODO: 4. Zaktualizuj liczbę mieszkańców Wejherowa do 36000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 5. Zaktualizuj liczbę mieszkańców Gdańska do 100000 tylko jeżeli miasto nie było wcześniej dodane do mapy
    // TODO: 6. Wypisz na ekran tylko miasta
    // TODO: 7. Wypisz na ekran tylko ilość mieszkańców
    // TODO: 8. Wypisz na ekran dane dla Gdańska, Wejherowa i Warszawy. Jeżeli miasta nie ma wypisz zero.
    public static void main(String[] args) {

        System.out.println("TODO: 1, TODO 2");
        Map<String, Integer> cities = new HashMap<>();
        cities.put("Gdansk", 500000);
        cities.put("Sopot", 100000);
        cities.put("Gdynia", 150000);
        System.out.println(cities);

        System.out.println("TODO: 3");
        cities.put("Gdynia", 150);
        System.out.println(cities);

        System.out.println("TODO: 4");
        cities.putIfAbsent("Wejherowo", 36000);
        System.out.println(cities);

        System.out.println("TODO: 5");
        cities.putIfAbsent("Gdansk", 100000);
        System.out.println(cities);

        System.out.println("TODO: 6");
        System.out.println(cities.keySet());

        System.out.println("TODO: 7");
        System.out.println(cities.values());

        System.out.println("TODO: 8");
        System.out.println(cities.getOrDefault("Gdansk", 0));
        System.out.println(cities.getOrDefault("Wejherowo", 0));
        System.out.println(cities.getOrDefault("Warszawa", 0));






    }
}
