public class App {
    public static void main(String[] args) throws Exception {
        String message = "Today weather is very good!";
        System.out.println(message);

        System.out.println("Element count: " + message.length());
        System.out.println("5th element: " + message.charAt(4));
        System.out.println(message.concat(" Yeyy!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("!"));

        char[] characters = new char[5];
        message.getChars(0, 5, characters, 0);
        System.out.println(characters);
        System.out.println(message.indexOf("ea"));
        System.out.println(message.lastIndexOf("e"));

    }
}
