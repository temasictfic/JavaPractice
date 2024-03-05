public class App {
    public static void main(String[] args) throws Exception {
        double[] myList = {1.9, 2.9, 3.4, 3.5};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("Total is " + total);
        System.out.println("Max is " + max);
    }
}
