package org.neweralosguys.hackuniversity;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class ProductBasketActivity extends AppCompatActivity {

    public static ArrayList<String> names = new ArrayList();
    ListView basketProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_basket);
        GlobalValues.ProductBasketActivity = this;
        GlobalValues.onCreate();
        ProductHelper.load();


        // находим список
        basketProducts = (ListView) findViewById(R.id.basketProducts);

        for (Product p: GlobalValues.BasketProducts)
            names.add(p.Name);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, names);

        // присваиваем адаптер списку
        basketProducts.setAdapter(adapter);


    }

    public void addProduct(View view) {
        startActivity(new Intent(this, ProductListActivity.class));


    }

    public void UpdateBasketProducts(){
        HashMap<String, Integer> shops = new HashMap<>();
        shops.put("Сити Молл", 0);
        shops.put("АШАН", 0);
        shops.put("2 шага", 0);

        for (Product p: GlobalValues.BasketProducts){
            for (String s: p.Price.keySet() )
                shops.put(s, shops.get(s)+1);
        }
        int maxBasket = 0;
        for (String s: shops.keySet() )
            if (maxBasket < shops.get(s)){
                maxBasket = shops.get(s);
                GlobalValues.currentStore = s;
            }
        float sum = 0;
        for (Product p: GlobalValues.BasketProducts){
            sum += Float.parseFloat(p.Price.get(GlobalValues.currentStore));
        }


        names = new ArrayList();
        for (Product p: GlobalValues.BasketProducts)
            names.add(p.Name + " \t " + p.Price.get(GlobalValues.currentStore));
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, names);

        Log.d("itemClick", "itemClick: id = " + names);
        // присваиваем адаптер списку
        basketProducts.setAdapter(adapter);
    }

    public void launchMapActivity(View view) {
        switch (view.getId()) {
            case R.id.showMap:
                startActivity(new Intent(this, MapActivity.class));
        }
    }


}
