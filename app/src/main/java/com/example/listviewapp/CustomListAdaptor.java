package com.example.listviewapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomListAdaptor extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the animal images
    private final Integer[] imageIDarray;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] infoArray;

    // the three parameters “nameArray”, “infoArray” and “imageIDArray” are there as they match the design we have in listview_row.xml.
    public CustomListAdaptor(Activity context, Integer[] imageIDarray, String[] nameArray, String[] infoArray) {
        super(context, R.layout.listview_row, nameArray);
        this.context = context;
        this.imageIDarray = imageIDarray;
        this.nameArray = nameArray;
        this.infoArray = infoArray;
    }

    /*This getView method basically maps the data from the properties (nameArray etc) to the write fields in the listview_row.xml design.*/
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.listview_row, null, true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameTextView);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoTextView);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;

    }

    ;

}
