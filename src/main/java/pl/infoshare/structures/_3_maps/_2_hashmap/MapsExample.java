package pl.infoshare.structures._3_maps._2_hashmap;

import java.util.*;

import static java.util.Collections.*;

public class MapsExample {
    public static void main(String[] args) {

        Map<String, Integer> grades = new HashMap<>();

        grades.put("Adam", 5);
        grades.put("Maciek", 3);
        System.out.println(grades);

        grades.put("Adam", 4);
        System.out.println(grades);

        Integer adamGrade = grades.get("Adam");
        System.out.println(adamGrade);


        //grades.put("Pawel", 6);
        grades.putIfAbsent("Pawel", 2);
        Integer pawelGrade = grades.getOrDefault("Pawel",1); //getOrDefault obsluza wyjatek NPE i daje default value jesli nie ma sie do czego odwolac
        System.out.println(pawelGrade);


        List<Grade> newGrades = getGrades();
        Map<String,List<Integer>> gradesMap = new HashMap<>();
        for (Grade grade: newGrades) {
            //gradesMap.put(grade.getStudentName(), grade.getValue());
            gradesMap.putIfAbsent(grade.getStudentName(), new ArrayList<>());
            List<Integer> integers = gradesMap.get(grade.getStudentName());
            integers.add(grade.getValue());
            gradesMap.put(grade.getStudentName(), integers);
        }
        System.out.println(gradesMap);
        System.out.println(gradesMap.get("Maciek"));
        System.out.println(countAverage(gradesMap.getOrDefault("Anastazja", emptyList())));
        System.out.println(countAverage(gradesMap.getOrDefault("Maciek", emptyList())));

    }

    private static List<Grade> getGrades(){
        return Arrays.asList(
                new Grade("Maciek", 4),
                new Grade("Maciek", 2),
                new Grade("Mikolaj", 4),
                new Grade("Maciek", 5),
                new Grade("Mikolaj", 2)
        );
    }

    private static Double countAverage(List<Integer> grades){
        int sum = 0;
        for (Integer grade: grades){
            sum += grade;
        }
        return (double) sum / grades.size();


//    private static Double avgGrade(Map<String, List<Integer>> gradesMap){
//        for(Grade grade: gradesMap){
//            if(gra)
//        }

    }

}
