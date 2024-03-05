public class App {
    public static void main(String[] args) throws Exception {
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println(addVariadic(numbers));
    }

    public static int addVariadic(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
