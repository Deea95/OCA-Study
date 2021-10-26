package capitolul_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdd {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add(1, "robin");
        birds.add(0, "blue jay");
        birds.add(1, "cardinal");
        System.out.println(birds);
    }
}
