package capitolul_3;

public class ArrayNumarareLoop {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = i+5;
            System.out.println(numbers[i]);
        }
    }
}
