public class App {
    public static void main(String[] args) throws Exception {
        int a = 24;
        int b = 25;
        int c = 2;
        int greatest = a;
        if (greatest < b) {
            greatest = b;
        }
        if (greatest < c) {
            greatest = c;
        }
        System.out.println("The greatest number is " + greatest);
    }
}
