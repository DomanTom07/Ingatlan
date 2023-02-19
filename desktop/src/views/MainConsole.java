/*
* File: MainConsole.java
* Author: Tamás Domán
* Copyright: 2023, Tamás Domán
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

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