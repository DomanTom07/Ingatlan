/*
* File: MainController.java
* Author: Tamás Domán
* Copyright: 2023, Tamás Domán
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package controllers;

import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import models.Property;
import models.Restapi;
import views.MainConsole;

public class MainController {
    MainConsole mainConsole;
    public MainController() {
        this.mainConsole = new MainConsole();
        this.printData();
    }
    private void printData() {
        Restapi restapi = new Restapi();
        String res = restapi.getProperties();
        ArrayList<Property> propertyList = convertStringToArray(res);
        this.mainConsole.printProperties(propertyList);
    }

    private ArrayList<Property> convertStringToArray(String text) {
        ArrayList<Property> propertyList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        Property[] propertyArray = gson.fromJson(text, Property[].class);
        propertyList = new ArrayList<>(Arrays.asList(propertyArray));
        return propertyList;
    }
}
