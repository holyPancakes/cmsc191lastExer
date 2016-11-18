package com.exercise3.jollibee;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ProductDetailActivity extends AppCompatActivity {

    public static final String EXTRA_PROD_TYPE = "prodType";
    public static final String EXTRA_PROD_NO= "prodNo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        int prodNo = (Integer) getIntent().getExtras().get(EXTRA_PROD_NO);
        try {
            SQLiteOpenHelper jollibeeDatabaseHelper = new JollibeeDatabaseHelper(this);
            SQLiteDatabase db = jollibeeDatabaseHelper.getReadableDatabase();

            Cursor cursor = db.query("PRODUCT",
                    new String[]{"_id,NAME, DESCRIPTION, IMAGE_RESOURCE_ID"},
                    "_id=?",
                    new String[]{Integer.toString(prodNo)},
                    null, null, null);
            if(cursor.moveToFirst()){
                String nameText = cursor.getString(1);
                String descriptionText = cursor.getString(2);
                int photoId = cursor.getInt(3);

                TextView name = (TextView) findViewById(R.id.name);
                name.setText(nameText);

                TextView description = (TextView) findViewById(R.id.description);
                description.setText(descriptionText);

                ImageView photo = (ImageView) findViewById(R.id.img);
                photo.setImageResource(photoId);
                photo.setContentDescription(nameText);
            }
            Toast toast = Toast.makeText(this, "Database Success", Toast.LENGTH_LONG);
            toast.show();

            cursor.close();
            db.close();

        }
        catch(SQLiteException e){

        }
    }
}
