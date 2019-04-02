package com.example.nikol.druhahodina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Animal> animals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animals = new ArrayList<>();
        animals.add(new Animal(R.drawable.alligator, "Aligátor","je to skoro krokodýl" ));
        animals.add(new Animal(R.drawable.bear, "Medvěd", "Brum brum brum"));
        animals.add(new Animal(R.drawable.bee,"Včelka", "včely dávaj med"));
        animals.add(new Animal(R.drawable.elephant, "Slon", "Slůňata v zoo Praha"));
        animals.add(new Animal(R.drawable.butterfly, "Motýlek", "Monarchové jsou úžasní"));
        animals.add(new Animal(R.drawable.parrot, "Papoušek", "Ti sedávají pirátům na rameni"));
        animals.add(new Animal(R.drawable.dolphin, "Delfín", "Úžasný mořský savec"));

        OurAdapter adapter = new OurAdapter(this, animals);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

    }
}
