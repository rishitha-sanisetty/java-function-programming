public class FunctionalInterfaces {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(4,5,6,7,8,9,10,1,2,3);

        //Predicate
        Predicate<Integer> isEvenPredicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x%2==0;
            }
        };
        System.out.println(isEvenPredicate1.test(100));

        Predicate<Integer> isEvenPredicate2 = x -> x%2==0;
        numbers.stream().filter(isEvenPredicate2).forEach(System.out::println);


        //Function
        Function<Integer, Integer> squareFunction1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }

        };
        System.out.println(squareFunction1.apply(100));

        Function<Integer, Integer> squareFunction2 = x -> x * x;
        numbers.stream().map(squareFunction2).forEach(System.out::println);


        //Consumer
        Consumer<Integer> consumer1 = System.out::println;
        numbers.stream().forEach(consumer1);

        Consumer<Integer> consumer2 = new Consumer<Integer>() {
            public void accept(Integer x) {
                System.out.println(x);
            }
        };
        numbers.stream().forEach(consumer2);

        //No input
        Supplier<Integer> randomIntegerSupplier = () -> {
            return 100;
        };

        //Unary operator
        UnaryOperator<Integer> unaryOperator = x -> 3 * x;
        System.out.println(unaryOperator.apply(100));

        //Binary operator
        BinaryOperator<Integer> sumBinaryOperator1 = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a + b;
            }

        };
        System.out.println(numbers.stream().reduce(0, sumBinaryOperator1));

        BinaryOperator<Integer> sumBinaryOperator2 = Integer::sum;
        System.out.println(numbers.stream()
                .reduce(0, sumBinaryOperator2));

    }
}