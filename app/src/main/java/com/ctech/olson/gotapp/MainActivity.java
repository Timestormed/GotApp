package com.ctech.olson.gotapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button Arryn;
    private Button Baratheon;
    private Button Greyjoy;
    private Button Frey;
    private Button Lannister;
    private Button Martell;
    private Button Stark;
    private Button Tyrell;
    private Button Targaryen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Targaryen = (Button) findViewById(R.id.button9);
        Targaryen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseTargaryen();
            }
        });


        Tyrell = (Button) findViewById(R.id.button8);
        Tyrell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseTyrell();
            }
        });

        Stark = (Button) findViewById(R.id.button7);
        Stark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseStark();
            }
        });

        Martell = (Button) findViewById(R.id.button6);
        Martell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMartell();
            }
        });

        Lannister = (Button) findViewById(R.id.button5);
        Lannister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseLannister();
            }
        });

        Frey = (Button) findViewById(R.id.button3);
        Frey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseFrey();
            }
        });

        Greyjoy = (Button) findViewById(R.id.button4);
        Greyjoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseGreyjoy();
            }
        });

        Baratheon = (Button) findViewById(R.id.button2);
        Baratheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseBaratheon();
            }
        });


        Arryn = (Button) findViewById(R.id.button);
        Arryn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHouseArryn();
            }
        });
    }

    public void openHouseArryn() {
        Intent intent = new Intent(this, HouseArryn.class);
        startActivity(intent);
    }

    public void openHouseBaratheon() {
        Intent intent = new Intent(this, HouseBaratheon.class);
        startActivity(intent);
    }

    public void openHouseGreyjoy() {
        Intent intent = new Intent(this, HouseGreyjoy.class);
        startActivity(intent);
    }

    public void openHouseFrey() {
        Intent intent = new Intent(this, HouseFrey.class);
        startActivity(intent);
    }

    public void openHouseLannister() {
        Intent intent = new Intent(this, HouseLannister.class);
        startActivity(intent);
    }
    public void openMartell() {
        Intent intent = new Intent(this, Martell.class);
        startActivity(intent);
    }
    public void openHouseStark() {
        Intent intent = new Intent(this, HouseStark.class);
        startActivity(intent);
    }
    public void openHouseTyrell() {
        Intent intent = new Intent(this, HouseTyrell.class);
        startActivity(intent);
    }
    public void openHouseTargaryen() {
        Intent intent = new Intent(this, HouseTargaryen.class);
        startActivity(intent);
    }


}
