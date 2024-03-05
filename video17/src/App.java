public class App {
    public static void main(String[] args) throws Exception {
        String[][] cities = new String[3][3];
        cities[0][0] = "New York";
        cities[0][1] = "Los Angeles";
        cities[0][2] = "Chicago";
        cities[1][0] = "Houston";
        cities[1][1] = "Phoenix";
        cities[1][2] = "Philadelphia";
        cities[2][0] = "San Antonio";
        cities[2][1] = "San Diego";
        cities[2][2] = "Dallas";
        
        for (int i = 0; i < cities.length; i++) {
            System.out.println("-----------------");
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }
}
