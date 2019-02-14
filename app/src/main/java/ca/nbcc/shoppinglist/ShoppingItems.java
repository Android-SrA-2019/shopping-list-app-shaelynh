package ca.nbcc.shoppinglist;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ShoppingItems  extends AppCompatActivity {


    private Button btnCheese, btnRice, btnApples, btnEggs, btnCereal, btnLettuce, btnBread,
    btnCorn, btnBacon, btnOranges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        btnCheese = (Button) findViewById(R.id.btnCheese);
        btnRice = (Button) findViewById(R.id.btnRice);
        btnApples = (Button) findViewById(R.id.btnApples);
        btnEggs = (Button) findViewById(R.id.btnEggs);
        btnCereal = (Button) findViewById(R.id.btnCereal);
        btnLettuce = (Button) findViewById(R.id.btnLettuce);
        btnBread = (Button) findViewById(R.id.btnBread);
        btnBacon = (Button) findViewById(R.id.btnBacon);
        btnCorn = (Button) findViewById(R.id.btnCorn);
        btnOranges = (Button) findViewById(R.id.btnOranges);



        btnCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               //send data to main activity
                Intent intent = new Intent(ShoppingItems.this, MainActivity.class);
                intent.putExtra("cheese", "Cheese");

                startActivity(intent);
    toastMessage("Starting intent" + intent);

            }
        });

        btnRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentTwo = new Intent(ShoppingItems.this, MainActivity.class);
                intentTwo.putExtra("rice", "Rice");

                startActivity(intentTwo);

            }
        });

        btnApples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentThree = new Intent(ShoppingItems.this, MainActivity.class);
                intentThree.putExtra("apples", "Apples");

                startActivity(intentThree);

            }
        });

        btnEggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentFour = new Intent(ShoppingItems.this, MainActivity.class);
                intentFour.putExtra("eggs", "Eggs");
                startActivity(intentFour);

            }
        });

        btnCereal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intentFive = new Intent(ShoppingItems.this, MainActivity.class);
                intentFive.putExtra("cereal", "Cereal");
                startActivity(intentFive);

            }
        });

        btnLettuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentSix = new Intent(ShoppingItems.this, MainActivity.class);
                intentSix.putExtra("lettuce", "Lettuce");
                startActivity(intentSix);

            }
        });

        btnBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentSeven = new Intent(ShoppingItems.this, MainActivity.class);
                intentSeven.putExtra("bread", "Bread");
                startActivity(intentSeven);

            }
        });

        btnBacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentEight = new Intent(ShoppingItems.this, MainActivity.class);
                intentEight.putExtra("bacon", "Bacon");
                startActivity(intentEight);

            }
        });

        btnCorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentNine = new Intent(ShoppingItems.this, MainActivity.class);
                intentNine.putExtra("corn", "Corn");
                startActivity(intentNine);

            }
        });

        btnOranges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentTen = new Intent(ShoppingItems.this, MainActivity.class);
                intentTen.putExtra("oranges", "Oranges");
                startActivity(intentTen);

            }
        });
    }

    public void openMain(View view) {
        Intent intent = new Intent(ShoppingItems.this, MainActivity.class);
        startActivity(intent);
    }

    /**
     * toast method for faster toast
     * @param message
     */
    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
}

