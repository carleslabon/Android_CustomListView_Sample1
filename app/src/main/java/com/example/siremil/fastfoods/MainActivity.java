package com.example.siremil.fastfoods;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] fastFoods = {
                "Jollibee",
                "McDonalds",
                "KFC",
                "Chowking",
                "Wendys"
        };

        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fastFoods);
        ListView fastFoodListView = (ListView) findViewById(R.id.fastFoodListView);
        fastFoodListView.setAdapter(adapter);

        fastFoodListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String fastFood = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this, fastFood, Toast.LENGTH_LONG).show();
                    }
                }
        );

    }

}