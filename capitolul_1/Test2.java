package capitolul_1;

public class Test2 {
    public static void main(String[] args) {
        Test2 testulet = new Test2();
        //System.out.println(testulet.findAnswer(true));
        testulet.findAnswer(false);
    }
    public static void findAnswer(boolean check){
        int answer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch =1;
            answer = 1;
        } else {
            answer = 2;
            onlyOneBranch = 0;
        }
        System.out.println(answer);
        System.out.println(onlyOneBranch);
    }
}
