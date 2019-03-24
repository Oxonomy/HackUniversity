package org.neweralosguys.hackuniversity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProductBasketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_basket);
    }

    public void addProduct(View view) {
        startActivity(new Intent(this, ProductListActivity.class));
    }
}
