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

public class ProductBasketActivity extends AppCompatActivity {

    public static ArrayList<String> names = new ArrayList();
    ListView basketProducts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_basket);
        GlobalValues.ProductBasketActivity = this;
        GlobalValues.onCreate();


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
        names = new ArrayList();


        for (Product p: GlobalValues.BasketProducts)
            names.add(p.Name);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, names);

        // присваиваем адаптер списку
        basketProducts.setAdapter(adapter);
    }


}
