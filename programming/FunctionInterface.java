import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String[] args) {

        Function<Integer, Integer> fun1 = i -> {
            i = i*10;
            System.out.println("Tens : " + i);
            return i;
        };
        Function<Integer, Integer> fun2 = i -> {
            i = i/2;
            System.out.println("Half : " + i);
            return i;
        };

        fun1.apply(2);
        System.out.println();

        fun2.andThen(fun1).apply(9);
        System.out.println();
        fun1.andThen(fun2).apply(9);
        System.out.println();

        fun1.compose(fun2).apply(19);
        System.out.println();
        fun2.compose(fun2).apply(19);
        System.out.println();
        fun2.compose(fun1).compose(fun2).apply(19);
        System.out.println();

        //BiFunction
        BiFunction<Integer, Integer, Integer> biFun = Integer::sum;
        System.out.println("Sum of nums using BiFunction interface: " + biFun.apply(34, 12));

        System.out.println(biFun.andThen(fun2).apply(3,4));

    }
}
