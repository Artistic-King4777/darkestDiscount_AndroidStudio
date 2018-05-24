package com.example.jojo.darkestdiscount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button klikker = findViewById(R.id.priceButton);
        final EditText price = findViewById(R.id.priceInput);
        final EditText discount = findViewById(R.id.percentDiscount);

        klikker.setOnClickListener(new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){

                        String priceOne = price.getText().toString(); // gets the contents of price
                        double priceTwo = Integer.parseInt(priceOne);
                        String discountOne = discount.getText().toString();
                        double discountTwo = Integer.parseInt(discountOne);

                        double disc = discountTwo/ 100;

                        double total = priceTwo - (priceTwo * disc);

                        klikker.setText(String.valueOf("$" + total));
//                        result.setText(String.valueOf(total)); //displays it in a text view

                    }
                }
        );


    }
}
