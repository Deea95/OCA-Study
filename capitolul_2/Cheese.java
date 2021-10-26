package capitolul_2;

public class Cheese {
    public static void main(String[] args) {
       Cheese chese = new Cheese();
       chese.eatCheese(10);

    }
    int roomInBelly = 5;
    public void eatCheese( int bitesOfCheese){
        while(bitesOfCheese > 0 && roomInBelly >0){
            bitesOfCheese --;
            roomInBelly --;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left.");
    }
}
