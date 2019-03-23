package org.neweralosguys.hackuniversity;

import java.util.ArrayList;
import java.util.Map;

public class Product {
    public  String Name;
    public  Map<String,String> Price;
    public  String Calorie;
    public  float Rating;
    public  String Composition;


    public Product(String name, Map<String,String> price, String calorie, float rating, String composition){
        Name = name;
        Price = price;
        Calorie = calorie;
        Rating = rating;
        Composition = composition;
    }

}
