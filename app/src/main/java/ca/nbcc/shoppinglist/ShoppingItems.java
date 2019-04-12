package ca.nbcc.shoppinglist;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Shaelyn Hooley
 * 04/12/19
 * ShoppingItems
 * This assignment represents my own
 * work and is in accordance with the College
 * Academic Policy.
 */
public class ShoppingItems extends AppCompatActivity {

    String name = "";

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
        btnCorn = (Button) findViewById(R.id.btnCorn);
        btnBacon = (Button) findViewById(R.id.btnBacon);
        btnOranges = (Button) findViewById(R.id.btnOranges);

        //set an on click listener for each button, send data to main activity, and and finish
        btnCheese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent returnIntent = getIntent();
                returnIntent.putExtra("cheese", 1);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();
            }
        });

        btnRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("rice", 2);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });

        btnApples.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("apples", 3);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });

        btnEggs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("eggs", 4);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });

        btnCereal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("cereal", 5);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });

        btnLettuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("lettuce", 6);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });

        btnBread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("bread", 7);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });

        btnBacon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("bacon", 8);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });

        btnCorn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("corn", 9);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });

        btnOranges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data to main activity
                Intent returnIntent = getIntent();
                returnIntent.putExtra("oranges", 10);
                setResult(Activity.RESULT_OK, returnIntent);
                finish();

            }
        });
    }

}

