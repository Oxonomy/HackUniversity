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
        GlobalValues.onCreate();


        // находим список
        ListView lvMain = (ListView) findViewById(R.id.productList);

        for (Product p: GlobalValues.AllProducts)
            names.add(p.Name);
        Log.d("itemClick", "itemClick:  = " + GlobalValues.currentProduct);
        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, names);

        // присваиваем адаптер списку
        lvMain.setAdapter(adapter);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("itemClick", "itemClick: position = " + position + ", id = "
                        + id);
            }
        });
    }
}
