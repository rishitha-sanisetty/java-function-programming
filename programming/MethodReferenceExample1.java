import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class Method {

    //This can be defined inside below class as well
    public static int squaredNum(int num) {
        return num*num;
    }

}

public class MethodReferenceExample1 {

    public static void transformList(List<Integer> list, Function<Integer, Integer> func) {

        for(int i=0; i<list.size(); i++) {
            list.set(i, func.apply(i));
        }
        list.forEach(System.out::println);

    }


    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1,2,3,4,5);
        transformList(li, Method::squaredNum);

    }

}
