public class App {
    public static void main(String[] args) throws Exception {
        char letter = 'O';

        switch (letter) {
            case 'A' :
            case 'I' :
            case 'O' :
            case 'U' :
                System.out.println("Thick vowel");
                break;
            default:
                System.out.println("Thin vowel");
        }
    }
}
