package ca.nbcc.shoppinglist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView txtItemOne;
    private TextView txtItemTwo;
    private TextView txtItemThree;
    private TextView txtItemFour;
    private TextView txtItemFive;
    private TextView txtItemSix;
    private TextView txtItemSeven;
    private TextView txtItemEight;
    private TextView txtItemNine;
    private TextView txtItemTen;

    public static final String MyPREFERENCES = "MyPrefs";
    public static final String Cheese = "cheese";
    public static final String Rice = "rice";
    public static final String Apples = "apples";
    public static final String Eggs = "eggs";
    public static final String Cereal = "cereal";
    public static final String Lettuce = "lettuce";
    public static final String Bread = "bread";
    public static final String Corn = "corn";
    public static final String Bacon = "bacon";
    public static final String Oranges = "oranges";

    SharedPreferences sharedpreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        Intent intentTwo = getIntent();
        Intent intentThree = getIntent();
        Intent intentFour = getIntent();
        Intent intentFive = getIntent();
        Intent intentSix = getIntent();
        Intent intentSeven = getIntent();
        Intent intentEight = getIntent();
        Intent intentNine = getIntent();
        Intent intentTen = getIntent();

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        int count = sharedpreferences.getInt("COUNT", 0);
        int countTwo = sharedpreferences.getInt("COUNT_TWO", 0);
        int countThree = sharedpreferences.getInt("COUNT_THREE", 0);
        int countFour = sharedpreferences.getInt("COUNT_FOUR", 0);
        int countFive = sharedpreferences.getInt("COUNT_FIVE", 0);
        int countSix = sharedpreferences.getInt("COUNT_SIX", 0);
        int countSeven = sharedpreferences.getInt("COUNT_SEVEN", 0);
        int countEight = sharedpreferences.getInt("COUNT_EIGHT", 0);
        int countNine = sharedpreferences.getInt("COUNT_NINE", 0);
        int countTen = sharedpreferences.getInt("COUNT_TEN", 0);

        Bundle bundle = intent.getExtras();

        Bundle bundleTwo = intentTwo.getExtras();
        Bundle bundleThree = intentThree.getExtras();
        Bundle bundleFour = intentFour.getExtras();
        Bundle bundleFive = intentFive.getExtras();
        Bundle bundleSix = intentSix.getExtras();
        Bundle bundleSeven = intentSeven.getExtras();
        Bundle bundleEight = intentEight.getExtras();
        Bundle bundleNine = intentNine.getExtras();
        Bundle bundleTen = intentTen.getExtras();

        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putInt("COUNT", count);
        editor.putInt("COUNT_TWO", countTwo);
        editor.putInt("COUNT_THREE", countThree);
        editor.putInt("COUNT_FOUR", countFour);
        editor.putInt("COUNT_FIVE", countFive);
        editor.putInt("COUNT_SIX", countSix);
        editor.putInt("COUNT_SEVEN", countSeven);
        editor.putInt("COUNT_EIGHT", countEight);
        editor.putInt("COUNT_NINE", countNine);
        editor.putInt("COUNT_TEN", countTen);

        txtItemOne = (TextView) findViewById(R.id.txtItemOne);
        txtItemTwo = (TextView) findViewById(R.id.txtItemTwo);
        txtItemThree = (TextView) findViewById(R.id.txtItemThree);
        txtItemFour = (TextView) findViewById(R.id.txtItemFour);
        txtItemFive = (TextView) findViewById(R.id.txtItemFive);
        txtItemSix = (TextView) findViewById(R.id.txtItemSix);
        txtItemSeven = (TextView) findViewById(R.id.txtItemSeven);
        txtItemEight = (TextView) findViewById(R.id.txtItemEight);
        txtItemNine = (TextView) findViewById(R.id.txtItemNine);
        txtItemTen = (TextView) findViewById(R.id.txtItemTen);

        //if the bundle is not empty set the txtItems
        if (bundle != null) {

            String itemOne = (String) bundle.get("cheese");
            editor.putString(Cheese, itemOne);

            txtItemOne.setText(count + " " + itemOne);
            count++;

            if (itemOne == null) {
                txtItemOne.setVisibility(TextView.INVISIBLE);
            }
        }
        if (bundleTwo != null) {
            String itemTwo = (String) bundleTwo.get("rice");
            editor.putString(Rice, itemTwo);

            txtItemTwo.setText(countTwo + " " + itemTwo);
            countTwo++;

            if (itemTwo == null) {

                txtItemTwo.setVisibility(TextView.INVISIBLE);
            }


            if (bundleThree != null) {
                String itemThree = (String) bundle.get("apples");
                editor.putString(Apples, itemThree);

                txtItemThree.setText(countThree + " " + itemThree);
                countThree++;

            } else {
                txtItemThree.setVisibility(TextView.INVISIBLE);
            }

            if (bundleFour != null) {
                String itemFour = (String) bundle.get("eggs");
                editor.putString(Eggs, itemFour);
                countFour++;

                txtItemFour.setText(countFour + " " + itemFour);
            } else {
                txtItemFour.setVisibility(TextView.INVISIBLE);
            }

            if (bundleFive != null) {
                String itemFive = (String) bundle.get("cereal");
                editor.putString(Cereal, itemFive);
                countFive++;

                txtItemFive.setText(countFive + " " + itemFive);
            } else {
                txtItemFive.setVisibility(TextView.INVISIBLE);
            }

            if (bundleSix != null) {
                String itemSix = (String) bundle.get("lettuce");
                editor.putString(Lettuce, itemSix);
                countSix++;

                txtItemSix.setText(countSix + " " + itemSix);
            } else {
                txtItemSix.setVisibility(TextView.INVISIBLE);
            }

            if (bundleSeven != null) {
                String itemSeven = (String) bundle.get("bread");
                editor.putString(Bread, itemSeven);
                countSeven++;

                txtItemSeven.setText(countSeven + " " + itemSeven);
            } else {
                txtItemSeven.setVisibility(TextView.INVISIBLE);
            }

            if (bundleEight != null) {
                String itemEight = (String) bundle.get("bacon");
                editor.putString(Bacon, itemEight);

                txtItemEight.setText(countEight + " " + itemEight);
                countEight++;
            } else {
                txtItemEight.setVisibility(TextView.INVISIBLE);
            }

            if (bundleNine != null) {
                String itemNine = (String) bundle.get("corn");
                editor.putString(Corn, itemNine);
                countNine++;

                txtItemNine.setText(countNine + " " + itemNine);
            } else {
                txtItemNine.setVisibility(TextView.INVISIBLE);
            }

            if (bundleTen != null) {
                String itemTen = (String) bundle.get("oranges");
                editor.putString(Oranges, itemTen);
                countTen++;

                txtItemTen.setText(countTen + " " + itemTen);
            } else {
                txtItemTen.setVisibility(TextView.INVISIBLE);
            }

            editor.commit();
            editor.apply();
        }

    }

    //opens activity items
    public void openItems(View view) {
        Intent intent = new Intent(MainActivity.this, ShoppingItems.class);
        startActivity(intent);
    }

}


