package com.example.android.miwok;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> wordlist = new ArrayList();
        wordlist.add(new Word("one", "1", R.drawable.family_daughter, R.raw.number_one));
        wordlist.add(new Word("two", "2", R.drawable.family_father, R.raw.number_two));
        wordlist.add(new Word("three", "3", R.drawable.family_grandmother, R.raw.number_three));

        WordAdapter adapter = new WordAdapter(this, wordlist, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Word currentWord = wordlist.get(position);
                    if (currentWord.hasAudSrc()) {
                        mediaPlayer = MediaPlayer.create(NumbersActivity.this, currentWord.getAudSrc());
                        mediaPlayer.start();
                    }
            }
        });


    }
}
