public class Ecommerce {

    int id;
    String name;
    float price;
    final int products = 56;

    public static void main(String[] args) {

        Ecommerce e1 = new Ecommerce();
        Ecommerce e2 = new Ecommerce();

        System.out.println("----Default Values Of Object 1----");
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.price);

        System.out.println("----Default Values Of Object 2----");
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e2.price);

        e1.id = 1544;
        e1.name = "Suncream";
        e1.price = 2255;

        System.out.println("----Values Of Object 1----");
        System.out.println(e1.id);
        System.out.println(e1.name);
        System.out.println(e1.price);
        System.out.println(e1.products);

        e2.id = 2504;
        e2.name = "Handcream";
        e2.price = 1552;

        System.out.println("----Values Of Object 2----");
        System.out.println(e2.id);
        System.out.println(e2.name);
        System.out.println(e2.price);

    }
}
