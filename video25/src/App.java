public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int numberToFind = 5;
        numberFinder(numbers, numberToFind);
    }

    public static void numberFinder(int[] numbers, int numberToFind) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToFind) {
                System.out.println(numberToFind + " found at index: " + i);
                return;
            }
        }
        System.out.println("Number not found");
    }
}
