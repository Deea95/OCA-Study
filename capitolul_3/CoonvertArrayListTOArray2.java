package capitolul_3;

import java.util.Arrays;
import java.util.List;

public class CoonvertArrayListTOArray2 {
    public static void main(String[] args) {
        String[] array = {"hawk", "robin"};
        List<String> list = Arrays.asList(array);
        System.out.println(list.size());
        list.set(1,"test");
        array[0] ="new";
        for(String b: array) System.out.println(b+"");
        list.remove(1);
    }
}
