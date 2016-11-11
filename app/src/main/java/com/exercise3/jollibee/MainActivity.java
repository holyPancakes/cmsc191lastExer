package com.exercise3.jollibee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id){
                        Intent intent = new Intent(MainActivity.this, ProductCatActivity.class);
                        switch(position){
                            case 0:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"valueMeal");
                                break;
                            case 1:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"chicken");
                                break;
                            case 2:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"burger");
                                break;
                            case 3:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"riceMeal");
                                break;
                            case 4:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"noodle");
                                break;
                            case 5:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"sandwichAndSide");
                                break;
                            case 6:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"breakfastJoy");
                                break;
                            case 7:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"dessertAndDrink");
                                break;
                            case 8:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"addOn");
                                break;
                            case 9:
                                intent.putExtra(ProductCatActivity.EXTRA_PROD_TYPE,"kiddieMeal");
                                break;
                        }
                        startActivity(intent);
                    }
                };

        ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setOnItemClickListener(itemClickListener);
    }
}
