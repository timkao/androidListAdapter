package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int backGroundColorId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        backGroundColorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.my_simple_list, parent, false);
        }

        LinearLayout textSection = (LinearLayout) listItemView.findViewById(R.id.textSection);
        int color = ContextCompat.getColor(getContext(), backGroundColorId);
        textSection.setBackgroundColor(color);

        Word currentWord = getItem(position);

        TextView miTextView = (TextView) listItemView.findViewById(R.id.miwork);
        TextView enTextView = (TextView) listItemView.findViewById(R.id.english);
        ImageView imgView = (ImageView) listItemView.findViewById(R.id.smallIcon);

        miTextView.setText(currentWord.getMiworkTranslation());
        enTextView.setText(currentWord.getDefaultTranslation());
        if (currentWord.hasImageSrc()) {
            imgView.setImageResource(currentWord.getImageSrc());
        } else {
            imgView.setVisibility(View.INVISIBLE);
        }

        return listItemView;
    }
}
