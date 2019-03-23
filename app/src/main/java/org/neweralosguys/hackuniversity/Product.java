package org.neweralosguys.hackuniversity;

import java.util.ArrayList;
import java.util.Map;

public class Product {
    public final String Name;
    public final Map<String,String> Price;
    public final int Calorie;
    public final float Rating;
    public final String Composition;


    public Product(String name, Map<String,String> price, int calorie, float rating, String composition){
        Name = name;
        Price = price;
        Calorie = calorie;
        Rating = rating;
        Composition = composition;
    }


}
