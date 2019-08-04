package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<Word> list = new ArrayList();
        list.add(new Word("one", "1", R.drawable.family_daughter, R.raw.smsalert));
        list.add(new Word("two", "2", R.drawable.family_father, R.raw.smsalert));
        list.add(new Word("three", "3", R.drawable.family_grandmother, R.raw.smsalert));

        WordAdapter adapter = new WordAdapter(this, list, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
