public class App {
    public static void main(String[] args) throws Exception {
        String message = "Today weathers is very good in ";
        String newMessage = giveCity(message);
        System.out.println(newMessage);
        int result = multiply(2, 3);
        System.out.println(result);

    }

    public static void add() {
        System.out.println("Add method");
    }

    public static void sub() {
        System.out.println("Sub method");
    }

    public static void update() {
        System.out.println("Update method");
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String giveCity(String message) {
        return message + "Ankara";
    }
}
