package com.exercise3.jollibee;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class JollibeeDatabaseHelper extends SQLiteOpenHelper{
    private static final String DB_NAME = "jollibbee";
    private static final int DB_VERSION = 2;

    JollibeeDatabaseHelper(Context context){
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE PRODUCT(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "DESCRIPTION TEXT," +
                "IMAGE_RESOURCE_ID INTEGER,"+
                "TYPE TEXT);");
        //populate
        insertProduct(db,"Jolly Hotdog Regular + French Fries + Choice of Drink","Mildly seasoned all-meat hotdog in a warm hotdog roll, garnished with tomato catsup",R.drawable.jhrrfcd,"valueMeal");
        insertProduct(db,"2-pc. Chickenjoy + Choice of Drink","The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside",R.drawable.cj2cd,"valueMeal");
        insertProduct(db,"1-pc. Chickenjoy + Choice of Drink","The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside",R.drawable.cj1cd,"valueMeal");
        insertProduct(db,"1-pc. Chickenjoy with Palabok + Choice of Drink","Your favorite Chickenjoy can also be enjoyed with the classic Palabok Fiesta. Two favorites in one meal!",R.drawable.cj1plcd,"valueMeal");
        insertProduct(db,"Palabok + Choice of Drink","Premium bihon noodles served with a special palabok sauce and toppings of pork chicharon bits, sauteed pork, shrimps, and slices of egg.",R.drawable.plcd,"valueMeal");
        insertProduct(db,"1-pc. Chickenjoy with Jolly Spaghetti + Choice of Drink","Crispylicious, juicylicious Chickenjoy paired with the tastiest and meatiest Jollibee Spaghetti. Two favorites in one meal!",R.drawable.cj1jscd,"valueMeal");
        insertProduct(db,"Jolly Hotdog Cheesy + Choice of Drink","Mildly seasoned all-meat hotdog in a warm hotdog roll, garnished with tomato catsup with optional, slightly tangy, cheese-based topping and livened up with grated cheese.",R.drawable.jhccd,"valueMeal");
        insertProduct(db,"1-pc. Burger Steak + Choice of Drink","100% pure beef patties that come with a hearty serving of our flavorful mushroom gravy and steamed rice",R.drawable.bs1cd,"valueMeal");
        insertProduct(db,"Jollibee Spaghetti + Choice of Drink","Jollibee's sweet style spaghetti sauce-- now the tastiest and meatiest ever from Jollibee! With the chunkiest slices of savory ham and sausages, loaded with ground beef, served over premium quality noodles and topped with lots of cheese. Jollibee Spaghetti - the Spaghettiest!",R.drawable.jscd,"valueMeal");
        insertProduct(db,"Jolly Hotdog Regular + French Fries + Choice of Drink","Mildly seasoned all-meat hotdog in a warm hotdog roll, garnished with tomato catsup.",R.drawable.jhrrfcd,"valueMeal");
        insertProduct(db,"Cheesy Bacon Mushroom Yum + French Fries + Choice of Drink","Pure beef patty with cheese served with our own special burger dressing all in a soft bun.",R.drawable.cbmyrfcd,"valueMeal");
        insertProduct(db,"Adobo Flakes Yum Burger","Your favorite Yum BUrger now topped with an all-time Pinoy favorite: Adobo Flakes in Savory Sauce",R.drawable.af,"valueMeal");
        insertProduct(db,"Adobo Flakes Yum Burger + Sundae Halo-Halo + Choice of Drink","Adobo Flakes Yum Burger + Sundae Halo-Halo + Choice of Drink",R.drawable.afshcd,"valueMeal");
        insertProduct(db,"Chickenjoy with French Fries","Chickenjoy 1pc w Rice + French Fries + Choice of Drink",R.drawable.cj1rfcd,"valueMeal");
        insertProduct(db,"Chickenjoy Super Meal","Enjoy the crispylicious, juicylicious Chickenjoy served with half Jolly Spaghetti, Shanghai Rolls, Rice, and Regular Drink.",R.drawable.cjsm,"valueMeal");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        if(oldVersion == 1){

        }
        else if(oldVersion < 3){

        }
    }

    public void insertProduct(SQLiteDatabase db, String name, String description, int resourceId, String type){
        ContentValues productValues = new ContentValues();
        productValues.put("NAME", name);
        productValues.put("DESCRIPTION", description);
        productValues.put("IMAGE_RESOURCE_ID", resourceId);
        productValues.put("TYPE",type);
        db.insert("PRODUCT", null, productValues);
    }


}
