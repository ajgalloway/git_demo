public class main {
    public static void main(String args[]) {

        System.out.println("FizzBuzz Start");

        for(int i = 0; i < 100; i++) {
            if ((i % 15) == 0) {
                System.out.println("FizzBuzz " + i);
            }
            else if ((i % 3) == 0) {
                System.out.println("Fizz " + i);
            }
            else if ((i % 5) == 0) {
                System.out.println("Buzz " + i);
            }
            else {
                //System.out.println(i);
            }
        }

        System.exit(0);
    }
}