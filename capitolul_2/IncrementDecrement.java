package capitolul_2;

public class IncrementDecrement {
    public static void main(String[] args) {
        int count = 1;
        System.out.println("Exemplul 1 este: " + count); // 1  - se afiseaza valoarea initiala => 1
        System.out.println("Exemplul 2 este: " + ++count); // 2 - creste valoarea cu 1 SI APOI se afiseaza => 2
        System.out.println("Exemplul 3 este: " + count++); // 2 - se afiseaza valoarea actuala SI APOI creste => 3
        System.out.println("Exemplul 4 este: " + --count); // 2 - scade la 2 SI APOI se afiseaza
        System.out.println("Exemplul 5 este: " + count--); // 2 - se afiseaza valoarea actuala, SI APOI scade la 1
        System.out.println("Exemplul 6 este: " + count); // 1 - se afiseaza valoarea => 1

    }
}
