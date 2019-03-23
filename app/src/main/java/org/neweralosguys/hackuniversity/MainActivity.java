package org.neweralosguys.hackuniversity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchMapActivity(View view) {
        switch (view.getId()) {
            case R.id.changeActivityButton:
                startActivity(new Intent(this, MapActivity.class));
        }
    }
}
