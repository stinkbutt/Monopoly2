import java.util.Random;

class Monopoly2 {

    static final class Dice{
        private final int first;
        private final int second;

        public Dice(int first, int second){
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }

    }

        public static Dice something(){
            Random rand = new Random();
            int  a = rand.nextInt(6) + 1;
            int  b = rand.nextInt(6) + 1;

            return new Dice(a, b);
        }


    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        for (int i = 0; i < 100; i++ ){
            Dice result = something();
            System.out.println(result.getFirst() + " " + result.getSecond());
        }
    }
}