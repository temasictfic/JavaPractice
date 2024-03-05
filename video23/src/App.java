public class App {
    public static void main(String[] args) throws Exception {
        int numberOne = 220;
        int numberTwo = 284;
        
        if (areAmicable(numberOne, numberTwo)) {
            System.out.println("The numbers are amicable.");
        } else {
            System.out.println("The numbers are not amicable.");
        }
    }
    
    public static boolean areAmicable(int numberOne, int numberTwo) {
        return sumOfProperDivisors(numberOne) == numberTwo && sumOfProperDivisors(numberTwo) == numberOne;
    }
    
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
