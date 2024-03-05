public class App {
    public static void main(String[] args) throws Exception {
        int number = 28;
        boolean isPerfect = isPerfectNumber(number);
        System.out.println(number + " is a perfect number: " + isPerfect);
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}
