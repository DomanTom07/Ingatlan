/*
* File: Property.java
* Author: Tamás Domán
* Copyright: 2023, Tamás Domán
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

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
