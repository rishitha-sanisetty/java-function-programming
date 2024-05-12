import java.io.*;
import java.util.*;
import java.util.function.*;

public class BehaviourParameterization {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,5,6,7,8,9,10,1,2,3);

        //Predicate as param
        Predicate<Integer> predicate = x -> x%2==0;
        filterAndPrint(numbers, predicate);

        //Function as param
        Function<Integer, Integer> function = x -> x * 2;
        mapAndPrint(numbers, function);

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }

    private static void mapAndPrint(List<Integer> numbers, Function<Integer, Integer> function) {
        numbers.stream()
                .map(function)
                .forEach(System.out::println);
    }

}