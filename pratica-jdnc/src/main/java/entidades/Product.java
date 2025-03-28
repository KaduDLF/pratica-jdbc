
package entidades;


public class Product {
    private String name;
    private Double price;
    
    public Product(){
        
    }
    public Product(String nome, Double price){
        this.name = nome;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
}
