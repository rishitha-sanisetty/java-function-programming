import java.io.*;
import java.util.*;

public class Lambdas {

    public static void main(String args[]) {

        List<Integer> numbers = List.of(4,5,6,7,8,9,10,1,2,3);

        numbers.stream()
                .forEach((Integer x) -> System.out.println(x));

    }
}