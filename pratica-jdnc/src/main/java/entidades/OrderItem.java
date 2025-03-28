
package entidades;

public class OrderItem {
    private int quantity;
    private Double price;
    
    private Product product;
    
    private OrderItem(){
        
    }

    public OrderItem(int quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    
    public Double subTotal(){
        return this.quantity * this.product.getPrice();
    }
}
