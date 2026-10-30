package uk.ac.westminster.products_api;

public class Product {

        private Long id;
        private String name;
        private double price;

        public Product (){}





    public Product(long id, String name, double price){
            this.id = id;
            this.name = name;
            this.price = price;
        }

//        GETTERS
    public Long getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
//    SETTERS
    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

