import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("3");
        list.add("2");
        list.add("1");
        Collections.sort(list);
        System.out.println(list);
    }
}