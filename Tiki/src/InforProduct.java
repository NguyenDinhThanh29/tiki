public class InforProduct extends Product{
    private int quantity;
    private String category;
    private int price;
    public InforProduct(){
        super();
        this.quantity=quantity;
        this.category=category;
        this.price=price;
    }
    public InforProduct(String id, String name, int quantity, String category, int price){
        super(id, name);
        this.quantity=quantity;
        this.category=category;
        this.price=price;
    }
    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString()+ "qty: " + quantity + ", category:" + category + ", price: " + price;
    }
}
