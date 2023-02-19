package models;

public class Property {
    String city;
    String address;
    double size;
    double price;
    public Property(String city, String address, double size, double price) {
        this.city = city;
        this.address = address;
        this.size = size;
        this.price = price;
    }
    public String getCity() {
        return city;
    }
    public String getAddress() {
        return address;
    }
    public double getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }
}
