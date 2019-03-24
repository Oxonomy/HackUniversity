package org.neweralosguys.hackuniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {
    public static ArrayList<String> names = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);



        // находим список
        ListView lvMain = (ListView) findViewById(R.id.productList);

        names = new ArrayList();
        for (Product p: GlobalValues.AllProducts)
            names.add(p.Name);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, names);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                GlobalValues.BasketProducts.add(GlobalValues.AllProducts.get((int)id));
                Log.d("itemClick", "itemClick: id = " + id + ' ' + GlobalValues.BasketProducts);
                GlobalValues.ProductBasketActivity.UpdateBasketProducts();
            }
        });
    }
}
