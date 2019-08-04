package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<String> phrases = new ArrayList<>();
        phrases.add("porgramming in c");
        phrases.add("learn python in hard way");
        phrases.add("spring boot in Java");

        ArrayAdapter<String> phrasesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, phrases);
        ListView phrasesListview = new ListView(this);
        phrasesListview.setAdapter(phrasesAdapter);
        this.addContentView(phrasesListview, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

    }
}
