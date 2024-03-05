public class App {
    public static void main(String[] args) throws Exception {

        String[] students = new String[3];
        students[0] = "John";
        students[1] = "Jane";
        students[2] = "Joe";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (String student : students) {
            System.out.println(student);
        }

    }
}
