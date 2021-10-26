package capitolul_4.app;

public class Shark extends Fish{
    private int numberOfFins = 8;
    public Shark(int age) {
        super(age);
        this.size =4;
    }


    public void displaySharkDetails() {
        System.out.println("Shark with age: " + getAge());
        System.out.println(" and " + size + " meters long.");
        System.out.println(" with " + numberOfFins + " fins.");
    }

    public static void main(String[] args) {
        Shark shark = new Shark(10);
        shark.displaySharkDetails();
    }
}
