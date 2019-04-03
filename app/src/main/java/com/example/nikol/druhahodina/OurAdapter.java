package com.example.nikol.druhahodina;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OurAdapter extends ArrayAdapter { // extends -- znamená, že dědí

    // adapter konkrétně slouží k tomu, aby jsme určily pravidla datům jak se mají zobrazovat
    private final ArrayList<Animal> animals;
    private final Activity activity;

    public OurAdapter(Activity activity, ArrayList<Animal> animals){
        super(activity, R.layout.list_item,animals); // konstruktor nepřepíše díky super nic co originální konstruktor
        this.activity = activity;
        this.animals = animals;
    }
    //
    // nafukovač - aby se dostaly data do prvku v listu
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = activity.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_item,null, true);

        TextView title = ((View) rowView).findViewById(R.id.title);
        TextView info = ((View) rowView).findViewById(R.id.info);
        ImageView image = rowView.findViewById(R.id.image);

        title.setText(animals.get(position).name);
        info.setText(animals.get(position).info);
        image.setImageResource(animals.get(position).image);

        return rowView;

    }
}
