package capitolul_1;

public class Mouse {
    public static void main(String[] args) {
        Mouse maus = new Mouse();
        maus.grow(10);
    }
    static int MAX_LENGTH = 5;
    int length;

    public void grow(int inches) {
        if(length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
            System.out.println(newSize);
        }
    }
}
