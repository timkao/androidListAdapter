package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.my_simple_list, parent, false);
        }

        Word currentWord = getItem(position);

        TextView miTextView = (TextView) listItemView.findViewById(R.id.miwork);
        TextView enTextView = (TextView) listItemView.findViewById(R.id.english);

        miTextView.setText(currentWord.getMiworkTranslation());
        enTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
