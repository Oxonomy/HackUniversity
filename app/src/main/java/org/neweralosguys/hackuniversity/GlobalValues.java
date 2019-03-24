package org.neweralosguys.hackuniversity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GlobalValues {
    public static Product currentProduct = null;
    public static String currentStore = "";

    public static ArrayList<Product> AllProducts = new ArrayList();
    public static ArrayList<Product> BasketProducts = new ArrayList();

    public static ProductBasketActivity ProductBasketActivity;

    public static void onCreate()
    {

    }


}
