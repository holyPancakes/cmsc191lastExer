package com.exercise3.jollibee;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.View;
import android.widget.ListView;

public class ProductCatActivity extends ListActivity {


    private SQLiteDatabase db;
    private Cursor cursor;

    public static final String EXTRA_PROD_TYPE = "prodType";
    private String prodType = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();

        this.prodType = (String) getIntent().getExtras().get(EXTRA_PROD_TYPE);
        CursorAdapter listAdapter;

        SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
        db = jollibeeDatabaseHelper.getReadableDatabase();

        cursor = db.query("PRODUCT",
                new String[]{"_id","NAME","TYPE"},
                "TYPE=?",
                new String[]{this.prodType},
                null, null, null);

        listAdapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_1,
                cursor,
                new String[]{"NAME"},
                new int[] {android.R.id.text1},
                0);
        listView.setAdapter(listAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View itemView, int position, long id){
        Intent intent = new Intent(ProductCatActivity.this, ProductDetailActivity.class);
        intent.putExtra(ProductDetailActivity.EXTRA_PROD_TYPE, this.prodType);
        intent.putExtra(ProductDetailActivity.EXTRA_PROD_NO, (int)id);
        startActivity(intent);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        cursor.close();
        db.close();
    }
}