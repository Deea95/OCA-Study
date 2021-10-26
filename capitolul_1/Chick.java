package capitolul_1;

public class Chick {
    private String name = "Fluffy"; // se initializeaza numele
    { System.out.println("setting field");} // se imprima initializatorul de instanta
    public Chick(){
        name ="Tiny"; // se schimba valoarea lui name
        System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        Chick chick = new Chick(); // constructor
        System.out.println(chick.name); }} // se imprima constructorul