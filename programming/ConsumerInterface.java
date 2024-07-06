import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterface {

    public static void main(String[] args) {

        //Only print statement
        Consumer<String> cn1 = str -> System.out.println("Call from cn1 -> " + str);
        Consumer<String> cn2 = str -> System.out.println("Call from cn2 -> " + str);
        cn1.accept("Test only accept method ");
        cn1.andThen(cn2).accept("Test andThen method example 1");
        cn2.andThen(cn1).accept("Test andThen method example 2");


        //Modifying a list using consumer
        Consumer<List<Integer>> cnList1 = li -> {
            li.replaceAll(integer -> integer * 2);
            System.out.println("****** Call from cnList1 ******");
            li.forEach(System.out::println);
        };
        Consumer<List<Integer>> cnList2 = li -> {
            li.replaceAll(integer -> integer * 3);
            System.out.println("****** Call from cnList2 ******");
            li.forEach(System.out::println);
        };

        cnList1.accept(Arrays.asList(1,2,3,4));
        cnList1.andThen(cnList2).accept(Arrays.asList(10,20,30,40));
        cnList2.andThen(cnList1).accept(Arrays.asList(11,22,33,44));

        //Simple example
        BiConsumer<String, String> biCons = (str1, str2) -> {
            System.out.println(str1.equals(str2));
        };
        biCons.accept("Sample1", "Sample2");
        biCons.accept("Sample", "Sample");

        //Modify list using BiConsumer
        BiConsumer<List<String>, String> biConsList1 = (li, str) -> {
            li.replaceAll(string -> string + str);
            System.out.println("****** Call from biConsList1 ******");
            li.forEach(System.out::println);
        };

        BiConsumer<List<String>, String> biConsList2 = (li, nothing) -> {
            li.replaceAll(String::toUpperCase);
            System.out.println("****** Call from biConsList2 ******");
            li.forEach(System.out::println);
        };
        biConsList1.accept(Arrays.asList("abc", "def"), " random string");
        biConsList2.andThen(biConsList1).accept(Arrays.asList("java", "python", "c++", "php"), " is a language");
        biConsList1.andThen(biConsList2).accept(Arrays.asList("java", "python", "c++", "php"), " is a language");

    }
}
