import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareToTest {
    public static void main(String[] args) {
        String str1 = "AA"; 
        String str2 = "AA"; 
        String str3 = "BB"; 
        System.out.println(str1.compareTo(str2));  // 결과  0 
        System.out.println(str2.compareTo(str3));  // 결과 -1 
        System.out.println(str3.compareTo(str2));  // 결과  1 

        System.out.println("---------------------------------------------------------------");

        int[] numbers = {3, 30, 34, 5, 9};
        List<String> list = new ArrayList<>();
        for(Integer num : numbers){
            list.add(String.valueOf(num));
        }
        Collections.sort(list, (a, b) -> (b + a).compareTo(a + b));

        list.stream().forEach(System.out::println);
        
        System.out.println("---------------------------------------------------------------");
    
        int[][] number = {{3,1}, {30,2}, {34,3}, {4,2}, {7,9}};
        Arrays.sort(number, new Comparator<int[]>() {
            @Override
            public int compare(int[] start, int[] end) {
                if(start[1]==end[1]){
                    return Integer.compare(start[0], end[0]);
                }
                return Integer.compare(start[1], end[1]);
            }
        });

        Arrays.stream(number).forEach(n -> Arrays.stream(n).forEach(System.out::println));
        
    }
}