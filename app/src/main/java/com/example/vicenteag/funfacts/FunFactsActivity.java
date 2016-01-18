package com.example.vicenteag.funfacts;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    //create an instantiate object
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //declare variables
        final TextView factLabel = (TextView) findViewById(R.id.txtvw_factView);
        final Button showFactButton = (Button) findViewById(R.id.btn_showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factLabel.setText(mFactBook.getFact());
                relativeLayout.setBackgroundColor(mColorWheel.getColor());
                showFactButton.setTextColor(mColorWheel.getColor());
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}