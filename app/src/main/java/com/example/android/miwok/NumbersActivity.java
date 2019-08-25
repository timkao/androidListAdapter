package com.example.android.miwok;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RemoteController;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity implements NumbersFragment.OnFragmentInteractionListeners {

    private final String TAG = "NumbersActivity";

    @Override
    public void onFragmentItemClick(int position){
        //you can leave it empty
        Log.d(TAG, "we have position " + position);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new NumbersFragment())
                .commit();

    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        if (fragment instanceof NumbersFragment) {
            NumbersFragment numbersFragment = (NumbersFragment) fragment;
            numbersFragment.setOnFragmentInteractionListeners(this); // turn my callback into the callback of my children fragment
        }

    }

}
