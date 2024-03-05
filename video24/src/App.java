public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = new int[] { 1, 3, 7, 8, 12 };
        int target = 12;
        boolean result = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

}
