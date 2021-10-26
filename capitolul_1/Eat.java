package capitolul_1;

public class Eat {
    public static void main(String[] args) {
        Eat mancare = new Eat();
        mancare.eatMore(true,100);
    }
    public void eatMore( boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry){
            boolean timeToEat = true;
            while (amountOfFood > 0){
                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }
}