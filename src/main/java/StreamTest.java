import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numList = List.of(1,2,3,4,5);
        List<String> strList = List.of("Apple", "Java", "Springboot");
        List<Integer> emptyList = new ArrayList<>();
        Integer[][] numArray = new Integer[][]{{1,2}, {3,4}, {5,6}};

        int[] numIntArray = new int[]{1,2,3,4,5};


        Set<Integer> array = Arrays.stream(numArray)
        .flatMap(a -> Arrays.stream(a))
        .filter(n -> n > 1)
        .map(n -> n - 1)
        .collect(Collectors.toSet());

        array.forEach(System.out::println);

        numList.stream()
        .filter(n -> n > 1)
        .findFirst()
        .stream()
        .distinct()
        .forEach(System.out::println);
        // .collect(Collectors.toList());

        //findAny 첫번째 요소를 반환 할 가능성이 높고 이에 대한 보장은 없음
        numList.stream()
        .filter(n -> n > 1)
        .findAny()
        .stream()
        .forEach(System.out::println);

        Integer a = numList.stream()
        // .max(Comparator.comparing(n -> n))
        .mapToInt(n -> n)
        .max()
        .getAsInt();

        System.out.println(a);

        int max = strList.stream()
                            .mapToInt(String::length)
                            .max()
                            .getAsInt();
        
        System.out.println(max);


        // Integer emptyResult = emptyList.stream()
        // .mapToInt(n -> n)
        // .max();
        // .orElseThrow(NoSuchElementException::new);

        List<Integer> boxedResult = Arrays.stream(numIntArray)
        .boxed().collect(Collectors.toList());

        boxedResult.stream().forEach(System.out::println);
    }
}