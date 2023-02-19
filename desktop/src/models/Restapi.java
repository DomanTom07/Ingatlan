/*
* File: Restapi.java
* Author: Tamás Domán
* Copyright: 2023, Tamás Domán
* Group: Szoft II N
* Date: 2023-02-19
* Github: https://github.com/DomanTom07/
* Licenc: GNU GPL
*/

package models;

public class Restapi {
    public Restapi() {
    }
    public String getProperties() {        
        HttpClient http = new HttpClient();        
        String host = "http://[::1]:3000/";
        String endpoint = "properties";
        String urlStr = host + endpoint;        
        String res = http.get(urlStr);
        return res;
    }
}
