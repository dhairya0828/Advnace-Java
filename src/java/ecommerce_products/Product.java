package ecommerce_products;

public class Product {
    String id,name; 
    double price;
    String descreption; // limited descreption for product 
    int stock ; // Available stock of product

    public Product() {
        id="";
        name="";
        price=0;
        descreption="";
        stock=0;
    }

    public Product(String id, String name, double priductPrice, String productDesc, int stoke) {
        this.id = id;
        this.name = name;
        this.price = priductPrice;
        this.descreption = productDesc;
        this.stock = stoke;
    }

    public String getId() {
        return id;
    }

    public void setId(String productId) {
        this.id = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String productName) {
        this.name = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
