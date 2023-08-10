package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nameArray = {"Butterfly","Dolphin","Elephant","Kangaroo","Octopus","Turtle" };

    String[] infoArray = {
            "small body and colorful wings",
            "socially skilled, intelligent, joyful, and playful",
            "massive bodies, large ears, and long trunks",
            "the mouth is small, with prominent lips",
            " large head with eight attached arms",
            "Turtles don't have teeth"
    };

    Integer[] imageArray = {R.drawable.butterfly,
            R.drawable.dolphin,
            R.drawable.elephant,
            R.drawable.kangaroo,
            R.drawable.octopus,
            R.drawable.turtle};

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdaptor myAdaptor = new CustomListAdaptor(this, imageArray, nameArray, infoArray);
        listView = (ListView) findViewById(R.id.myLv);
        listView.setAdapter(myAdaptor);
    }
}