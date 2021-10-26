package capitolul_3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);// [1] , index 0
        numbers.add(2); // [1,2] , index 1
        numbers.remove(1); // se elimina indexul 1, adica [2] => ramane : [1]
        System.out.println(numbers); // [1] ( are indexul 0).
    }
}
