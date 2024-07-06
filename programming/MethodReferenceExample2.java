import java.util.Arrays;
import java.util.List;

class ReverseSort {

    public int compare(int x, int y) {
        return y-x;
    }
}


public class MethodReferenceExample2 {

    public static void main(String[] args) {

        ReverseSort reverseSort = new ReverseSort();

        List<Integer> li = Arrays.asList(10,1,2,3,4,5);
        li.sort(reverseSort::compare);
        li.forEach(System.out::println);

    }

}
