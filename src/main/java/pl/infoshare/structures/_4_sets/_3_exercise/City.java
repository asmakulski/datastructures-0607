package pl.infoshare.structures._4_sets._3_exercise;

import java.util.Objects;

public class City implements Comparable<City>{

    private String name;
    private Integer population;

    public City(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) &&
                Objects.equals(population, city.population);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, population);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City o) {
        if (this.population == o.population){
            return 0;
        }
        if (this.population > o.population){
            return 1;
        }
        if (this.population < o.population){
            return -1;
        }
        return 0;
    }
}
