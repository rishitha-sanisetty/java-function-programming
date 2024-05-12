import java.io.*;
import java.util.*;

public class StreamIterations {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,5,6,7,8,9,10,1,2,3);

        //Print all elements
        numbers.stream().forEach(System.out::println);


        //Update elements of stream using map
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}