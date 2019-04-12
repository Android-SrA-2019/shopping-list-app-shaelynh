package ca.nbcc.shoppinglist;

import android.app.Activity;
import android.app.Notification;
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

/**
 * Shaelyn Hooley
 * 04/12/19
 * Main Activity
 * This assignment represents my own
 * work and is in accordance with the College
 * Academic Policy.
 */
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
    private Button btnAdd;
    String itemResult;
    int count;
    private static final int requestCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        btnAdd = (Button) findViewById(R.id.btnAdd);

        //call second activity - shopping items
        Intent i = new Intent(this, ShoppingItems.class);
        //launching for different intents
        startActivityForResult(i, 1);
        startActivityForResult(i, 2);
        startActivityForResult(i, 3);
        startActivityForResult(i, 4);
        startActivityForResult(i, 5);
        startActivityForResult(i, 6);
        startActivityForResult(i, 7);
        startActivityForResult(i, 8);
        startActivityForResult(i, 9);
        startActivityForResult(i, 10);
    }

    //retrieve data, if the result code is ok, and the item resultcode matches, then add to the textview, increase the count
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (resultCode) {

            case 1:
                if (txtItemOne.getText().toString().isEmpty()) {
                    txtItemOne.setText(count + 1 + " " + itemResult);
                }
                break;

            case 2:
                if (txtItemTwo.getText().toString().isEmpty()) {
                    txtItemTwo.setText(count + 1 + " " + itemResult);
                }
                break;
            case 3:

                if (txtItemThree.getText().toString().isEmpty()) {
                    txtItemThree.setText(count + 1 + " " + itemResult);
                }
                break;
            case 4:
                if (txtItemFour.getText().toString().isEmpty()) {
                    txtItemFour.setText(count + 1 + " " + itemResult);
                }
                break;
            case 5:
                if (txtItemFive.getText().toString().isEmpty()) {
                    txtItemFive.setText(count + 1 + " " + itemResult);
                }
                break;
            case 6:
                if (txtItemSix.getText().toString().isEmpty()) {
                    txtItemSix.setText(count + 1 + " " + itemResult);
                }
                break;
            case 7:
                if (txtItemSeven.getText().toString().isEmpty()) {
                    txtItemSeven.setText(count + 1 + " " + itemResult);
                }
                break;
            case 8:
                if (txtItemEight.getText().toString().isEmpty()) {
                    txtItemEight.setText(count + 1 + " " + itemResult);
                }
                break;
            case 9:
                if (txtItemNine.getText().toString().isEmpty()) {
                    txtItemNine.setText(count + 1 + " " + itemResult);
                }
                break;
            case 10:
                if (txtItemTen.getText().toString().isEmpty()) {
                    txtItemTen.setText(count + 1 + " " + itemResult);
                }
                break;
        }
    }

//Save current state of shopping list, check if the bundle received
// is not empty, if not then save
@Override
public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        if(txtItemOne.getText().toString()!=null){
        outState.putString("result",txtItemOne.getText().toString());
        }
        if(txtItemTwo.getText().toString()!=null){
        outState.putString("result2",txtItemTwo.getText().toString());
        }
        if(txtItemThree.getText().toString()!=null){
        outState.putString("result3",txtItemThree.getText().toString());
        }
        if(txtItemFour.getText().toString()!=null){
        outState.putString("result4",txtItemFour.getText().toString());
        }
        if(txtItemFive.getText().toString()!=null){
        outState.putString("result5",txtItemFive.getText().toString());
        }
        if(txtItemSix.getText().toString()!=null){
        outState.putString("result6",txtItemSix.getText().toString());
        }
        if(txtItemSeven.getText().toString()!=null){
        outState.putString("result7",txtItemSeven.getText().toString());
        }
        if(txtItemEight.getText().toString()!=null){
        outState.putString("result8",txtItemEight.getText().toString());
        }
        if(txtItemNine.getText().toString()!=null){
        outState.putString("result9",txtItemNine.getText().toString());
        }
        if(txtItemNine.getText().toString()!=null){
        outState.putString("result10",txtItemNine.getText().toString());
        }
        }

//when user clicks the add button
public void openItems(View view){
        //open new activity
        Intent intent=new Intent(this,ShoppingItems.class);
        startActivity(intent);
        }

        }



