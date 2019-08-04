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

        ArrayList<Word> phrases = new ArrayList<>();
        phrases.add(new Word("miwork programming in c", "programming in c"));
        phrases.add(new Word("miwork learn python the hard way", "learn python in hard way"));
        phrases.add(new Word("miwork spring boot", "spring boot"));

        WordAdapter phrasesAdapter = new WordAdapter(this, phrases, R.color.category_phrases);
        ListView phrasesListview = new ListView(this);
        phrasesListview.setAdapter(phrasesAdapter);
        this.addContentView(phrasesListview, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

    }
}
