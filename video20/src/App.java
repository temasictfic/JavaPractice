public class App {
    public static void main(String[] args) throws Exception {
        int number = 8;
        int sqRoot = (int) Math.sqrt(number);
        boolean isPrime = true;
        for (int i = 2; i <= sqRoot; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && number > 1) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
