package views;

import java.util.ArrayList;

import models.Property;

public class MainConsole {

    public MainConsole() {
    }
    public void printProperties(ArrayList<Property> properties) {
        for(Property property : properties) {
            System.out.print(property.getCity() + ", ");
            System.out.print(property.getAddress() + ", ");
            System.out.print(property.getSize() + ", ");
            System.out.print(property.getPrice() + "\n");
        }
    }
}