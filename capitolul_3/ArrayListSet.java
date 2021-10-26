package capitolul_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSet {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.size()); // 1
        birds.set(0,"robin");
        System.out.println(birds.size());// 1
        birds.set(1,"robin"); // java.lang.IndexOutOfBoundsException
    }
}
