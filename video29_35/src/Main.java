public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Black", "ASUS123");
        
        product.setId(1);
        System.out.println(product.getId());
        product.setName("Laptop");
        System.out.println(product.getName());
        product.setDescription("Asus Laptop");
        System.out.println(product.getDescription());
        product.setPrice(5000);
        System.out.println(product.getPrice());
        product.setStockAmount(3);
        System.out.println(product.getStockAmount());
        product.setColor("Black");
        System.out.println(product.getColor());
        product.setCode("ASUS123");
        System.out.println(product.getCode());

    }

}