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
        db.execSQL("CREATE TABLE PRODUCT( " +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "DESCRIPTION TEXT," +
                "IMAGE_RESOURCE_ID INTEGER,"+
                "TYPE TEXT );");
        //populate
        insertProduct(db,"Jolly Hotdog Regular + French Fries + Choice of Drink","Mildly seasoned all-meat hotdog in a warm hotdog roll, garnished with tomato catsup",R.drawable.jhrrfcd,"valueMeal");
        insertProduct(db,"2-pc. Chickenjoy + Choice of Drink","The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside",R.drawable.cj2cd,"valueMeal");
        insertProduct(db,"1-pc. Chickenjoy + Choice of Drink","The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside",R.drawable.cj1cd,"valueMeal");
        insertProduct(db,"1-pc. Chickenjoy with Palabok + Choice of Drink","Your favorite Chickenjoy can also be enjoyed with the classic Palabok Fiesta. Two favorites in one meal!",R.drawable.cj1plcd,"valueMeal");
        insertProduct(db,"Palabok + Choice of Drink","Premium bihon noodle served with a special palabok sauce and toppings of pork chicharon bits, sauteed pork, shrimps, and slices of egg.",R.drawable.plcd,"valueMeal");
        insertProduct(db,"1-pc. Chickenjoy with Jolly Spaghetti + Choice of Drink","Crispylicious, juicylicious Chickenjoy paired with the tastiest and meatiest Jollibee Spaghetti. Two favorites in one meal!",R.drawable.cj1jscd,"valueMeal");
        insertProduct(db,"Jolly Hotdog Cheesy + Choice of Drink","Mildly seasoned all-meat hotdog in a warm hotdog roll, garnished with tomato catsup with optional, slightly tangy, cheese-based topping and livened up with grated cheese.",R.drawable.jhccd,"valueMeal");
        insertProduct(db,"1-pc. Burger Steak + Choice of Drink","100% pure beef patties that come with a hearty serving of our flavorful mushroom gravy and steamed rice",R.drawable.bs1cd,"valueMeal");
        insertProduct(db,"Jollibee Spaghetti + Choice of Drink","Jollibee's sweet style spaghetti sauce-- now the tastiest and meatiest ever from Jollibee! With the chunkiest slices of savory ham and sausages, loaded with ground beef, served over premium quality noodle and topped with lots of cheese. Jollibee Spaghetti - the Spaghettiest!",R.drawable.jscd,"valueMeal");
        insertProduct(db,"Jolly Hotdog Regular + French Fries + Choice of Drink","Mildly seasoned all-meat hotdog in a warm hotdog roll, garnished with tomato catsup.",R.drawable.jhrrfcd,"valueMeal");
        insertProduct(db,"Cheesy Bacon Mushroom Yum + French Fries + Choice of Drink","Pure beef patty with cheese served with our own special burger dressing all in a soft bun.",R.drawable.cbmyrfcd,"valueMeal");
        insertProduct(db,"Adobo Flakes Yum Burger","Your favorite Yum BUrger now topped with an all-time Pinoy favorite: Adobo Flakes in Savory Sauce",R.drawable.af,"valueMeal");
        insertProduct(db,"Adobo Flakes Yum Burger + Sundae Halo-Halo + Choice of Drink","Adobo Flakes Yum Burger + Sundae Halo-Halo + Choice of Drink",R.drawable.afshcd,"valueMeal");
        insertProduct(db,"Chickenjoy with French Fries","Chickenjoy 1pc w Rice + French Fries + Choice of Drink",R.drawable.cj1rfcd,"valueMeal");
        insertProduct(db,"Chickenjoy Super Meal","Enjoy the crispylicious, juicylicious Chickenjoy served with half Jolly Spaghetti, Shanghai Rolls, Rice, and Regular Drink.",R.drawable.cjsm,"valueMeal");
        insertProduct(db,"Chicken Bucket 8pc combination + 4 Choice of Side Dish + 4 Choice of Drink + 4 Extra Rice + 4 Choice of Pie","Chicken Bucket 8pc combination + 4 Choice of Side Dish + 4 Choice of Drink + 4 Extra Rice + 4 Choice of Pie",R.drawable.cb84sd4cd4er4cp,"chicken");
        insertProduct(db,"Family Super Meals: Chicken Bucket 8pc Combination + Spaghetti Family Pan + 4 Choice of Drink","Family Super Meals: Chicken Bucket 8pc Combination + Spaghetti Family Pan  + 4 Choice of Drink",R.drawable.cb8sfp4cd,"chicken");
        insertProduct(db,"Family Super Meals: Chicken Bucket 6pc Combination + Spaghetti Family Pan  + 3 Choice of Drink","Family Super Meals: Chicken Bucket 6pc Combination + Spaghetti Family Pan  + 3 Choice of Drink",R.drawable.cb6sfp3cd,"chicken");
        insertProduct(db,"Chicken Bucket 6pc combination + 3 Choice of Side Dish + 3 Choice of Drink + 3 Extra Rice + 3 Choice of Pie","Chicken Bucket 6pc combination + 3 Choice of Side Dish + 3 Choice of Drink + 3 Extra Rice + 3 Choice of Pie",R.drawable.cb6sd6cd3er3cp3,"chicken");
        insertProduct(db,"8-pc. Chickenjoy Bucket","8-pc. Chickenjoy Bucket",R.drawable.cb8,"chicken");
        insertProduct(db,"6-pc. Chickenjoy Bucket","6-pc. Chickenjoy Bucket",R.drawable.cb6,"chicken");
        insertProduct(db,"2-pc. Chickenjoy","The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside.",R.drawable.cj2,"chicken");
        insertProduct(db,"1-pc. Chickenjoy with Palabok","Your favorite Chickenjoy can also be enjoyed with the classic Palabok Fiesta. Two favorites in one meal!",R.drawable.cj1pl,"chicken");
        insertProduct(db,"Chickenjoy Super Meal","Enjoy the crispylicious, juicylicious Chickenjoy served with half Jolly Spaghetti, Shanghai Rolls, Rice, and Regular Drink.",R.drawable.cjsm,"chicken");
        insertProduct(db,"1-pc. Chickenjoy with Jolly Spaghetti","Crispylicious, juicylicious Chickenjoy paired with the tastiest and meatiest Jollibee Spaghetti. Two favorites in one meal!",R.drawable.cj1js,"chicken");
        insertProduct(db,"1pc. Chickenjoy with French Fries","Chickenjoy 1pc w Rice + French Fries + Choice of Drink",R.drawable.cj1rfcd,"chicken");
        insertProduct(db,"Cheesy Bacon Mushroom Champ","Made with 1/3 pound, 100% pure beef Champ patty, topped with crispy bacon strips, mushrooms and creamy cheese sauce, all in a soft sesame seed bun",R.drawable.cbmc,"burger");
        insertProduct(db,"Champ","Made with 1/3 pound, 100% pure beef Champ patty, garnished with fresh tomato, crisp lettuce, sliced cheese, catsup and mayo dressing, served on a soft sesame seed bun.",R.drawable.c,"burger");
        insertProduct(db,"Adobo Flakes Yum Burger + Sundae Halo-Halo + Choice of Drink","Adobo Flakes Yum Burger + Sundae Halo-Halo + Choice of Drink",R.drawable.afshcd,"burger");
        insertProduct(db,"Yum! Burger Super Meal","Your favorite Jollibee snacks featuring the langhap-sarap Yum! Burger served with half Jolly Spaghetti, Regular Fries, and Regular Drink.",R.drawable.ysm,"burger");
        insertProduct(db,"Jolly Spaghetti w/ 1 pc Sweet-Spicy BBQ Burger Steak Value Meal","Two of your Jollibee favorites in one meal- Jolly Spaghetti with 1 pc Burger Steak topped with Sweet-Spicy BBQ Sauce and corn kernels. Served with regular drink",R.drawable.jsssbs1it,"burger");
        insertProduct(db,"Cheesy Bacon Mushroom Yum Burger","Your favorite Yum patty topped with crispy bacon strips, mushrooms and creamy cheese sauce, served on a soft sesame seed bun.",R.drawable.cbmy,"burger");
        insertProduct(db,"Yum Burger with TLC","Your favorite Yum patty topped with a fresh tomato slice, crisp lettuce, sliced cheese and mayo dressing, served on a soft sesame seed bun.",R.drawable.ytlc,"burger");
        insertProduct(db,"Adobo Flakes Yum Burger","Your favorite Yum BUrger now topped with an all-time Pinoy favorite: Adobo Flakes in Savory Sauce",R.drawable.af,"burger");
        insertProduct(db,"Yum w Cheese","Your favorite Yum patty topped with our special burger dressing and sliced cheese, served on a soft bun.",R.drawable.yc,"burger");
        insertProduct(db,"Yum Burger","Your favorite Yum patty topped with our special burger dressing, served on a soft bun.",R.drawable.y,"burger");
        insertProduct(db,"Big Burger Steak Supreme with Fries","1/3 pound CHAMP patty, served with tasty fries, poured over with mushroom gravy and topped with toasted garlic bits and mushroom slices. Served with sunny side egg on top of steamed rice.",R.drawable.bbss,"riceMeal");
        insertProduct(db,"Burger Steak Sweet - Spicy Super Meal","Yum! Burger patty topped with Sweet-Spicy BBQ sauce and corn kernels, served with half Jolly Spaghetti, Shanghai Rolls, Rice, and Regular Drink",R.drawable.ssbssm,"riceMeal");
        insertProduct(db,"Sweet-Spicy BBQ Big Burger Steak","Made with 100% pure beef Champ patty topped with NEW Sweet-Spicy BBQ Sauce and corn kernels. Served with Steamed Rice.",R.drawable.ssbs1,"riceMeal");
        insertProduct(db,"1-pc. Big Burger Steak with Rice","1/3 pound CHAMP patty, topped with flavorful mushroom gravy and mushroom slices. Served with steamed rice.",R.drawable.bbs1,"riceMeal");
        insertProduct(db,"Jolly Spaghetti w/ 1 pc Burger Steak Value Meal","Two of your Jollibee favorites in one-meal- Jolly Spaghetti with 1 pc Burger Steak topped with Mushroom Gravy and Mushroom Slices. Served with regular drink",R.drawable.jsbs1it,"riceMeal");
        insertProduct(db,"Burger Steak Supreme","100% Pure Beef Yum Patty served with tasty fries, poured over with mushroom gravy and topped with toasted garlic bits and mushroom slices. Served with sunny side egg on top of steamed rice.",R.drawable.bss,"riceMeal");
        insertProduct(db,"1-pc Sweet-Spicy BBQ Burger Steak with 3-pc Shanghai Rolls","Made with 100% pure beef Yum Burger patty topped with NEW Sweet-Spicy BBQ Sauce , corn kernels and served with 3 pcs Shanghai Rolls. Comes with Steamed Rice.",R.drawable.ssbs1sh3,"riceMeal");
        insertProduct(db,"2-pc Burger Steak","Made with 100% pure beef Yum Burger patties topped with mushroom gravy and mushroom slices. Served with steamed rice",R.drawable.bs2,"riceMeal");
        insertProduct(db,"2-pc Sweet-Spicy BBQ Burger Steak","Made with 100% pure beef Yum Burger patties topped with NEW Sweet-Spicy BBQ Sauce and Corn Kernels. Served with Steamed Rice",R.drawable.ssbs2,"riceMeal");
        insertProduct(db,"1-pc. Burger Steak with 3-pc. Shanghai Rolls","A combination of two of Jollibee’s signature rice meals – Burger Steak with 3-pieces of Shanghai Rolls. Served with steamed rice.",R.drawable.bs1sh1,"riceMeal");
        insertProduct(db,"Garlic Pepper Beef","Juicy beef strips, topped with flavorful pepper sauce and garlic bits. Served with steamed rice.",R.drawable.gpb,"riceMeal");
        insertProduct(db,"5-pc. Shanghai Rolls","5 pieces of your favorite crispy-sarap shanghai rolls which comes with sweet and sour sauce. Served with steamed rice.",R.drawable.sh5,"riceMeal");
        insertProduct(db,"1-pc Sweet-Spicy BBQ Burger Steak","Made with 100% pure beef Yum Burger patty topped with NEW Sweet-Spicy BBQ Sauce and Corn Kernels. Served with Steamed Rice",R.drawable.ssbs1,"riceMeal");
        insertProduct(db,"1-pc. Burger Steak","Made with 100% pure beef Yum Burger patty topped with mushroom gravy and mushroom slices. Served with steamed rice",R.drawable.bs1,"riceMeal");
        insertProduct(db,"Jolly Spaghetti Family Pan","Your favorite Cheesiest, Meatiest, and Spaghettiest Jolly Spaghetti served in a family pan good for 4-5.",R.drawable.jsfp,"noodle");
        insertProduct(db,"1-pc. Chickenjoy with Palabok","Your favorite Chickenjoy can also be enjoyed with the classic Palabok Fiesta. Two favorites in one meal!",R.drawable.cj1pl,"noodle");
        insertProduct(db,"1-pc. Chickenjoy with Jolly Spaghetti","Crispylicious, juicylicious Chickenjoy paired with the tastiest and meatiest Jollibee Spaghetti. Two favorites in one meal!",R.drawable.cj1js,"noodle");
        insertProduct(db,"Jolly Spaghetti w/ 1 pc Burger Steak Value Meal","Two of your Jollibee favorites in one-meal- Jolly Spaghetti with 1 pc Burger Steak topped with Mushroom Gravy and Mushroom Slices. Served with regular drink",R.drawable.jsbs1it,"noodle");
        insertProduct(db,"Jolly Spaghetti w/ 1 pc Sweet-Spicy BBQ Burger Steak Value Meal","Two of your Jollibee favorites in one meal- Jolly Spaghetti with 1 pc Burger Steak topped with Sweet-Spicy BBQ Sauce and corn kernels. Served with regular drink",R.drawable.jsssbs1it,"noodle");
        insertProduct(db,"Palabok Fiesta","Premium bihon noodles served with a special palabok sauce and toppings of pork chicharon bits, sauteed pork, shrimps, and slices of egg.",R.drawable.pl,"noodle");
        insertProduct(db,"Jolly Spaghetti with Yum","Your favorite Jollibee Spaghetti – sweet-style spaghetti sauce with premium noodle topped with chunky slices of savory ham and sausages and lots of cheese – goes well with the juicy, langhap-sarap Jollibee Yum made with 100% pure beef.",R.drawable.jsy,"noodle");
        insertProduct(db,"Jolly Spaghetti with Crispy Fries","Jolly Spaghetti with Crispy Fries",R.drawable.jsrfcd,"noodle");
        insertProduct(db,"Jolly Spaghetti","Jollibee's sweet style spaghetti sauce-- now the tastiest and meatiest ever from Jollibee! With the chunkiest slices of savory ham and sausages, loaded with ground beef, served over premium quality noodle and topped with lots of cheese. Jollibee Spaghetti - the Spaghettiest!",R.drawable.js,"noodle");
        insertProduct(db,"Jolly Hotdog Chili Cheese","The Chili Cheese Jolly Hotdog is your favorite hotdog sandwich topped with meaty chili and cheese sauce!",R.drawable.jhcc,"sandwichAndSide");
        insertProduct(db,"Jolly Hotdog Cheesy","The Cheesy Classic Jolly Hotdog is your favorite hotdog sandwich topped with special hotdog dressing, grated cheese, and ketchup!",R.drawable.jhc,"sandwichAndSide");
        insertProduct(db,"Creamy Macaroni Soup","Creamy Macaroni Soup",R.drawable.cms,"sandwichAndSide");
        insertProduct(db,"Jolly Crispy Fries","Light to golden brown crispy potato strips, made from choice potatoes.",R.drawable.rf,"sandwichAndSide");
        insertProduct(db,"Mashed Potato","Mashed Potato",R.drawable.mp,"sandwichAndSide");
        insertProduct(db,"Buttered Corn","Buttered Corn",R.drawable.bc,"sandwichAndSide");
        insertProduct(db,"Peach Mango Pie","Golden brown, flaky, slightly sweet crust with a pleasant blend of diced peaches and mango filling in thick sauce.",R.drawable.pmp,"sandwichAndSide");
        insertProduct(db,"Breakfast Chickenjoy","Your favorite crispylicious, juicylicious Chickenjoy now served with garlic rice and fried egg.",R.drawable.bcj1,"breakfastJoy");
        insertProduct(db,"Longganisa","A delicious combination of garlic rice, fried egg, and mildly seasoned longganisa. Product only available for delivery until 11am.",R.drawable.ln,"breakfastJoy");
        insertProduct(db,"Beef Tapa","A delicious combination of garlic rice, fried egg, and tender beef tapa. Product only available for delivery until 11am.",R.drawable.bt,"breakfastJoy");
        insertProduct(db,"Corned Beef","A delicious combination of garlic rice, fried egg, and juicy corned beef. Product only available for delivery until 11am.",R.drawable.cb,"breakfastJoy");
        insertProduct(db,"Hotdog","A delicious combination of garlic rice, fried egg, and meaty hotdog. Product only available for delivery until 11am.",R.drawable.hd,"breakfastJoy");
        insertProduct(db,"Breakfast Steak","A delicious combination of garlic rice, fried egg and gravy-poured breakfast steak. Product only available for delivery until 11am.",R.drawable.bfs,"breakfastJoy");
        insertProduct(db,"Bacon, Egg and Cheese Pancake Sandwich","Crispy bacon, fried egg, and cheese all in a pancake sandwich!",R.drawable.becps,"breakfastJoy");
        insertProduct(db,"2-pc. Pancakes","2-piece moist pancakes served with butter and maple syrup. Product only available for delivery until 11am.",R.drawable.pc2,"breakfastJoy");
        insertProduct(db,"Egg and Cheese Pancake Sandwich","Fried egg and cheese all in a pancake sandwich!",R.drawable.ecps,"breakfastJoy");
        insertProduct(db,"Pineapple Juice","Juice Pineapple",R.drawable.pj,"dessertAndDrink");
        insertProduct(db,"Nestea Iced Tea","Nestea Iced Tea",R.drawable.it,"dessertAndDrink");
        insertProduct(db,"Sundae Mix-ins Hersheys Kisses","Delicious Jollibee vanilla soft serve, mixed with crushed cookies and Hershey's Kisses.",R.drawable.smhk,"dessertAndDrink");
        insertProduct(db,"Halo-Halo Sundae","Creamy Jollibee vanilla soft serve topped with a delightful mix of sweet Filipino favorite toppings.",R.drawable.hs,"dessertAndDrink");
        insertProduct(db,"Softdrinks","Softdrinks",R.drawable.sd,"dessertAndDrink");
        insertProduct(db,"Hot Chocolate","Hot Chocolate",R.drawable.hc,"dessertAndDrink");
        insertProduct(db,"Coffee","Coffee",R.drawable.cf,"dessertAndDrink");
        insertProduct(db,"Chocolate Sundae","Creamy soft serve topped with luxurious chocolate fudge.",R.drawable.cs,"dessertAndDrink");
        insertProduct(db,"Jollibee Float","Jollibee Float Drinks",R.drawable.jf,"dessertAndDrink");
        insertProduct(db,"Fruity Float Watermelon","Fruity Float Watermelon",R.drawable.ffw,"dessertAndDrink");
        insertProduct(db,"FruityFloat Blueberry","FruityFloat Blueberry",R.drawable.ffw,"dessertAndDrink");
        insertProduct(db,"Banana Langka Pie","Banana Langka Pie",R.drawable.blp,"dessertAndDrink");
        insertProduct(db,"Extra Garlic Rice","Extra order of garlic rice Product only available for delivery until 11am.",R.drawable.egr,"addOn");
        insertProduct(db,"Extra Rice","Extra order of plain rice",R.drawable.er,"addOn");
        insertProduct(db,"Extra Gravy for Burgersteak","Extra Gravy for Burgersteak",R.drawable.egbs,"addOn");
        insertProduct(db,"Extra Gravy for Chickenjoy","Extra order of Chickenjoy Gravy",R.drawable.egcj,"addOn");
        insertProduct(db,"Extra Maple Syrup","Extra Maple Syrup",R.drawable.ems,"addOn");
        insertProduct(db,"Kiddie Meal: Chickenjoy 1-pc. w Rice + Choice of Drink + Choice of Toy","The Best Fried Chicken! Crispylicious, Juicylicious! Jollibee's perfectly seasoned fried chicken that's crispy on the outside; tender and juicy on the inside.",R.drawable.cj1cd,"kiddieMeal");
        insertProduct(db,"Kiddie Meal: Yum + Choice of Drink + Choice of Toy","Kiddie Meal: Yum + Choice of Drink + Choice of Toy",R.drawable.kmycdct,"kiddieMeal");
        insertProduct(db,"Kiddie Meal: Jolly Spaghetti + Choice of Drink + Choice of Toy","Kiddie Meal: Jolly Spaghetti + Choice of Drink + Choice of Toy",R.drawable.kmjscdct,"kiddieMeal");

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
