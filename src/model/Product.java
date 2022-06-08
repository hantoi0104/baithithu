package model;

public class Product {
    private int idProduct;
    private String name;
    private  float price;
    private int quantity;
    private String dis;

    public Product() {
    }

    public Product( String name,int idProduct, float price, int quantity, String dis) {
        this.name = name;
        this.idProduct = idProduct;
        this.price = price;
        this.quantity = quantity;
        this.dis = dis;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String write(){
        return idProduct +", " + name +", " +price +", " +
                quantity +", " + dis;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", dis='" + dis + '\'' +
                '}';
    }
}
