public class TestProduct {
    public static void main(String[] args) {
        InforProduct i1 = new InforProduct("sp1", "Tivi", 15, "Electronic", 29000000);
        System.out.println(i1);
        System.out.println("ID: " +i1.getId() + ", "
                + "Name: " + i1.getName() + ","
                + "Quantity: " + i1.getQuantity() + ", "
                + "Price: " + i1.getPrice());

        InforProduct i2 = new InforProduct("sp2", "Cay lau nha", 6, "House-Lìfe", 439000);
        System.out.println(i2);
        System.out.println("Id: " +i2.getId() + ", "
                + "Name: " + i2.getName() + ","
                + "Quantity: " + i2.getQuantity() + ", "
                + "Price: " + i2.getPrice());
    }
}
