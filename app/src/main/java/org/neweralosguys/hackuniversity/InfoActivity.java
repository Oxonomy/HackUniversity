package org.neweralosguys.hackuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RatingBar;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    public Product Product;
    public String Store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        Product = GlobalValues.currentProduct;
        Store = GlobalValues.currentStore;

        TextView ObjectNameView = (TextView) findViewById(R.id.ObjectNameView);
        ObjectNameView.setText(Product.Name);

        TextView PriceView = (TextView) findViewById(R.id.PriceView);
        PriceView.setText("Цена: " + Product.Price.get(Store));

        TextView CalorieView = (TextView) findViewById(R.id.CalorieView);
        PriceView.setText("Колорийность: " + Product.Calorie);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setRating(Product.Rating);

        TextView CompositionView = (TextView) findViewById(R.id.CompositionView);
        CompositionView.setText(Product.Composition);
    }

}