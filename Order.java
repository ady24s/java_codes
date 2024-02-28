class Product {
    private String pname;
    private int id;
    private int price;

    public String getName() {
        return pname;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public int getId() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Customer {
    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}

public class Order {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setCname("John Doe");

        Product product1 = new Product();
        product1.setName("Product 1");
        product1.setid(101);
        product1.setPrice(100);

        System.out.println("---BILL---");
        System.out.println(" ");

        System.out.println(customer.getCname());
        System.out.println(product1.getName());
        System.out.println(product1.getId());
        System.out.println(product1.getPrice());

        System.out.println(" ");

        Product product2 = new Product();
        product2.setName("Product 2");
        product2.setid(102);
        product2.setPrice(200);

        System.out.println(product2.getName());
        System.out.println(product2.getId());
        System.out.println(product2.getPrice());
    }
}
