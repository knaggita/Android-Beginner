package com.knaggita.codestar.justjava;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    TextView mquantity;
    TextView  mtotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void increment(View view){
        quantity = quantity+1;        displayQuantity(quantity);


    }

    public void decrement(View view){
        if(quantity>0) {
            quantity = quantity - 1;
            displayQuantity(quantity);
        }else{
           displayQuantity(quantity);
        }

    }

    private void displayQuantity(int myquantity) {
        mquantity=((TextView)findViewById(R.id.value));
        mquantity.setText(myquantity+"");

    }

    public void submit(View view){
        int pricePerItem = 5;
        int totalPrice=pricePerItem*quantity;
        mtotal=(TextView)findViewById(R.id.total_value);
        mtotal.setText("$"+totalPrice);
    }


}
